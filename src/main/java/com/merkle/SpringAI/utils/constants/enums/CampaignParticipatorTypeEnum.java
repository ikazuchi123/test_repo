package com.merkle.SpringAI.utils.constants.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc:
 */
public enum CampaignParticipatorTypeEnum {

    RETAILER(1, "retailer"),
    CUSTOMER(2, "consumer"),
    SUB_RETAILER(3, "sub retailer");

    private Integer type;

    private String desc;

    CampaignParticipatorTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public List<Integer> getParticipatorTypeList() {
        List<Integer> list = new ArrayList<>();
        for (CampaignParticipatorTypeEnum typeEnum: values()) {
            list.add(typeEnum.type);
        }
        return list;
    }

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
