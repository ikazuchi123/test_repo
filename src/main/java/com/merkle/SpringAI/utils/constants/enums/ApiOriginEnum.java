package com.merkle.GenAI.utils.constants.enums;

/**
 * @Desc:
 */
public enum ApiOriginEnum {

    BACKEND_API("BACKEND", "call api from backend"),
    APP_API("APP", "call api from app");

    private final String type;
    private final String description;

    ApiOriginEnum(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
