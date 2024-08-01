package com.merkle.GenAI.utils.constants.enums;

public enum MessageTypeEnum {

    SEND_TO_RETAILER(1, "send to retailer"),

    SEND_TO_CUSTOMER(2, "send to consumer"),

    SEND_TO_SUB_RETAILER(3, "send to sub retailer");

    private Integer type;

    private String desc;

    MessageTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
