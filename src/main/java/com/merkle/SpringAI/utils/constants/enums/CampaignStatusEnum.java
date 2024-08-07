package com.merkle.SpringAI.utils.constants.enums;

public enum CampaignStatusEnum {

    UNUSED(0, "campaign is in progress"),
    WIN(1, "participator has winned"),
    NOTWIN(2, "participator not win");

    private final int status;
    private final String desciption;

    public int getStatus() {
        return status;
    }

    public String getDesciption() {
        return desciption;
    }

    CampaignStatusEnum(int status, String desc) {
        this.status = status;
        this.desciption = desc;
    }

    public static CampaignStatusEnum getValue(Integer campaignStatus) {
        for (CampaignStatusEnum status : values()) {
            if (campaignStatus.equals(status.status)) {
                return status;
            }
        }
        return null;
    }

    public static boolean contains(Integer campaignStatus) {
        boolean containValue = false;
        for (CampaignStatusEnum cstatus : values()) {
            if (campaignStatus.equals(cstatus.status)) {
                containValue = true;
            }
        }
        return containValue;
    }
}
