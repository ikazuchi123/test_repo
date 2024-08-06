package com.merkle.SpringAI.dataaccess.impl;

import com.merkle.SpringAI.dao.entity.MessageEntity;
import com.merkle.SpringAI.dao.mapper.MessageMapper;
import com.merkle.SpringAI.dataaccess.MessageAccess;
import com.merkle.SpringAI.utils.dataaccess.impl.BaseServiceDataAccessImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 消息 服务实现类
 * </p>
 *
 * @author Ikazuchi
 * @since 2024-08-06
 */
@Service
public class MessageAccessImpl extends BaseServiceDataAccessImpl<MessageMapper, MessageEntity> implements MessageAccess {

}
