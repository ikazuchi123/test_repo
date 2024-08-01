package com.merkle.GenAI.utils.constants.enums;

public enum CustomerTyreRegistrationProgramStatusEnum {

    ACTIVE(1, " active"),

    EXPIRED(3, "expired "),

    CASE_FILED(2, "case filed"),

    DISCARDED(7, "discarded");

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

    CustomerTyreRegistrationProgramStatusEnum(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public static CustomerTyreRegistrationProgramStatusEnum getValue(int status) {

        for (CustomerTyreRegistrationProgramStatusEnum ctrStatus : values()) {
            if (ctrStatus.getStatus() == status) {
                return ctrStatus;
            }
        }
        return null;
    }
}
