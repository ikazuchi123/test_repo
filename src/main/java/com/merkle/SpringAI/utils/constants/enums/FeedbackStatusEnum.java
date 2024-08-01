package com.merkle.GenAI.utils.constants.enums;

public enum FeedbackStatusEnum {

    UN_READ(0,"Unread"),
    PENDING(1, "Pending"),
    SECOND_PENDING(2, "2nd Pending"),
    WORKING(3, "Working"),
    SOLVED(4, "Solved"),
    CLOSED(5, "Closed"),
    HAS_BEEN_READ(6,"READ");

    private final Integer status;
    private final String desciption;

    FeedbackStatusEnum(Integer status, String desciption) {
        this.status = status;
        this.desciption = desciption;
    }

    public static String getDescByStatus(Integer status) {
        for (FeedbackStatusEnum feedbackStatusEnum : values()) {
            if (feedbackStatusEnum.getStatus().equals(status)) {
                return feedbackStatusEnum.getDesciption();
            }
        }
        return null;
    }


    public Integer getStatus() {
        return status;
    }

    public String getDesciption() {
        return desciption;
    }
}
