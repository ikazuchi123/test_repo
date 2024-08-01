package com.merkle.GenAI.utils.constants.enums;

import java.util.*;

public enum SmsTemplateEnum {

    SMS_VERIFICATION_TEMPLATE(1, "sms-verification-template"),

    SMS_VERIFICATION_REGISTRATION_TEMPLATE(2, "sms-registration-verification-template"),

    SMS_VERIFICATION_VALIDATION_TEMPLATE(3, "sms-validation-verification-template"),

    SMS_REGISTRATION_SUCCESS_TEMPLATE(4, "sms-registration-success-template"),

    SMS_COMPLAINT_SUCCESS_TEMPLATE(5, "sms-complaint-success-template"),

    SMS_CASE_COMPLETED_TEMPLATE(7, "sms-case-completed-template"),

    SMS_CAMPAIGN_IN(8, "sms-campaign-in-template"),

    SMS_FORBIDDEN_REGISTRATION(9, "sms-fobidden-registration"),

    SMS_CAMPAIGN_TEMPLATE(10, "sms-campaign-template"),

    SMS_CUSTOM_TEMPLATE(20,"sms-custom-template"),

    LOYALTY_SMS_VERIFICATION_TEMPLATE(11, "loyalty-sms-verification-template");

    private Integer type;

    private String desc;

    SmsTemplateEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static Object getAllSmsTemplate() {
        HashMap<String, Object> integerStringHashMap;
        List<Map<String, Object>> arrayList = new ArrayList<>();
        for (SmsTemplateEnum smsTemplateEnum : values()) {
            integerStringHashMap = new HashMap<>();
            integerStringHashMap.put("type", smsTemplateEnum.type);
            integerStringHashMap.put("desc", smsTemplateEnum.desc);
            arrayList.add(integerStringHashMap);
        }
        return arrayList;
    }

    public static String getDescByType(Integer type) {
        String desc = "";
        if (type == null) {
            return desc;
        }
        for (SmsTemplateEnum smsTemplateEnum : values()) {
            if (Objects.equals(smsTemplateEnum.type, type)) {
                return smsTemplateEnum.desc;
            }
        }
        return desc;
    }


    public static Integer getTypeByDesc(String desc) {
        if (null == desc) {
            return null;
        }
        for (SmsTemplateEnum smsTemplateEnum : values()) {
            if (Objects.equals(smsTemplateEnum.desc, desc)) {
                return smsTemplateEnum.type;
            }
        }
        return null;
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
