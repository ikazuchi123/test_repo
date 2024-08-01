package com.merkle.GenAI.utils.constants.enums;

public enum CustomerSignOutStatusEnum {
    /**
     * 待处理
     */
    STAY_HANDLE(0, "待处理"),
    /**
     * 已处理
     */
    ALREADY_HANDLE(1, "已处理");

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

    CustomerSignOutStatusEnum(Integer status, String desc) {
        this.status = status;
        this.desc = desc;

    }

    public static String getDesc(Integer status) {
        for (CustomerSignOutStatusEnum caseStatus : values()) {
            if (caseStatus.getStatus().equals(status)) {
                return caseStatus.getDesc();
            }
        }
        return null;
    }

}
