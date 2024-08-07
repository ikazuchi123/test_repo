package com.merkle.SpringAI.utils.constants.enums;

public enum RewardTypeEnum {

    REAL_GIFT(1, "Real gift"),
    LOTTERY_TICKETS(2, "lottery tickets"),
    COUPONS(3, "coupons"),
    ENTRANCE_TICKET(4, "entrance ticket"),
    MYSTERY_BOX(5, "mystery box");

    private Integer type;
    private String desc;

    RewardTypeEnum(Integer type, String desc) {
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
