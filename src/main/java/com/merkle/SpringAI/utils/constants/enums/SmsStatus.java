package com.merkle.GenAI.utils.constants.enums;

/**
 * @Desc:
 */
public enum SmsStatus {

    SMS_START(0, "Start sending SMS"),
    SMS_SENDED(1, "SMS sending completed");


    private Integer type;

    private String desc;

    SmsStatus(Integer type, String desc) {
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
