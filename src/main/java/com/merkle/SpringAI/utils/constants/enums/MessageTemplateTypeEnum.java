package com.merkle.GenAI.utils.constants.enums;

/**
 * @Desc: 区分不同的消息模板
 */
public enum MessageTemplateTypeEnum {

    TEMPLATE_FEEDBACK(0, "feedback"),
    TEMPLATE_COUPON(1, "coupon"),
    TEMPLATE_CASE_REUPLOAD_IMAGE(2, "upload case image"),
    TEMPLATE_LOYALTY(3, "loyalty notification");

    private Integer type;
    private String desc;

    MessageTemplateTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }
    public String getDesc() {
        return desc;
    }

}
