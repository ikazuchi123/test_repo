package com.merkle.SpringAI.controller;

import com.merkle.SpringAI.dao.entity.MessagesEntity;
import com.merkle.SpringAI.service.MessageService;
import com.merkle.SpringAI.service.OllamaService;
import com.merkle.SpringAI.utils.Result;
import com.merkle.SpringAI.utils.constants.ExceptionConstants;
import com.merkle.SpringAI.utils.constants.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/messages")
public class MessagesController {
    @Autowired
    private MessageService messageService;

    //基础 单句聊天
    @GetMapping("/getHistory")
    public Result chat(@RequestParam(value = "room_id") Long roomId) {
        List<MessagesEntity> result = messageService.searchMessagesByRoomId(roomId);
        return success(result);
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
