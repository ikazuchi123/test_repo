package com.merkle.SpringAI.utils.constants.enums;

public enum BannerRedirectTypeEnum {

    INNER(1, "web view"),
    BROWSER(2, "web browser");

    private Integer type;
    private String desc;

    BannerRedirectTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static String getDesc(int type) {
        for (BannerRedirectTypeEnum bannerRedirectTypeEnum : values()) {
            if (bannerRedirectTypeEnum.getType() == type) {
                return bannerRedirectTypeEnum.getDesc();
            }
        }
        return null;
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
