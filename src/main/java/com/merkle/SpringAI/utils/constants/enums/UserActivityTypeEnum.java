package com.merkle.GenAI.utils.constants.enums;

public enum UserActivityTypeEnum {

    /**
     * App相关: 10000 ~ 99999
     * Admin相关：110000 ～ 200000
     */
    APP_REGISTER(10000, "app register"),

    /**
     * Admin register：110000 ～ 119999
     */
    ADMIN_REGISTER_ADD(110000, "admin register"),
    ADMIN_REGISTER_UPDATE(111000, "admin register update"),
    ADMIN_REGISTER_DELETE(112000, "admin delete registration"),

    /**
     * Admin register item：120000 ～ 129999
     */
    ADMIN_ITEM_ADD(120000, "admin add tyre item"),
    ADMIN_ITEM_UPDATE(121000, "admin update tyre item"),
    ADMIN_ITEM_DELETE(122000, "admin delete tyre item"),

    /**
     * Admin consumer ：130000 ～ 139999
     */
    ADMIN_CONSUMER_ADD(130000, "admin add consumer"),
    ADMIN_CONSUMER_UPDATE(131000, "admin update consumer"),
    ADMIN_CONSUMER_DELETE(132000, "admin delete consumer"),

    /**
     * Admin consumer vehicle：140000 ～ 149999
     */
    ADMIN_CONSUMER_VEHICLE_ADD(140000, "admin add consumer vehicle"),
    ADMIN_CONSUMER_VEHICLE_UPDATE(141000, "admin update consumer vehicle"),
    ADMIN_CONSUMER_VEHICLE_DELETE(142000, "admin delete consumer vehicle"),

    /**
     * Admin banner：150000 ～ 159999
     */
    ADMIN_BANNER_ADD(150000, "admin add banner"),
    ADMIN_BANNER_UPDATE(151000, "admin update banner"),
    ADMIN_BANNER_DELETE(152000, "admin delete banner"),

    /**
     * Admin retailer ：160000 ～ 169999
     */
    ADMIN_RETAILER_ADD(160000, "admin add retailer"),
    ADMIN_RETAILER_UPDATE(161000, "admin update retailer"),
    ADMIN_RETAILER_DELETE(162000, "admin delete retailer"),


    /**
     * Admin case ：190000 ～ 199999
     */
    ADMIN_CASE_ADD(190000, "admin add case"),
    ADMIN_CASE_UPDATE(191000, "admin update case"),
    ADMIN_CASE_DELETE(192000, "admin delete case"),


    /**
     * Admin user ：200000 ～ 209999
     */
    ADMIN_USER_ADD(200000, "admin add user"),
    ADMIN_USER_UPDATE(201000, "admin update user"),
    ADMIN_USER_DELETE(202000, "admin delete user"),

    /**
     * Admin product pattern ：210000 ～ 219999
     */
    ADMIN_PRODUCT_PATTERN_ADD(210000, "admin add pattern"),
    ADMIN_PRODUCT_PATTERN_UPDATE(211000, "admin update pattern"),
    ADMIN_PRODUCT_PATTERN_DELETE(212000, "admin delete pattern"),

    /**
     * Admin retailer sub account ：220000 ～ 229999
     */
    ADMIN_RETAILER_SUB_ACCOUNT_ADD(220000, "admin add sub account"),
    ADMIN_RETAILER_SUB_ACCOUNT_UPDATE(221000, "admin update sub account"),
    ADMIN_RETAILER_SUB_ACCOUNT_DELETE(222000, "admin delete sub account");

    private Integer type;

    private String desc;

    UserActivityTypeEnum(Integer type, String desc) {
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
