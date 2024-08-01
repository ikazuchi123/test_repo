package com.merkle.GenAI.utils.constants.enums;

public enum CampaignLimitationEnum {

    TIMES_IN_CAMPAIGN_PERIOD(0, "limited times in campaign period"),
    TIMES_IN_YEARS(1, "limited times in one year"),
    TIMES_IN_MONTHS(2, "limited times in one month"), // 已经被获取
    TIMES_IN_WEEKS(3,"limited times in ont week");

    private final Integer type;
    private final String desciption;

    CampaignLimitationEnum(Integer type, String desciption) {
        this.type = type;
        this.desciption = desciption;
    }

    public Integer getType() {
        return type;
    }

    public String getDesciption() {
        return desciption;
    }


}
