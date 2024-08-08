package com.merkle.SpringAI.service;



import cn.hutool.core.util.ArrayUtil;
import org.springframework.ai.chat.client.advisor.PromptChatMemoryAdvisor;
import org.springframework.ai.document.Document;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.vectorstore.PgVectorStore;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.FileUrlResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.net.MalformedURLException;

import static com.merkle.SpringAI.service.ParagraphTextReader.END_PARAGRAPH_NUMBER;
import static com.merkle.SpringAI.service.ParagraphTextReader.START_PARAGRAPH_NUMBER;


/**
 * @Description: 文档服务
 * @Author: jay
 * @Date: 2024/3/18 10:02
 * @Version: 1.0
 */
@Service
public class DocumentService {

	@Autowired
	private VectorStore vectorStore;

	@Autowired
	private OllamaChatModel ollamaChatModel;

	@Autowired
	private MessageService messageService;
//	private static final String PATH = "D:\\demo\\ai\\path\\";
	private static final String PATH = "\\Users\\sding02\\Desktop\\workspace\\txts\\";


	/**
	 * 使用spring ai解析txt文档
	 *
	 * @param file
	 * @throws MalformedURLException
	 */
//	public void uploadDocument(MultipartFile file) {
	public void uploadDocument() {
//		//保存file到本地
//		String textResource = file.getOriginalFilename();
//		//判断文件是否是TXT
//		if (!textResource.endsWith(".txt")) {
//			throw new RuntimeException("只支持txt格式文件");
//		}
//		String filepath = PATH + textResource;
//		File file1 = new File(filepath);
//		if (file1.exists()) {
//			throw new RuntimeException("文件已存在");
//		}
//		try {
//			file.transferTo(file1);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		String filepath = "/Users/sding02/Desktop/workspace/txts/test_data.txt";
		//新增
		File file1 = new File(filepath);
		System.out.println("文件读取成功");
		List<Document> documentList = paragraphTextReader(file1);
		vectorStore.add(documentList);
	}

