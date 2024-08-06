package com.merkle.SpringAI.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MybatisBaseEntity implements Serializable {
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 修改时间
     */
    @TableField(value = "created_at", fill = FieldFill.INSERT)
    private Date createdAt;
    /**
     * 更新时间
     */
    @TableField(value = "updated_at", fill = FieldFill.INSERT_UPDATE)
    private Date updatedAt;
    /**
     * 删除标签 1:已删除 0：未删除
     */
//    @TableField("deleted")
//    @TableLogic
//    private Boolean deleted = false;
//    /**
//     * 删除时间
//     */
//    @TableField("deleted_at")
//    private Date deletedAt;
}
