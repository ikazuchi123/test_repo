package com.merkle.SpringAI.service;

import com.merkle.SpringAI.dao.entity.MessagesEntity;
import com.merkle.SpringAI.dao.mapper.MessagesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessagesMapper messagesMapper;

    public List<MessagesEntity> searchMessagesByRoomId(Long roomId) {
        return messagesMapper.searchMessagesByRoomId(roomId);
    }

    public Integer recordMessage(String messages,Long roomId,Long fromUserId,Integer toUserId) {
//        Integer columns = messagesMapper.insert(messagesEntity);
        MessagesEntity message = new MessagesEntity();
        message.setCreatedAt(new Date());
        message.setUpdatedAt(new Date());
        message.setRoomId(roomId);
        message.setContent(messages);
        message.setUserId(fromUserId);
        message.setToUserId(toUserId);
        message.setType("Message");
        message.setLikeCount(0);
        message.setIsDelete(0);
        message.setIsWithdraw(0);
        message.setIsCard(1);
        message.setParentId(0);
        return messagesMapper.insert(message);
    }
}
