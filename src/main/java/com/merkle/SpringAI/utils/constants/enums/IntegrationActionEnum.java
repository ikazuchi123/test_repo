package com.merkle.GenAI.utils.constants.enums;

public enum IntegrationActionEnum {

    SMS(1, "sms service integration"),

    IN_MCAT(2, "india mcat integration log");

    private Integer type;

    private String desc;

    IntegrationActionEnum(Integer type, String desc) {
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
