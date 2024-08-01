package com.merkle.GenAI.utils.constants.enums;

public enum CustomerCaseStatusEnum {

    /**
     * pending to submit
     */
    PENDING_TO_SUBMIT(1, "pending to submit"),
    /**
     * in progress(ENT,BOK,EOK,ROK,REL,REA)
     */
    IN_PROGRESS(2, "in progress"),
    /**
     * paid (TODO)
     */
    PAID(3, "paid"),
    /**
     * rejected(TODO)
     */
    REJECTED(4, "rejected"),
    /**
     * expired
     */
    EXPIRED(5, "expired"),

    /**
     * completed(INV)
     */
    COMPLETED(6, "completed"),

    /**
     * withdraw
     */
    WITHDRAW(7, "withdraw"),

    /**
     * deleted
     */
    DELETED(8, "deleted"),

    /**
     * pending to approve
     */
    PENDING_TO_APPROVE(9, "pending approval"),

    /**
     * approved by sales
     */
    APPROVED_BY_SALES(10, "approved"),

    /**
     * rejected by sales
     */
    REJECTED_BY_SALES(11, "rejected"),

    UNKNOWN(999, "unknown");

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

    CustomerCaseStatusEnum(Integer status, String desc) {
        this.status = status;
        this.desc = desc;

    }

    public static String getDesc(Integer status) {
        for (CustomerCaseStatusEnum caseStatus : values()) {
            if (caseStatus.getStatus().equals(status)) {
                return caseStatus.getDesc();
            }
        }
        return null;
    }


}
