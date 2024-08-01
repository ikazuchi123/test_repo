package com.merkle.GenAI.utils.constants.enums;

public enum UserActivityReferenceTypeEnum {

    USERS(100, "users"),

    RETAILERS(200, "retailers"),

    CONSUMERS(300, "consumers");

    private Integer type;

    private String desc;

    UserActivityReferenceTypeEnum(Integer type, String desc) {
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
