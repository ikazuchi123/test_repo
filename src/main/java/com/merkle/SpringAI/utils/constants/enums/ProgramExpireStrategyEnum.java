package com.merkle.SpringAI.utils.constants.enums;

public enum ProgramExpireStrategyEnum {

    PURCHASE_DATE(1, "purchase_date"),

    DOT_WEEK(2, "dot_week");

    private Integer type;

    private String desc;

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

    ProgramExpireStrategyEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

}
