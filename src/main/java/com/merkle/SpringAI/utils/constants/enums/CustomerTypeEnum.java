package com.merkle.GenAI.utils.constants.enums;

import java.util.LinkedHashMap;

/**
 * @Desc: user type
 * @CreateAt: 2022-11-29
 */
public enum CustomerTypeEnum {

    CUSTOMER_COMMON(0,"normal user"),
    CUSTOMER_FLEET(1, "a fleet of consumer vehicle");

    private Integer type;
    private String desc;

    private static LinkedHashMap<Integer, CustomerTypeEnum> codeValueMap = new LinkedHashMap<>(7);

    static {
        for (CustomerTypeEnum typeEnum: CustomerTypeEnum.values()) {
            codeValueMap.put(typeEnum.type, typeEnum);
        }
    }

    public static LinkedHashMap<Integer, CustomerTypeEnum> getInstance() {
        return codeValueMap;
    }

    CustomerTypeEnum(Integer type, String desc) {
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
