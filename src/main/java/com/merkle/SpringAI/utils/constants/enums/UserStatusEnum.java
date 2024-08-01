package com.merkle.GenAI.utils.constants.enums;

public enum UserStatusEnum {

    ACTIVE(1, "active"),

    INACTIVE(0, "inactive"),

    DELETE(3, "delete");

    private Integer type;

    private String desc;

    UserStatusEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }


    public static String getDescByType(Integer type) {
        for (UserStatusEnum userStatus : values()) {
            if (userStatus.getType().equals(type)) {
                return userStatus.getDesc();
            }
        }
        return null;
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
