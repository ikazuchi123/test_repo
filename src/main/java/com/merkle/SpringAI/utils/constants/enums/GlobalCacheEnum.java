package com.merkle.SpringAI.utils.constants.enums;

public enum GlobalCacheEnum {

    ACCOUNT_LOCAL_CACHE("account", "account list"),
    PRODUCT_RIM_COUNTRY_LOCAL_CACHE("country_product_rim", "need validate product rim size "),

    REQUIRED_APP_VERSION("require_app_version", "require  app version");

    private final String name;
    private final String description;

    private GlobalCacheEnum(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static boolean contains(String param) {
        boolean containValue = false;
        for (GlobalCacheEnum cache : values()) {
            if (param.equals(cache.name)) {
                containValue = true;
            }
        }

        return containValue;
    }

}
