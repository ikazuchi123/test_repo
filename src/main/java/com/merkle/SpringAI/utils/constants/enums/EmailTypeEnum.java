package com.merkle.GenAI.utils.constants.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum EmailTypeEnum {

    ADMIN_ADD_USER(1, "admin add user"),
    SUBMIT_OCH(2, "submit och"),
    FEED_EXCEPTION(3, "feed exception"),

    FEED_STATISTICS(4, "feed statistics"),
    RETAILER_INIT(5, "retailer init"),
    CALL_OUTBOUND_SCANNING_API_EXCEPTION(7, "call outbound scanning api exception"),
    SEND_TO_SALES_WHEN_SUBMIT_OCH(6, "send to sales when submit och"),
    SEND_TO_SALES_WHEN_VALIDATE_CASE(8, "send to sales when validate case"),

    // 2.0 email template
    LOYALTY_PHYSICAL_PRODUCT_ORDER_PAID(200, "create physical product order"),
    LOYALTY_PHYSICAL_PRODUCT_ORDER_TO_BE_SHIPPED(201, "to be shipped"),
    LOYALTY_PHYSICAL_PRODUCT_ORDER_INVALID(202, "invalid order"),
    LOYALTY_PHYSICAL_PRODUCT_ORDER_SHIPPED(203, "product has been shipped"),
    LOYALTY_PHYSICAL_PRODUCT_ORDER_COMPLETED(204, "order has been completed"),
    // 发票核销商品，订单状态变化
    // general use
    LOYALTY_REIMBURSEMENT_GENERAL_ORDER_PAID(205, "create reimbursement order"),
    LOYALTY_REIMBURSEMENT_GENERAL_ORDER_COMPLETED(206, "reimbursement order has been completed"),
    LOYALTY_REIMBURSEMENT_GENERAL_ORDER_INVALID(207, "invalid reimbursement order"),
    // marketing use
    LOYALTY_REIMBURSEMENT_MARKETING_ORDER_PAID(208, "create reimbursement order"),
    LOYALTY_REIMBURSEMENT_MARKETING_ORDER_COMPLETED(209, "reimbursement order has been completed"),
    LOYALTY_REIMBURSEMENT_MARKETING_ORDER_INVALID(210, "invalid reimbursement order"),
    // 积分变化状态变化
    LOYALTY_POINTS_CHANGE_ADD(211, "points has been changed"),
    LOYALTY_POINTS_CHANGE_DEDUCTED(212, "points has been changed"),
    // 积分增加
    LOYALTY_POINTS_AUTOMATIC_CALCULATION(213, "automatic calculate points"),

    // 虚拟商品消息模版
    LOYALTY_VIRTUAL_PRODUCT_ORDER_PAID(214, "create virtual product order"),
    LOYALTY_VIRTUAL_PRODUCT_ORDER_COMPLETED(215, "create virtual product order"),
    LOYALTY_VIRTUAL_PRODUCT_ORDER_INVALID(216, "invalid virtual product order");

    private Integer type;

    private String desc;

    EmailTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static Object getAllEmailTemplate() {
        HashMap<String, Object> integerStringHashMap;
        List<Map<String, Object>> arrayList = new ArrayList<>();
        for (EmailTypeEnum emailTypeEnum : values()) {
            integerStringHashMap = new HashMap<>();
            integerStringHashMap.put("type", emailTypeEnum.type);
            integerStringHashMap.put("desc", emailTypeEnum.desc);
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
