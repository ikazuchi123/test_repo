package com.merkle.SpringAI.utils.constants.enums;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public enum SmsVendorEnum {

    SMS_SMPPSMSHUB("smppsmshub","smppsmshubServiceImpl"),
    SMS_INFOBIP("infobip", "smsInfobipServiceImpl"),
    SMS_OWL13("owl13", "smsOwlServiceImpl"),
    SMS_ELTEX("eltex", "smsEltexServiceImpl"),
    SMS_VENDOR("invendor", "smsVoicenServiceImpl"),
    SMS_IN_MLOYALRETAIL("mloyalretail", "smsMloyalretailServiceImpl"),
    SMS_Korea("korea", "smsKoreaServiceImpl"),
    SMS_ALIYUNCS("aliyuncs","aliyuncsSmsService"),
    SMS_ALIYUNCS_GLOBE("aliyuncs-globe","aliyuncsSmsGlobeService"),
    SMS_KOREA_KAKAO("kakao", "smsKoreaKaKaoServiceImpl");

    @Getter
    private final String vendor;
    private final String clazzName;

    SmsVendorEnum(String vendor, String clazzName) {
        this.vendor = vendor;
        this.clazzName = clazzName;
    }

    public static String getClassName(String vendor) {
        for (SmsVendorEnum smsVendorEnum: values()) {
            if (vendor.equals(smsVendorEnum.vendor)) {
                return smsVendorEnum.clazzName;
            }
        }
        return null;
    }

    public static List<String> getAllVendors() {
        List<String> list = new ArrayList<>();
        for (SmsVendorEnum smsVendorEnum: values()){
            list.add(smsVendorEnum.vendor);
        }
        return list;
    }

}
