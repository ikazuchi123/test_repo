package com.merkle.SpringAI.utils.constants.enums;

public enum CustomerTyreRegistrationStatusEnum {

    ACTIVE(1, " active"),
    CASE_FILED(2, "Case Filed"),
    EXPIRED(3, "expired "),
    VALIDATE(4, "in validating"),
    VALIDATE_FAILED(5, "validate failed"),
    DEPENDENCY_VALIDATE(6, "dependency validate"),

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

    CustomerTyreRegistrationStatusEnum(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public static CustomerTyreRegistrationStatusEnum getValue(int status) {

        for (CustomerTyreRegistrationStatusEnum ctrStatus : values()) {
            if (ctrStatus.getStatus() == status) {
                return ctrStatus;
            }
        }
        return null;
    }
}
