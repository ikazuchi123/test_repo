package com.merkle.SpringAI.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.merkle.SpringAI.dao.entity.MessagesEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 消息 Mapper 接口
 * </p>
 *
 * @author Ikazuchi
 * @since 2024-08-05
 */
@Mapper
public interface MessagesMapper extends BaseMapper<MessagesEntity> {

    List<MessagesEntity> searchMessagesByRoomId(Long roomId);

//    @Override
//    int insert(MessagesEntity entity);
    Integer recordMessage(MessagesEntity messagesEntity);
}
