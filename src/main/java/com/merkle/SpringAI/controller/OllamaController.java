package com.merkle.SpringAI.controller;



import com.merkle.SpringAI.service.DummyDataService;
import com.merkle.SpringAI.service.OllamaService;
import com.merkle.SpringAI.utils.Result;
import com.merkle.SpringAI.utils.constants.ExceptionConstants;
import com.merkle.SpringAI.utils.constants.ResultMsg;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ollama")
public class OllamaController {

    @Autowired
    private DummyDataService dummyDataService;

    @Autowired
    private OllamaService ollamaService;

    //基础 单句聊天
    @GetMapping("/chat")
    public Map<String, String> chat(@RequestParam(value = "message") String message) {
        String result = ollamaService.call(message);
        return Map.of("generation", result);
    }

    //function call聊天
    @GetMapping("/chat_function_call")
    public ChatResponse chat_function_call(@RequestParam(value = "message") String message) {
        ChatResponse response = ollamaService.callWithFuntionCall(message);
        return response;
    }

//
//    @GetMapping("/chat")
//    public String generate(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
//            return chatClient.prompt().user(message).call().content();
//        return Map.of("generation", chatModel.call(message));
//    }


//    @GetMapping("/ai/dummy")
//    public List<DummyDataService.MS> testDummyData(@RequestParam(value = "pilot") String pilot){
//        return dummyDataService.searchMsByName(new DummyDataService.Pilot(pilot));
//    }

//    @GetMapping("/ai/chat_with_func")
//    public Map chat_with_func(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
//        String result = chatClient.call(
//                new Prompt(List.of(message),
//                        OllamaOptions.builder().withFunction("CurrentWeather").build())
//        );
//        return Map.of("generation", result);
//    }















    /**
     * @param data response body
     * @return
     */
    public Result success(Object data) {
        return new Result(ExceptionConstants.SUCCESS, ResultMsg.SUCCESS, Boolean.TRUE, data);
    }

    /**
     * @param data response body
     * @return
     */
    public Result success() {
        return new Result(ExceptionConstants.SUCCESS, ResultMsg.SUCCESS, Boolean.TRUE, true);
    }

    /**
     * @param data      response body
     * @param errorCode
     * @param errorMsg
     * @return
     */
    public Result error(Object data, int errorCode, String errorMsg) {
        return new Result(errorCode, errorMsg, Boolean.FALSE, data);
    }
}
