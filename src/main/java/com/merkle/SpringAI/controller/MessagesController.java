package com.merkle.SpringAI.controller;



import com.merkle.SpringAI.dao.entity.MessagesEntity;
import com.merkle.SpringAI.dao.mapper.MessagesMapper;
import com.merkle.SpringAI.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 消息 前端控制器
 * </p>
 *
 * @author Ikazuchi
 * @since 2024-08-05
 */
@Controller
@RequestMapping("/messages")
public class MessagesController {
    @Autowired
    private MessagesMapper mapper;

    @Autowired
    private MessageService service;

    /*
    List<MessagesEntity> searchMessagesByRoomId(Long roomId);
    <select id="searchMessagesByRoomId" resultType="com.merkle.SpringAI.dao.entity.MessagesEntity">
        SELECT *
        FROM messages
        <where>
            room_id = #{ room_id }
            AND is_delete = 0
        </where>
        ORDER BY created_at DESC
        LIMIT 20
    </select>
     */
    @RequestMapping("/findByRoomId")
    @ResponseBody
    public List<MessagesEntity> findByRoomId(@RequestParam(name = "roomId")Long roomId) {
        return mapper.searchMessagesByRoomId(roomId);
    }

    @RequestMapping("/testInsert")
    @ResponseBody
    public Integer insert() {
        MessagesEntity message = new MessagesEntity();
        message.setCreatedAt(new Date());
        message.setUpdatedAt(new Date());
        message.setRoomId(999999L);
        message.setContent("测试消息helloworld");
        message.setUserId(999L);
        message.setToUserId(999);
        message.setType("Message");
        message.setLikeCount(0);
        message.setIsDelete(0);
        message.setIsWithdraw(0);
        message.setIsCard(1);
        message.setParentId(0);
        System.out.println(message.getClass());
        System.out.println(message.getContent());
        message.getRoomId();
        return mapper.insert(message);
    }


}

