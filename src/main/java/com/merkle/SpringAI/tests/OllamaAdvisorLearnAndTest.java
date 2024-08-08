package com.merkle.SpringAI.tests;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.PromptChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.QuestionAnswerAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
@RequestMapping("/test")
public class OllamaAdvisorLearnAndTest {

    @Autowired
    private OllamaChatModel ollamaChatModel;

    private static ChatClient chatClient;

//    private final ChatClient chatClient;

/*
    自动注入ChatClient的方法，默认会自动注入
    但是当需要多个chatmodel的时候就会出问题，在这个情况要在applicaiton.yml中配置
    spring:
      ai:
        chat:
          client:
            enabled: false
    来关闭自动注入。手动注入的方式如下
 */
//    @Autowired
//    public OllamaAdvisorLearnAndTest(ChatClient.Builder chatClientBuilder) {
//        this.chatClient = chatClientBuilder.build();
//    }

/*
    手动注入ChatClient。先自动注入一个chatmodel。
    然后把chat model包装成chatclient

 */
    @Autowired
    public void setChatClient(OllamaChatModel ollamaChatModel) {
        //方法1
        ChatClient.Builder builder = ChatClient.builder(ollamaChatModel);
        OllamaAdvisorLearnAndTest.chatClient = builder.build();
        //方法2
//        ChatClient chatClient = ChatClient.create(this.ollamaChatModel);
    }
//    @GetMapping("/ai")
//    String generation(@RequestParam(value = "message")String userInput) {
//        return this.chatClient.prompt()
//                .user(userInput)
//                .call()
//                .content();
//    }

/*
    severtal tests
    可以通过@Bean自定义name，并通过@Qualifier实现自定义注入
 */
//    @Autowired
//    @Qualifier("ollamaChatClientAlpha")
//    private ChatClient chatClientAlpha;
//
//    @Autowired
//    @Qualifier("ollamaChatClientBeta")
//    private ChatClient chatClientBeta;
//
//    @GetMapping("/chat1")
//    public String chat1(@RequestParam(value = "message") String message,@RequestParam(value = "type") String type) {
//        String result = "default result";
//        if ("海盗".equals(type)){
//            result = chatClientAlpha.prompt().user(message).call().content();
//        }else{
//            result = chatClientBeta.prompt().user(message).call().content();
//        }
//        return result;
//    }

/*
    new RAG test
    新的使用RAG的方式（而不是拼接prompt）
 */
//
//    @Autowired
//    private VectorStore vectorStore;
//
//    @Autowired
//    @Qualifier("ollamaChatClientGamma")
//    private ChatClient chatClientGamma;
//
//
//    @GetMapping("/chat1")
//    public ChatResponse chat1(@RequestParam(value = "message") String message) {
////        String result = "default result";
//
//        ChatResponse response = chatClientGamma
//                .prompt()
//                .advisors(new QuestionAnswerAdvisor(vectorStore, SearchRequest.defaults().withSimilarityThreshold(0.5)))
//                .user(message)
//                .call()
//                .chatResponse();
//
//        return response;
//    }

/*
    chat memory测试
    难点在于，chatmemory在生成后用于构建chatclient
    这意味着每一次会话chatclient都是新的，并且一直使用
 */
    @Autowired
    private VectorStore vectorStore;

//    @Autowired
//    @Qualifier("ollamaChatClientGamma")
    private ChatClient chatClientGamma;

    @Autowired
    OllamaAdvisorLearnAndTest(OllamaChatModel ollamaChatModel){
        ChatMemory chatMemory = new InMemoryChatMemory();
        ChatClient.Builder builder = ChatClient.builder(ollamaChatModel);
        this.chatClientGamma = builder.defaultSystem("你是一个友善的销售助手。请你根据提供的知识，回答客户的问题，向客户推荐他可能会感兴趣的产品。你只能根据提供的产品知识数据回答，当遇到你不知道的情况或知识不足的情况时，回答你不知道。记住，当客户没有主动想你索取购买链接时，不要主动提供购买链接。请你以像人类一样的风格回答客户的问题，不要每次回答过多的话。")
                .defaultAdvisors(new PromptChatMemoryAdvisor(chatMemory)).build();
    }
//    @Autowired
//    private ChatMemory memory;

    @GetMapping("/chat1")
    public ChatResponse chat1(@RequestParam(value = "message") String message) {
//        String result = "default result";

        ChatResponse response = chatClientGamma
                .prompt()
                .advisors(new QuestionAnswerAdvisor(vectorStore, SearchRequest.defaults().withSimilarityThreshold(0.5)))
                .user(message)
                .call()
                .chatResponse();

        return response;
    }








}
