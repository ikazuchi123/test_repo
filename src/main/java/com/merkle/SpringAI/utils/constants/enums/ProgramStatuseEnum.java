package com.merkle.GenAI.utils.constants.enums;

public enum ProgramStatuseEnum {

    INACTIVE(0, "inactive"),
    ACTIVE(1, "active");

    private Integer status;
    private String desc;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    ProgramStatuseEnum(int status, String desc) {
        this.status = status;
        this.desc = desc;

    }

    public static ProgramStatuseEnum getValue(int status) {

        for (ProgramStatuseEnum programStatuseEnum : values()) {
            if (programStatuseEnum.getStatus() == status) {
                return programStatuseEnum;
            }
        }
        return null;
    }
}
