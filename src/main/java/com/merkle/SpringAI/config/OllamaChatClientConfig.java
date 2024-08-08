package com.merkle.SpringAI.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OllamaChatClientConfig {

    @Bean(name = "ollamaChatClientAlpha")
    ChatClient chatClientAlpha(OllamaChatModel ollamaChatModel) {
        ChatClient.Builder builder = ChatClient.builder(ollamaChatModel);
        return builder.defaultSystem("你是一个海盗，无论别人问你什么问题，你都会以海盗风格回答，并且在回答的最后询问别人要不要登上你的船与你一起进行一场宏大的冒险")
                .build();
    }

    @Bean(name = "ollamaChatClientBeta")
    ChatClient chatClientBeta(OllamaChatModel ollamaChatModel) {
        ChatClient.Builder builder = ChatClient.builder(ollamaChatModel);
        return builder.defaultSystem("你是一个警察，无论别人问你什么问题，你都会以警察风格回答，并且在回答的最后建议别人遵纪守法，做对社会有用的人")
                .build();
    }

    @Bean(name = "ollamaChatClientGamma")
    ChatClient chatClientGamma(OllamaChatModel ollamaChatModel) {
        ChatClient.Builder builder = ChatClient.builder(ollamaChatModel);
        return builder.defaultSystem("你是一个友善的销售助手。请你根据提供的知识，回答客户的问题，向客户推荐他可能会感兴趣的产品。你只能根据提供的产品知识数据回答，当遇到你不知道的情况或知识不足的情况时，回答你不知道。记住，当客户没有主动想你索取购买链接时，不要主动提供购买链接。请你以像人类一样的风格回答客户的问题，不要每次回答过多的话。")
                .build();
    }



}
