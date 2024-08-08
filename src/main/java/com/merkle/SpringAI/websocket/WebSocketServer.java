package com.merkle.SpringAI.websocket;


import com.merkle.SpringAI.service.DocumentService;
import com.merkle.SpringAI.service.MessageService;
import jakarta.websocket.*;
import jakarta.websocket.server.PathParam;
import jakarta.websocket.server.ServerEndpoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.PromptChatMemoryAdvisor;
import org.springframework.ai.chat.client.advisor.QuestionAnswerAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@Component
@Slf4j
@Service
@ServerEndpoint("/api/websocket/{sid}")
public class WebSocketServer {

//    @Autowired
//    private static OllamaChatClient chatClient;
//
//    @Autowired
//    private void setChatClient(OllamaChatClient chatClient){
//        WebSocketServer.chatClient = chatClient;
//    }


    private  ChatClient chatClient;

    private static VectorStore vectorStore;
    @Autowired
    private void setVectorStore(VectorStore vectorStore){
        WebSocketServer.vectorStore = vectorStore;
    }

    private static OllamaChatModel ollamaChatModel;
    @Autowired
    private void setOllamaChatModel(OllamaChatModel ollamaChatModel){
        WebSocketServer.ollamaChatModel = ollamaChatModel;
    }

    private static DocumentService documentService;
    @Autowired
    private void setDocumentService(DocumentService documentService){
        WebSocketServer.documentService = documentService;
    }

    private static MessageService messageService;
    @Autowired
    private void setMessageService(MessageService messageService){
        WebSocketServer.messageService = messageService;
    }


    //静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
    private static int onlineCount = 0;
    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
    private static CopyOnWriteArraySet<WebSocketServer> webSocketSet = new CopyOnWriteArraySet<>();

    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;

    //接收sid
    private String sid = "";

    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("sid") String sid) {
        //新加入内容——————————————————————————————————————————————————————————————
        ChatMemory chatMemory = new InMemoryChatMemory();
        ChatClient.Builder builder = ChatClient.builder(ollamaChatModel);
        this.chatClient = builder.defaultSystem("你是一个友善的销售助手。请你根据提供的知识，回答客户的问题，向客户推荐他可能会感兴趣的产品。你只能根据提供的产品知识数据回答，当遇到你不知道的情况或知识不足的情况时，回答你不知道。当你认为提供的知识与用户的问题不相关时，忽视那些知识。记住，当客户没有主动想你索取购买链接时，不要主动提供购买链接。请你以像人类一样的风格回答客户的问题，不要每次回答过多的话。")
                .defaultAdvisors(new PromptChatMemoryAdvisor(chatMemory)).build();
        //新加入内容end———————————————————————————————————————————————————————————
        this.session = session;
        webSocketSet.add(this);     //加入set中
        this.sid = sid;
        addOnlineCount();           //在线数加1
        try {
            sendMessage("conn_success");
            log.info("有新窗口开始监听:" + sid + ",当前在线人数为:" + getOnlineCount());
        } catch (IOException e) {
            log.error("websocket IO Exception");
        }
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        webSocketSet.remove(this);  //从set中删除
        subOnlineCount();           //在线数减1
        //断开连接情况下，更新主板占用情况为释放
        log.info("释放的sid为："+sid);
        //这里写你 释放的时候，要处理的业务
        log.info("有一连接关闭！当前在线人数为" + getOnlineCount());

    }

    /**
     * 收到客户端消息后调用的方法
     * @ Param message 客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        log.info("收到来自窗口" + sid + "的信息:" + message);
        Long room_id = Long.parseLong(sid);
        System.out.println("记录提问信息: " + message);
//        messageService.recordMessage(message,room_id,room_id,0);

        System.out.println(chatClient.toString());
//        String result = documentService.chat_with_record(message,room_id);
        ChatResponse response = chatClient
                .prompt()
                .advisors(new QuestionAnswerAdvisor(vectorStore, SearchRequest.defaults().withSimilarityThreshold(0.5)))
                .user(message)
                .call()
                .chatResponse();
        //群发消息
//        for (WebSocketServer item : webSocketSet) {
//            try {
//                item.sendMessage(message);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        try {
            session.getBasicRemote().sendText(response.getResult().getOutput().getContent());
        }catch (Exception e){
            log.error("消息推送失败");
        }

        //单发回复消息
    }

    /**
     * @ Param session
     * @ Param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        log.error("发生错误");
        error.printStackTrace();
    }

    /**
     * 实现服务器主动推送
     */
    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }

    /**
     * 群发自定义消息
     */
    public static void sendInfo(String message, @PathParam("sid") String sid) throws IOException {
        log.info("推送消息到窗口" + sid + "，推送内容:" + message);

        for (WebSocketServer item : webSocketSet) {
            try {
                //这里可以设定只推送给这个sid的，为null则全部推送
                if (sid == null) {
//                    item.sendMessage(message);
                } else if (item.sid.equals(sid)) {
                    item.sendMessage(message);
                }
            } catch (IOException e) {
                continue;
            }
        }
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        WebSocketServer.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        WebSocketServer.onlineCount--;
    }

    public static CopyOnWriteArraySet<WebSocketServer> getWebSocketSet() {
        return webSocketSet;
    }
}
