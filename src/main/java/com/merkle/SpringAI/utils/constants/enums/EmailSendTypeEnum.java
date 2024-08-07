package com.merkle.SpringAI.utils.constants.enums;

public enum EmailSendTypeEnum {
    // 订单变动发送邮件
    ORDER_STATUS_CHANGE(1, "when 2.0 order status changed");

    private final Integer type;
    private final String description;

    EmailSendTypeEnum(Integer type, String description) {
        this.type = type;
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
