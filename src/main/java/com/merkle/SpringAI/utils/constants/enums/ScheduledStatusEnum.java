package com.merkle.SpringAI.utils.constants.enums;

/**
 * @author Enoch cao
 */

public enum ScheduledStatusEnum {
    /**
     * invalid
     */
    INVALID(1, "invalid"),

    PENDING(2, "pending"),

    SUCCESS(3, "success"),
    /**
     * 0 ~ total success
     */
    PARTIAL_SUCCESS(4, "practical_success"),
    /**
     * only exception
     */
    FAIL(5, "fail");

    private Integer type;

    private String desc;

    ScheduledStatusEnum(Integer type, String desc) {
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
