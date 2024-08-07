package com.merkle.SpringAI.utils.constants.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc:
 */
public enum RetailerTypeEnum {

    RETAILER_DUMMY_PHONE(1, "dummy phone"),

    RETAILER_CASE_ABILITY(2, "case ability"),

    RETAILER_BEST_DEALER(4, "best dealer"),

    RETAILER_OPEN_POINT_MALL(8, "open point mail");

    private Integer type;
    private String desc;

    RetailerTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static List<Map<String, Object>> getTypes() {
        HashMap<String, Object> integerStringHashMap;
        List<Map<String, Object>> arrayList = new ArrayList<>();
        for (RetailerTypeEnum retailerTypeEnum : values()) {
            integerStringHashMap = new HashMap<>();
            integerStringHashMap.put("type", retailerTypeEnum.type);
            integerStringHashMap.put("desc", retailerTypeEnum.desc);
            arrayList.add(integerStringHashMap);
        }
        return arrayList;
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
