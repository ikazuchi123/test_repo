package com.merkle.GenAI.utils.constants.enums;

public enum CaseDotStatusEnum {

    /**
     * case 0: product is null, find dictionaries by dot, after update dot&articleCode
     */
    DOT_CORRECT(0, "dot check correct"),

    /**
     * case 0: product is null, find dictionaries by dot is empty
     * case 1: product is not null, but not find dictionaries by articleCode
     * case 2: product is not null, but check dot by articleCode&dot fail
     */
    DOT_INCORRECT(1, "dot check incorrect"),

    /**
     * case 1: product is not null, and check by articleCode&dot success
     */
    DOT_ACTIVE(2, "find dot with article code");

    private final Integer status;
    private final String description;

    public Integer getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    CaseDotStatusEnum(Integer status, String description) {
        this.status = status;
        this.description = description;
    }

}
