package com.merkle.GenAI.utils.constants.enums;

import java.util.HashMap;

public enum LoginRoleEnum {
    ROLE_CUSTOMER(1, "CUSTOMER"),
    ROLE_MASTER_RETAILER(2, "RETAILER"),
    ROLE_SUB_RETAILER(3, "SUBACCOUNT"),
    ROLE_ADMIN(4, "ADMIN");

    private static HashMap<Integer, LoginRoleEnum> codeValueMap = new HashMap<>(7);

    static {
        for (LoginRoleEnum type : LoginRoleEnum.values()) {
            codeValueMap.put(type.role, type);
        }
    }

    private final Integer role;
    private final String description;

    private LoginRoleEnum(Integer role, String description) {
        this.role = role;
        this.description = description;
    }
    public static LoginRoleEnum getInstanceFromCode(Integer code) {
        return codeValueMap.get(code);
    }

    public Integer getRole() {
        return role;
    }

    public String getDescription() {
        return description;
    }

    public static boolean contains(Integer param) {
        boolean containValue = false;
        for (LoginRoleEnum role : values()) {
            if (param.equals(role.role)) {
                containValue = true;
            }
        }

        return containValue;
    }
}
