package com.merkle.SpringAI.utils.constants.enums;

public enum UserActivityActionEnum {

    INSERT(0, "insert"),

    UPDATE(1, "update"),

    DELETE(2, "delete");

    private Integer type;

    private String desc;

    UserActivityActionEnum(Integer type, String desc) {
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
