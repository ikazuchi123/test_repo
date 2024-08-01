package com.merkle.GenAI.utils.constants.enums;

import java.util.HashMap;
import java.util.Map;

public enum RoleEnum {
    ROLE_CUSTOMER("CUSTOMER", "consumer"),
    ROLE_MASTER_RETAILER("RETAILER", "Master retailer account"),
    ROLE_SUB_RETAILER("SUBACCOUNT", "Retailers' employee"),
    ADMIN_USER_ROLE("USERADMINROLE", "admin user");

    private static HashMap<String, RoleEnum> codeValueMap = new HashMap<>(7);

    static {
        for (RoleEnum type : RoleEnum.values()) {
            codeValueMap.put(type.role, type);
        }
    }

    /**
     * @desc: ctp-1141 注册和case 列表添加一个createdByType, 这个type 的类型为Integer 类型
     * UserTypeEnum 中定义的角色类型和 RoleEnum 中定义的类型做关联, 通过Integer 类型找到对应的String 类型
     * @return Map
     */
    public static Map<Integer, String> createUserTypeToRoleMap() {
        Map<Integer, String> roleMap = new HashMap<>();
        roleMap.put(UserTypeEnum.USER_MASTER_RETAILER.getType(), RoleEnum.ROLE_MASTER_RETAILER.getRole());
        roleMap.put(UserTypeEnum.USER_CUSTOMER.getType(), RoleEnum.ROLE_CUSTOMER.getRole());
        roleMap.put(UserTypeEnum.USER_SUB_RETAILER.getType(), RoleEnum.ROLE_SUB_RETAILER.getRole());
        roleMap.put(UserTypeEnum.USER_ADMIN_ROLE.getType(), RoleEnum.ADMIN_USER_ROLE.getRole());
        return roleMap;
    }

    private final String role;
    private final String description;

    private RoleEnum(String role, String description) {
        this.role = role;
        this.description = description;
    }
    public static RoleEnum getInstanceFromCode(String code) {
        return codeValueMap.get(code);
    }

    public String getRole() {
        return role;
    }

    public String getDescription() {
        return description;
    }

    public static boolean contains(String param) {
        boolean containValue = false;
        for (RoleEnum role : values()) {
            if (param.equals(role.role)) {
                containValue = true;
            }
        }

        return containValue;
    }
}
