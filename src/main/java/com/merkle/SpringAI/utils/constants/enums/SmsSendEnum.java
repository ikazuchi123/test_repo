package com.merkle.GenAI.utils.constants.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc:
 */
public enum SmsSendEnum {

    SMS_SEND_SYNC("sync", "smsSendSyncServiceImpl"),
    SMS_SEND_ASYNC("async", "smsSendAsyncServiceImpl");

    private final String type;
    private final String clazzName;

    SmsSendEnum(String type, String clazzName) {
        this.type = type;
        this.clazzName = clazzName;
    }

    public static String getClassName(String vendor) {
        for (SmsSendEnum smsSendEnum: values()) {
            if (vendor.equals(smsSendEnum.type)) {
                return smsSendEnum.clazzName;
            }
        }
        return null;
    }

    public static List<String> getAllVendors() {
        List<String> list = new ArrayList<>();
        for (SmsSendEnum smsSendEnum: values()){
            list.add(smsSendEnum.type);
        }
        return list;
    }

}
