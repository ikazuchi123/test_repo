package com.merkle.SpringAI.utils.constants.enums;

public enum OCHStatusEnum {

    OCH_STATUS_1("001", "invalid user name or password"),

    OCH_STATUS_2("100", "invalid complaint date"),
    OCH_STATUS_3("101", "invalid vehicle category"),
    OCH_STATUS_4("102", "invalid vehicle manufacturer code"),
    OCH_STATUS_5("103", "invalid car model"),

    OCH_STATUS_6("110", "invalid customer number - this will validate customer info against COC database, include customer in the right sales org, and distribution channel"),
    OCH_STATUS_7("111", "invalid sales org"),
    OCH_STATUS_8("112", "invalid distribution channel"),

    OCH_STATUS_10("120", "invalid extended warranty number"),

    OCH_STATUS_11("200", "tire information is empty"),
    OCH_STATUS_12("500", "complaint header is empty"),

    OCH_STATUS_13("130", "invalid retailer shop name"),
    OCH_STATUS_14("131", "invalid retailer shop street"),
    OCH_STATUS_15("132", "invalid retailer shop city"),
    OCH_STATUS_16("133", "invalid retailer shop zip code"),

    OCH_STATUS_17("201", "Invalid dot code"),
    OCH_STATUS_18("202", "Invalid dot date"),
    OCH_STATUS_19("203", "Invalid article number"),
    OCH_STATUS_20("204", "Invalid plant code"),
    OCH_STATUS_21("205", "Invalid article origin");


    private String status;
    private String desc;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    OCHStatusEnum(String status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public static String getValue(String status) {
        for (OCHStatusEnum ochStatusEnum : values()) {
            if (ochStatusEnum.getStatus().equals(status)) {
                return ochStatusEnum.getDesc();
            }
        }
        return null;
    }

}
