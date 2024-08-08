package com.merkle.SpringAI.dao.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.merkle.SpringAI.entity.MybatisBaseEntity;
import lombok.Data;

/**
 * <p>
 * 消息
 * </p>
 *
 * @author Ikazuchi
 * @since 2024-08-05
 */
@Data
@TableName("messages")
public class MessagesEntity extends MybatisBaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 消息内容
     */
    @TableField("content")
    private String content;

    /**
     * room ID
     */
    @TableField("room_id")
    private Long roomId;

    /**
     * User ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 接收人
     */
    @TableField("to_user_id")
    private Integer toUserId;

    /**
     * 类型
     */
    @TableField("type")
    private String type;

    /**
     * 点赞数
     */
    @TableField("like_count")
    private Integer likeCount;

    /**
     * 删除
     */
    @TableField("is_delete")
    private Integer isDelete;

    /**
     * 撤回
     */
    @TableField("is_withdraw")
    private Integer isWithdraw;

    /**
     * 卡片
     */
    @TableField("is_card")
    private Integer isCard;

    /**
     * 对象id
     */
    @TableField("parent_id")
    private Integer parentId;

    /**
     * 对象类型
     */
    @TableField("parent_type")
    private String parentType;

    public Long getRoomId(){
        return this.roomId;
    }
}
