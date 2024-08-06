package com.merkle.SpringAI.utils.constants.enums;

public enum PermissionTypeEnum {

    /*HOME_SUB_ACCOUNT("home_sub_account", "homepage crate subaccount btn permission."),
    HOME_SHOW_NUM("home_analytics_number", "homepage case/registration analytics number.");*/

    ADMIN_Customer("Customer","homepage Customer permission."),
    ADMIN_Retailer("Retailers","homepage Retailers permission."),
    ADMIN_TYRES("Tyres","homepage tyres permission."),
    ADMIN_REGISTRATIONS("Registrations","homepage Registrations permission."),
    ADMIN_CASES("Cases","homepage Cases permission."),
    ADMIN_VEHICLES("Vehicles","homepage Vehicles permission."),
    ADMIN_VEHICLES_CATEGORIES("Vehicle Categories","homepage Vehicle Categories permission."),
    ADMIN_BANNERS("Banners","homepage Banners permission."),
    ADMIN_ACCOUNT_SETTING("Account Setting","homepage Account Setting permission."),
    ADMIN_SETTING("User","homepage User permission."),
    ADMIN_PERMISSION_GROUP("Permission Group","homepage Permission Group permission.");

    private final String permissionType;
    private final String permissionTypeDescription;

    private PermissionTypeEnum(String permissionType, String permissionTypeDescription) {
        this.permissionType = permissionType;
        this.permissionTypeDescription = permissionTypeDescription;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public String getPermissionTypeDescription() {
        return permissionTypeDescription;
    }

    public static boolean contains(String permissionType) {
        boolean containValue = false;
        for (PermissionTypeEnum permissionTypeEnum : values()) {
            if (permissionType.equals(permissionTypeEnum.permissionType)) {
                containValue = true;
            }
        }

        return containValue;
    }
}
