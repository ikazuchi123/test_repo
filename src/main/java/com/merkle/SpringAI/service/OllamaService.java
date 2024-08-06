package com.merkle.SpringAI.service;

import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OllamaService {
/*
    旧版本Spring AI的 Ollama Client
 */
//    private static ChatClient chatClient;
//
//    @Autowired
//    private void setChatClient(ChatClient chatClient){
//        OllamaService.chatClient = chatClient;
//    }

    private final OllamaChatModel ollamaChatModel;

    @Autowired
    public OllamaService(OllamaChatModel ollamaChatModel) {
        this.ollamaChatModel = ollamaChatModel;
    }

    public String call(String message){
        String response = ollamaChatModel.call(message);
        return response;
    }

    public ChatResponse callWithFuntionCall(String message){
        String test_data1 = "Which mobile suits has 阿姆罗 piloted before?";
        String test_data2 = "Is 夜莺 a mobile suit that 阿姆罗 has piloted before?";

        UserMessage userMessage = new UserMessage(message);
        ChatResponse response = ollamaChatModel.call(
                new Prompt(List.of(userMessage),
                        OllamaOptions.builder().withFunction("searchMobileSuitByPilot").build())
        );
        return response;
    }


//    String getMsBy(String authorName) {
//        var userPromptTemplate = "What Gundam driven by {pilot} are available to attack?";
//        return chatClient.prompt()
//                .user(userSpec -> userSpec
//                        .text(userPromptTemplate)
//                        .param("author", authorName)
//                )
//                .functions("booksByAuthor")
//                .call()
//                .content();
//    }
}
