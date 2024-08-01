package com.merkle.GenAI.utils.constants.enums;

public enum PermissionGroupEnum {
    SALES("Sales", "sale perssion group"),
    ADMIN("Admin", "admin"),
    RETAILER("Retailer", "retailer"),
    CUSTOMER_SERVICE("CustomerService", "customer service"),
    SUPER_ADMIN("SuperAdmin", "super admin"),
    REGION_MANAGER("RegionManager", "region manager"),
    CAMPAIGN_USERS("CampaignUsers", "campaign users"),
    POINT_MALL("PointMall", "Poing mall"),
    HEADRETAILER("HeadRetailer", "head retailer"),
    MARKETING_ADMIN("MarketingAdmin", "marketing admin");

    private final String permission;
    private final String description;

    PermissionGroupEnum(String permission, String description) {
        this.permission = permission;
        this.description = description;
    }

    public String getPermission() {
        return permission;
    }
}
