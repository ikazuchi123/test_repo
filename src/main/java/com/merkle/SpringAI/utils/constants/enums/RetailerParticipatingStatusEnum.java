package com.merkle.SpringAI.utils.constants.enums;

public enum RetailerParticipatingStatusEnum {

    NONPARTICIPATING(1, "non-participating"),

    PARTICIPATING(2, "participating"),

    LINKEDMOBILE(3, "linked mobile.");

    private final Integer status;
    private final String desc;

    public Integer getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }

    RetailerParticipatingStatusEnum(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }


    public static String getDescByStatus(Integer status) {
        for (RetailerParticipatingStatusEnum retailerParticipatingStatusEnum : values()) {
            if (retailerParticipatingStatusEnum.getStatus().equals(status)) {
                return retailerParticipatingStatusEnum.getDesc();
            }
        }
        return null;
    }

    public static boolean contains(Integer retailerStatus) {
        boolean containValue = false;
        for (RetailerParticipatingStatusEnum rstatus : values()) {
            if (retailerStatus.equals(rstatus.status)) {
                containValue = true;
            }
        }

        return containValue;
    }
}
