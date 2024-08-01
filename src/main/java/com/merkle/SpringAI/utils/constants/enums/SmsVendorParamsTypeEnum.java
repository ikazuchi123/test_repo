package com.merkle.GenAI.utils.constants.enums;

public enum SmsVendorParamsTypeEnum {

    SMS_PARAMS_TO_MESSAGE(1,"send message"),
    SMS_PARAMS_TO_STR(2, "format params to string"),
    SMS_PARAMS_TO_JSON(3, "format params to json string");

    private final Integer type;
    private final String desc;

    SmsVendorParamsTypeEnum(Integer type, String desc) {
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
