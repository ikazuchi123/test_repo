package com.merkle.GenAI.utils.constants.enums;

import java.util.HashMap;

/**
 * @Desc:
 */
public enum UserExtraAttrTypeEnum {

    MAX_VEHICLES(100, "a fleet of consumer vehicle");

    private Integer type;
    private String desc;

    private static HashMap<Integer, UserExtraAttrTypeEnum> codeValueMap = new HashMap<>(7);

    static {
        for (UserExtraAttrTypeEnum typeEnum: UserExtraAttrTypeEnum.values()) {
            codeValueMap.put(typeEnum.type, typeEnum);
        }
    }

    public static UserExtraAttrTypeEnum getInstance(int code) {
        return codeValueMap.get(code);
    }

    UserExtraAttrTypeEnum(Integer type, String desc) {
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
