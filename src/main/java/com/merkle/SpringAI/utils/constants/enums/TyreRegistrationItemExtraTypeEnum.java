package com.merkle.GenAI.utils.constants.enums;

/**
 * @Desc:
 */
public enum TyreRegistrationItemExtraTypeEnum {

    TYRE_ITEM_OUTBOUNDINFO_TYPE(1, "refer to customer_registration_id");

    private Integer type;
    private String desc;

    TyreRegistrationItemExtraTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
