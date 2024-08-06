package com.merkle.SpringAI.controller;


import com.merkle.SpringAI.dao.mapper.MessageMapper;
import com.merkle.SpringAI.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 消息 前端控制器
 * </p>
 *
 * @author Ikazuchi
 * @since 2024-08-06
 */
@Controller
@RequestMapping("/test")
public class MessageController {
    @Autowired
    private MessageMapper mapper;

    @PostMapping("/a")
    public Integer test(){
        mapper.selectById(1L);
        return 1;
    }

}

