package com.merkle.GenAI.utils.constants.enums;

public enum CaseValidationSettingEnum {

    TYRE_MIN_CNT("tyre_min", "min tyre"),
    TYRE_MAX_CNT("tyre_max", "max tyre"),
    CHECK_BARCODE("check_barcode", "check bar code"),
    CHECK_DOT("check_dot", "check dot"),
    CHECK_DUPLICATE("check_duplicate", "check duplicate"),
    CHECK_MILEAGE("check_mileage", "check mileage"),
    CHECK_PURCHASE_DATE("check_purchase_date", "check purchase date"),
    CHECK_PURCHASE_PROOF("check_purchase_proof", "check purchase proof"),
    CHECK_SERIAL_NUMBER_IMAGE("check_serial_number_image", "check serial number image"),
    MAX_TREAD_DEPTH("max_tread_depth", "max tread depth"),
    MIN_TREAD_DEPTH("min_tread_depth", "min tread depth"),

    SEND_EMAIL_TO_SALES("send_email_to_sales", "send_email_to_sales"),
    REQUIRE_SALES_APPROVE("require_sales_approve", "require_sales_approve");

    private String type;
    @SuppressWarnings("unused")
    private String typeDescription;

    CaseValidationSettingEnum(String type, String typeDescription) {
        this.type = type;
        this.typeDescription = typeDescription;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
