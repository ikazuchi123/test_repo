package com.merkle.SpringAI.utils.constants.enums;

public enum CouponGeneratorTypeEnum {

    SYSTEM_AUTO_GENERATOR(1, "generate coupons by auto system"),
    INPUT_GENERATOR(2, "generate coupons by user input"),
    FILE_READ_GENERATOR(3, "generate coupons by reading upload files");

    private Integer type;

    private String desc;

    CouponGeneratorTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public static CouponGeneratorTypeEnum getValue(Integer generatorType) {
        for (CouponGeneratorTypeEnum type : values()) {
            if (generatorType.equals(type.type)) {
                return type;
            }
        }
        return null;
    }

}
