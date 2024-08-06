package com.merkle.SpringAI.utils.constants.enums;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Desc: registration list 和 case list 需要存储创建记录的用户信息（用户ID 和用户类型）
 * 其中用户类型为Integer 类型，为了关联原先的用户枚举类型
 */
public enum UserTypeEnum {

    USER_CUSTOMER(100, "app customer role"),
    USER_MASTER_RETAILER(200, "app retailer role"),
    USER_SUB_RETAILER(300, "app sub retailer role"),
    USER_ADMIN_ROLE(400, "admin user role");

    private Integer type;
    private String desc;

    private static LinkedHashMap<Integer, UserTypeEnum> codeValueMap = new LinkedHashMap<>(7);

    static {
        for (UserTypeEnum typeEnum: UserTypeEnum.values()) {
            codeValueMap.put(typeEnum.type, typeEnum);
        }
    }

    public static LinkedHashMap<Integer, UserTypeEnum> getInstance() {
        return codeValueMap;
    }

    /**
     * @desc: 根据type 类型得到对应的描述
     */
    public static String getDescByType(Integer type) {
        for (UserTypeEnum userTypeEnum : values()) {
            if (userTypeEnum.getType().equals(type)) {
                return userTypeEnum.getDesc();
            }
        }
        return null;
    }

    /**
     * @desc: ctp-1141 注册和case 列表添加一个createdByType, 这个type 的类型为Integer 类型
     * UserTypeEnum 中定义的角色类型和 RoleEnum 中定义的类型做关联, 通过String 类型找到对应的Integer 类型
     * @return Map
     */
    public static Map<String, Integer> createRoleToUserTypeMap () {
        Map<String, Integer> roleToUserType = new HashMap<>();
        roleToUserType.put(RoleEnum.ROLE_MASTER_RETAILER.getRole(), UserTypeEnum.USER_MASTER_RETAILER.getType());
        roleToUserType.put(RoleEnum.ROLE_SUB_RETAILER.getRole(), UserTypeEnum.USER_SUB_RETAILER.getType());
        roleToUserType.put(RoleEnum.ROLE_CUSTOMER.getRole(), UserTypeEnum.USER_CUSTOMER.getType());
        roleToUserType.put(RoleEnum.ADMIN_USER_ROLE.getRole(), UserTypeEnum.USER_ADMIN_ROLE.getType());
        return roleToUserType;
    }

    UserTypeEnum(Integer type, String desc) {
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
