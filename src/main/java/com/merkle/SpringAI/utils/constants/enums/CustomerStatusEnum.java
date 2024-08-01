package com.merkle.GenAI.utils.constants.enums;

public enum CustomerStatusEnum {
    INACTIVE(0, "inactive"),
    ACTIVE(1, "active"),
    PAUSED(2, "paused"),
    CLOSED(3, "closed");

    private final int status;
    private final String desciption;

    public int getStatus() {
        return status;
    }

    public String getDesciption() {
        return desciption;
    }

    CustomerStatusEnum(int status, String desc) {
        this.status = status;
        this.desciption = desc;
    }

    public static CustomerStatusEnum getValue(Integer customerStatus) {

        for (CustomerStatusEnum status : values()) {
            if (customerStatus.equals(status.status)) {
                return status;
            }
        }
        return null;
    }

    public static boolean contains(Integer customerStatus) {
        boolean containValue = false;
        for (CustomerStatusEnum cstatus : values()) {
            if (customerStatus.equals(cstatus.status)) {
                containValue = true;
            }
        }

        return containValue;
    }
}