	private List<Document> paragraphTextReader(File file) {
		List<Document> docs = null;
		try {
			ParagraphTextReader reader = new ParagraphTextReader(new FileUrlResource(file.toURI().toURL()), 5);
			reader.getCustomMetadata().put("filename", file.getName());
			reader.getCustomMetadata().put("filepath", file.getAbsolutePath());
			docs = reader.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return docs;
	}

	/**
	 * 合并文档列表
	 *
	 * @param documentList 文档列表
	 * @return 合并后的文档列表
	 */
	private List<Document> mergeDocuments(List<Document> documentList) {
		List<Document> mergeDocuments = new ArrayList();
		//根据文档来源进行分组
		Map<String, List<Document>> documentMap = documentList.stream().collect(Collectors.groupingBy(item -> ((String) item.getMetadata().get("source"))));
		for (Map.Entry<String, List<Document>> docListEntry : documentMap.entrySet()) {
			//获取最大的段落结束编码
			int maxParagraphNum = (int) docListEntry.getValue()
					.stream().max(Comparator.comparing(item -> ((int) item.getMetadata().get(END_PARAGRAPH_NUMBER)))).get().getMetadata().get(END_PARAGRAPH_NUMBER);
			//根据最大段落结束编码构建一个用于合并段落的空数组
			String[] paragraphs = new String[maxParagraphNum];
			//用于获取最小段落开始编码
			int minParagraphNum = maxParagraphNum;
			for (Document document : docListEntry.getValue()) {
				//文档内容根据回车进行分段
				String[] tempPs = document.getContent().split("\n");
				//获取文档开始段落编码
				int startParagraphNumber = (int) document.getMetadata().get(START_PARAGRAPH_NUMBER);
				if (minParagraphNum > startParagraphNumber) {
					minParagraphNum = startParagraphNumber;
				}
				//将文档段落列表拷贝到合并段落数组中
				System.arraycopy(tempPs, 0, paragraphs, startParagraphNumber - 1, tempPs.length);
			}
			//合并段落去除空值,并组成文档内容
			Document mergeDoc = new Document(ArrayUtil.join(ArrayUtil.removeNull(paragraphs), "\n"));
			//合并元数据
			mergeDoc.getMetadata().putAll(docListEntry.getValue().get(0).getMetadata());
			//设置元数据:开始段落编码
			mergeDoc.getMetadata().put(START_PARAGRAPH_NUMBER, minParagraphNum);
			//设置元数据:结束段落编码
			mergeDoc.getMetadata().put(END_PARAGRAPH_NUMBER, maxParagraphNum);
			mergeDocuments.add(mergeDoc);
		}
		return mergeDocuments;
	}

	/**
	 * 根据关键词搜索向量库
	 *
	 * @param keyword 关键词
	 * @return 文档列表
	 */
	public List<Document> search(String keyword) {
		return mergeDocuments(vectorStore.similaritySearch(SearchRequest.query(keyword).withTopK(4).withSimilarityThreshold(0.5)));
	}

	/**
	 * 问答,根据输入内容回答
	 *
	 * @param message 输入内容
	 * @return 回答内容
	 */
	public String chat(String message) {
		//查询获取文档信息
		List<Document> documents = search(message);

		//提取文本内容
		String content = documents.stream()
				.map(Document::getContent)
				.collect(Collectors.joining("\n"));

		//封装prompt并调用大模型
		String chatResponse = ollamaChatModel.call(getChatPrompt2String(message, content));
		return chatResponse;
	}

	/**
	 * 问答,根据输入内容回答
	 *
	 * @param message 输入内容
	 * @return 回答内容
	 */
	public String chat_with_record(String message,Long room_id) {
		//查询获取文档信息
		List<Document> documents = search(message);
		System.out.println(documents);

		//提取文本内容
		String content = documents.stream()
				.map(Document::getContent)
				.collect(Collectors.joining("\n"));

		//封装prompt并调用大模型
		String chatResponse = ollamaChatModel.call(getChatPrompt2StringVerSaler(message, content));
		System.out.println("记录LLM回复信息：" + chatResponse);
		messageService.recordMessage(chatResponse,room_id,0L,room_id.intValue());
		return chatResponse;
	}

	/**
	 * 获取prompt
	 *
	 * @param message 提问内容
	 * @param context 上下文
	 * @return prompt
	 */
	private String getChatPrompt2String(String message, String context) {
		String promptText = """
				请用仅用以下内容回答"%s":
				%s
				""";
		return String.format(promptText, message, context);
	}

	private String getChatPrompt2StringVerSaler(String message, String context) {
//		String template = "你是一个销售员，请你站在一个美妆销售员的角度，回答客户的问题，向客户推荐他可能感兴趣的商品。" +
//				"";
		String promptText = """
				你是一名AI销售员,专门负责回答顾客关于商品的问题并推荐适合的商品。你可以参考后面的商品知识。你的回答应该简明扼要,针对性强,并能有效地推荐最合适的商品，当你不知道问题的答案，或商品知识不足时，请说你不知道。请以友好、专业的口吻来回答顾客的问题,并为顾客提供满意的购物体验。注意！除非客户要求展示购买链接，否则不要在回答中展现任何链接。顾客的问题："%s"。你可以参考的商品知识:
				%s
				""";


		return String.format(promptText, message, context);
	}

	private String getChatPrompt2StringVerSalerWithMemory(String message, String context) {
//		String template = "你是一个销售员，请你站在一个美妆销售员的角度，回答客户的问题，向客户推荐他可能感兴趣的商品。" +
//				"";
		String promptText = """
				你是一名AI销售员,专门负责回答顾客关于商品的问题并推荐适合的商品。你可以并且只可以使用后面的商品知识回答客户问题。你的回答应该简明扼要,针对性强,并能有效地推荐最合适的商品，当你不知道问题的答案，或商品知识不足时，请说你不知道。请以友好、专业的口吻来回答顾客的问题,并为顾客提供满意的购物体验。注意！除非客户要求展示购买链接，否则不要在回答中展现任何链接。顾客的问题："%s"。你可以参考的商品知识:
				%s
				""";

//		new PromptChatMemoryAdvisor()
		return String.format(promptText, message, context);
	}
}
