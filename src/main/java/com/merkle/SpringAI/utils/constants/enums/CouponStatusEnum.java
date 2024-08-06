package com.merkle.SpringAI.utils.constants.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum CouponStatusEnum {
    ACTIVE(0, "active"), // init status
    LOCKED(1, "locked"), // coupon is locked
    INVALID(2, "invalid"), // not win a prize
    REDEEMED(3, "redeemed"), // win a prize ,but not use
    EXPIRED(4, "expired"), // expire
    USED(5, "used"), // has been used
    PACKING(6, "packing"), // reward has been packed
    DELIVER(7, "deliver"), // reward has been deliver
    REISSUED(8, "reissued"), // reward has been return
    RECEIVED(9, "received"),
    QUERY(10, "query"),
    INVALIDATE(11, "invalidate"),// 核销状态
    ACCEPT(12,"accept"),
    TO_BE_DRAW(20, "to_be_draw");

    private final Integer status;
    private final String desciption;

    CouponStatusEnum(Integer status, String desciption) {
        this.status = status;
        this.desciption = desciption;
    }

    public static Object getAllCouponStatus() {
        HashMap<String, Object> integerStringHashMap;
        List<Map<String, Object>> arrayList = new ArrayList<>();
        for (CouponStatusEnum couponStatusEnum : values()) {
            integerStringHashMap = new HashMap<>();
            integerStringHashMap.put("type", couponStatusEnum.status);
            integerStringHashMap.put("desc", couponStatusEnum.desciption);
            arrayList.add(integerStringHashMap);
        }
        return arrayList;
    }

    public Integer getStatus() {
        return status;
    }

    public String getDesciption() {
        return desciption;
    }

    public static String getDesc(Integer status) {
        for (CouponStatusEnum couponStatusEnum : values()) {
            if (couponStatusEnum.getStatus().equals(status)) {
                return couponStatusEnum.getDesciption();
            }
        }
        return null;
    }

    public static Integer getType(String desc) {
        for (CouponStatusEnum couponStatusEnum : values()) {
            if (couponStatusEnum.getDesciption().equals(desc)) {
                return couponStatusEnum.getStatus();
            }
        }
        return null;
    }

    public static boolean contains(Integer couponStatus) {
        boolean containValue = false;
        for (CouponStatusEnum cstatus : values()) {
            if (couponStatus.equals(cstatus.status)) {
                containValue = true;
            }
        }
        return containValue;
    }

    public List<Integer> getStatusList() {
        List<Integer> list = new ArrayList<>();
        for (CouponStatusEnum statusEnum : values()) {
            list.add(statusEnum.status);
        }
        return list;
    }

}
