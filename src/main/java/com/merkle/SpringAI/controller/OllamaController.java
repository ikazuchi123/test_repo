package com.merkle.SpringAI.controller;

import com.merkle.SpringAI.service.OllamaService;
import com.merkle.SpringAI.utils.Result;
import com.merkle.SpringAI.utils.constants.ExceptionConstants;
import com.merkle.SpringAI.utils.constants.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ollama")
public class OllamaController {

    @Autowired
    private OllamaService ollamaService;

    //基础 单句聊天
    @GetMapping("/chat")
    public Map<String, String> chat(@RequestParam(value = "message") String message) {
        String result = ollamaService.call(message);
        return Map.of("generation", result);
    }











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
