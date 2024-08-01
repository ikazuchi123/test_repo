package com.merkle.GenAI.controller;

import com.merkle.GenAI.utils.Result;
import com.merkle.GenAI.utils.constants.ExceptionConstants;
import com.merkle.GenAI.utils.constants.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ollama")
public class OllamaController {

//    @Autowired
//    private OllamaChatClient ollamaChatClient;

    @PostMapping("/hello")
    public Result helloWorld(){
        return success("Helloworld!");
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
