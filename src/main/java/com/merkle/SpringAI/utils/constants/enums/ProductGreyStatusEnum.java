package com.merkle.GenAI.utils.constants.enums;

/**
 * @Desc:
 */
public enum ProductGreyStatusEnum {

    GREY_INACTIVE(0, "this rule is not active"),
    GREY_ACTIVE(1, "this rule is active");

    ProductGreyStatusEnum(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    private final  Integer status;
    private final  String desc;

    public Integer getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }
}
