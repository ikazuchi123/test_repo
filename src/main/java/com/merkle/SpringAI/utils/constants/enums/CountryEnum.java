package com.merkle.SpringAI.utils.constants.enums;

public enum CountryEnum {

    MY("MY", "Malaysia"),

    AU("AU", "Australia"),

    IN("IN", "India"),

    JP("JP", "Japanese"),

    TW("TW", "Taiwan"),

    KR("KR", "Korean");

    private String code;

    private String desc;

    CountryEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
