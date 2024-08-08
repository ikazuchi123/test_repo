package com.merkle.SpringAI.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.merkle.SpringAI.dao.entity.MessageEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 消息 Mapper 接口
 * </p>
 *
 * @author Ikazuchi
 * @since 2024-08-06
 */
@Mapper
public interface MessageMapper extends BaseMapper<MessageEntity> {
//    Integer recordMessage(MessagesEntity messagesEntity);
}
