package com.merkle.SpringAI.utils.constants.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum AccountSettingTypeEnum {
    COMPLETE_CUSTOMER_PROFILE("complete_customer_info", "homepage crate subaccount btn permission."),
    SECTION_ASPECT_RIM("section_aspect_rim", "in tyre registration page"),
    REGISTRATION_VALIDATION("registration_validation", "registration validation rule"),
    CASE_VALIDATION("case_validation", "case validation rule"),
    PRODUCT_HANDLER("product_handler", "product handler"),
    SMS_SETTING("sms_setting", "sms setting"),
    FEEDBACK_IMAGE_SETTING("feedback_image_setting", "feedback image setting"),
    OCH_SETTING_PARAM("och_setting_param", "och setting param"),

    CAMPAIGN_SETTING("campaign_setting", "campaign setting"),
    VEHICLE_SETTING("vehicle_setting", "vehicle setting"),
    TT_VEHICLE_SETTING("tt_vehicle_setting", "tt vehicle setting"),
    COMPENSATE_SETTING("compensate_setting", "compensate setting"),
    TYRE_REGISTRATION_ITEM_STATUS("registration_item_status_rule", "registration item status rule"),
    FILE_CASE("file_case", "file case"),
    CASE_STATUS_MAPPING("case_status_mapping", "case status mapping"),

    APK_DOWNLOAD_SETTING("apk_download_setting", "apk download setting"),

    MESSAGE_SHOW_RULE("message_show_rule", "message show rule"),

    APP_SETTING("app_setting", "app setting"),

    EMAIL_SETTING("email_setting", "email setting"),

    PATTERN_BLACK_LIST("pattern_black_list", "pattern black list"),

    USER_SETTING("user_setting", "user setting"),

    REGISTRATION_DEFAULT_VALUE("registration_default_value", "registration default value"),

    RETAILER_MAP_SETTING("retailer_map_setting", "retailer map setting"),

    PRODUCT_VALIDATION("product_validation", "product validation"),

    DISPLAY_NAME_SETTING("display_name_setting", "display name setting"),

    OUTBOUNDAPI_SETTING("outboundapi_setting", "outboundapi setting"),

    NW_CASE_VALIDATION("nw_case_validation", "normal warranty validation"),

    LOYALTY_SETTING("loyalty_setting", "loyalty setting");

    private final String type;
    private final String typeDescription;

    AccountSettingTypeEnum(String type, String typeDescription) {
        this.type = type;
        this.typeDescription = typeDescription;
    }

    public String getType() {
        return type;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public static boolean contains(String permissionType) {
        boolean containValue = false;
        for (AccountSettingTypeEnum permissionTypeEnum : values()) {
            if (permissionType.equals(permissionTypeEnum.type)) {
                containValue = true;
            }
        }

        return containValue;
    }

    public static List<Map<String, Object>> getSettingTypes() {
        HashMap<String, Object> integerStringHashMap;
        List<Map<String, Object>> arrayList = new ArrayList<>();
        for (AccountSettingTypeEnum accountSettingTypeEnum : values()) {
            integerStringHashMap = new HashMap<>();
            integerStringHashMap.put("type", accountSettingTypeEnum.type);
            integerStringHashMap.put("desc", accountSettingTypeEnum.typeDescription);
            arrayList.add(integerStringHashMap);
        }
        return arrayList;
    }
}
