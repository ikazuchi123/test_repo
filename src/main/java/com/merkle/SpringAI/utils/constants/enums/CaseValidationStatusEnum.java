package com.merkle.SpringAI.utils.constants.enums;

/**
 * @Desc:
 */
public enum CaseValidationStatusEnum {

    CASE_SKIP_DOT_STATUS(0, "skip dot validation case"),

    CASE_NORMAL_STATUS(1, "normal case, no need to validate"),

    CASE_NEED_VALIDATE_STATUS(2, "need admin user validate case"),

    CASE_ACTIVE_STATUS(3, "case approved"),

    CASE_INACTIVE_STATUS(4, "case unapproved");


    private final Integer status;
    private final String description;

    CaseValidationStatusEnum(Integer status, String description) {
        this.status = status;
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
