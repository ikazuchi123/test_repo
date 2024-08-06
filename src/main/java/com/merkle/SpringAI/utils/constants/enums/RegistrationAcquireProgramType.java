package com.merkle.SpringAI.utils.constants.enums;

public enum RegistrationAcquireProgramType {

    ALL_ACQUIRE_PROGRAM(1, "all"),

    PARTIAL_ACQUIRE_PROGRAM(2, "partial"),

    NONE_ACQUIRE_PROGRAM(3, "none");


    RegistrationAcquireProgramType(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    private Integer type;

    private String desc;

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
