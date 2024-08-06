package com.merkle.SpringAI.utils.constants;

public class ExceptionConstants {

    // Common
    public static final int SUCCESS = 0;
    public static final int UN_KNOWN_ERROR = -1;
    public static final int SYSTEM_EXCEPTION = -999;

    // Parameter
    public static final int PARAM_ERROR = 1001;
    public static final int MISSING_PARAM_ERROR = 1011;
    public static final int REACH_LIMITATION = 1012;
    public static final int INVALID_VERIFICATION_CODE = 1013;

    // System
    public static final int TIME_OUT_ERROR = 2002;
    public static final int TOKEN_NOT_EXIST = 2003;

    public static final int APP_VERSION_CHECK_ERROR = 2004;


    // Customer
    public static final int CONSUMER_ACCOUNT_LOCK = 3001;
    public static final int CONSUMER_EXISTED = 3002;
    public static final int STATUS_ERROR = 3003;
    public static final int PROFILE_ALREADY_COMPLETED = 3004;
    public static final int CUSTOMER_CANT_EDIT = 3005;
    public static final int VEHICLE_PLATE_EXISTING = 3006;
    public static final int VEHICLE_MODLE = 3007;
    public static final int VEHICLE_NOT_EXIST_OR_STATUS_ERROR = 3008;
    public static final int CUSTOMER_NON_ERROR = 3009;
    public static final int IDENTITY_MISSING = 3010;
    public static final int IDENTITY_ALREADY_BINDED = 3011;
    public static final int COMMUNICATION_NO_CONFIRM = 3012;
    public static final int PRIVACY_NO_CONFIRM = 3013;
    public static final int PLATE_NUMBER_HAS_BIND = 3014;
    public static final int CAN_NOT_DELETE_BY_VEHICLE = 3015;
    public static final int CAN_NOT_DELETE_BY_REGISTRATION = 3016;
    public static final int CAN_NOT_DELETE_BY_CASE = 3017;
    public static final int CUSTOMER_ID_EMPTY = 3018;
    public static final int CUSTOMER_ID_LICENSE_NUMBER_CANNOT_BE_MODIFIED = 3019;
    public static final int CUSTOMER_PHONE_ERROR = 3020;
    public static final int CUSTOMER_VEHICLE_NUMBER_OVER_LIMIT = 3021;

    // Retailer/User
    public static final int USER_NOT_EXIST = 4001;
    public static final int RETAILER_NOT_EXIST = 4002;
    public static final int RETAILER_STATUS_INAPPROPRIATE = 4003;
    public static final int RETAILER_CREDENTIAL_ERROR = 4004;
    public static final int PHONE_EXISTED = 4005;
    public static final int MASTER_ACCOUNT_STATUS_INAPPROPRIATE = 4006;
    public static final int RETAILER_NON_ERROR = 4007;
    public static final int RETAILER_SUB_ACCOUNT_NON_EXIST = 4008;
    public static final int BIND_PHONE_ERROR = 4009;
    public static final int PHONE_HAS_BIND_BY_RETAILER = 4010;
    public static final int PHONE_HAS_BIND_BY_SUB_ACCOUNT = 4014;

    public static final int RETAILER_CAN_NOT_DELETE_BY_REGISTRATION = 4011;

    public static final int RETAILER_CAN_NOT_DELETE_BY_CASE = 4012;
    public static final int RETAILER_ID_EMPTY = 4013;

    // Registration
    public static final int MISSING_REQUIRED_FIELD = 5001;
    public static final int REGISTER_TYRE_CNT_ERROR = 5002;
    public static final int BARCODE_ERROR = 5003;
    public static final int MILEAGE_ERROR = 5004;
    public static final int MILEAGE_EXCEED_MAX = 5008;
    public static final int DOT_ERROR = 5005;
    public static final int TYRE_PURCHASE_DATE_ERROR = 5006;
    public static final int TYRE_DUPLICATED_ERROR = 5007;
    public static final int REGISTRATION_ITEMS_EMPTY = 5020;
    public static final int WHEEL_POSITION_EMPTY = 5021;
    public static final int TYRE_PURCHASE_PROOF_EMPTY = 5022;
    public static final int TYRE_INVOICE_NUMBER_EMPTY = 5023;
    public static final int PATTERN_BLACKLIST_ERROR = 5024;

    public static final int REGISTRATION_NOT_EXIST = 5008;
    public static final int REGISTRATION_STATUS_ERROR = 5009;
    public static final int WHEEL_POSTION_ERROR = 5010;
    public static final int SERIAL_NUMBER_IMAGE_EMPTY = 5011;
    public static final int BARCODE_DUPLICATED_ERROR = 5012;


    // Account
    public static final int ACCOUNT_NOT_CONSISTENCE = 6001;
    public static final int ACCOUNT_NOT_VALID = 6002;
    public static final int ACCOUNT_CRDENTIAL_ERROR = 6003;
    public static final int TYPE_NOT_EXIST = 6004;
    public static final int PHONE_HAS_BIND = 6005;
    public static final int ACCOUNTSETTING_NOT_EXIST = 6006;
    public static final int TYPE_EXISTED = 6007;
    public static final int ACCOUNT_SETTING_ERROR = 6008;

    //sub account
    public static final int SUB_ACCOUNT_NOT_EXIST = 7001;


    // Access Permission Errors
    public static final int ACCESS_MODLE_ERROR = 9001;
    public static final int PERMISSION_TYPE_ERROR = 9002;
    public static final int ACCESS_DENY = 9003;
    public static final int ACCOUNT_NOT_EXIST = 9004;

    // admin
    public static final int TOKEN_INVALID = 8001;
    public static final int LOGIN_ERROR = 8002;
    public static final int USER_EMPTY = 8003;
    public static final int PASSWORD_ERROR = 8004;
    public static final int EMAIL_EMPTY = 8006;
    public static final int EMAIL_EXIST = 8007;

    //message template
    public static final int MESSAGE_TEMPLATE = 11001;
    public static final int MESSAGE_TYPE_NOT_EXIST = 11002;
    public static final int MESSAGE_TEMPLATE_EXIST = 11003;
    public static final int MESSAGE_FIELD_TYPE_NOT_EXIST = 11004;


    //vehicle category  manufacturers models
    public static final int VEHICLE_CATEGORY_NOT_EXIST = 12001;
    public static final int VEHICLE_MANUFACTURERS_NOT_EXIST = 12002;
    public static final int VEHICLE_MODELS_NOT_EXIST = 12003;
    public static final int PLATE_NUMBER_ERROR = 12004;
    public static final int VEHICLE_CAN_NOT_DELETE_BY_REGISTRATION = 12005;

    //assets
    public static final int ASSETS_GROUP_NOT_EXIST = 13001;
    public static final int ASSETS_GROUP_EXIST = 13002;
    public static final int FILE_UPLOAD_FAILD = 13003;

    //job
    public static final int CLASS_NOT_FOUND = 14001;
    public static final int EXPRESSION_ERROR = 14002;
    public static final int JOB_EXIST = 14003;

    //customer case
    public static final int CUSTOMER_CASE_EMPTY = 15001;
    public static final int CUSTOMER_CASE_REPEATED = 15002;

    public static final int MILEAGE_DISTANCE_OVER_10000 = 15003;

    public static final int CUSTOMER_CASE_FORBID_BY_RETAILER_STATUS = 15003;

    //sms
    public static final int SMS_TEMPLATE_EXIST = 16001;
    public static final int SMS_TEMPLATE_NOT_EXIST = 16002;


    //program
    public static final int PROGRAM_STRATEGY_ERROR = 17001;
    public static final int PROGRAM_DATATYPE_ERROR = 17002;
    public static final int PROGRAM_RULE_ERROR = 17003;

    // user role
    public static final int USER_PERMISSION_ERROR_CODE = 18001;

    //user group
    public static final int USER_GROUP_EXIST = 19000;
    public static final int USER_GROUP_NOT_EXIST = 19001;

    // user prefered language
    public static final int LOCAL_LANGUAGE_ERROR_code = 20001;

    // campaign
    public static final int CAMPAIGN_NOT_AVAILABLE_CODE = 21000;
    public static final int CAMPAIGN_NOT_AVAILABLE_FOR_CUSTOMER_CODE = 21001;
    public static final int CAMPAIGN_ENABLE_BLACKLIST_CODE = 21002;
    public static final int CAMPAIGN_REWARD_NOT_AVAIABLE_CODE = 21003;
    public static final int CAMPAIGN_COUPON_STATUS_ERROR_CODE = 21004;
    public static final int COUPON_NOT_AVAILABLE_CODE = 21005;
    public static final int COUPON_STATUS_ERROR_CODE = 21006;

    // reward
    public static final int REWARD_EXIST_ERROR_CODE = 22000;
    public static final int REWARD_NOT_AVAILABLE_CODE = 22001;
    public static final int REWARD_NOT_AVAILABLE_FOR_CUSTOMER = 22002;

    // case feedback error
    public static final int CASE_FEEDBACK_ERROR_CODE = 23000;

    // api debounce
    public static final int API_DEBOUNCE_ERROR_CODE = 24000;

    // sms config error
    public static final int SMS_CONFIG_ERROR_CODE = 25000;

    // in consumer registration limitation
    public static final int REGISTRATION_FORBIDDEN_ERROR_CODE = 26000;

    // duplicate submit
    public static final int DUPLICATE_API_FORBIDDEN_CODE = 30000;

    // duplicate submit
    public static final int VALIDATE_TYRE_SIZE_CODE = 40000;

    // admin
    // case
    public static final int CANT_NOT_DELETE_CASE_WITH_REGISTRATION = 50000;

    public static final int PLATE_NUMBER_AND_PHONE_NOT_MATCH = 60000;

    // Normal Warranty
    public static final int NORMAL_WARRANTY_CUSTOMER_EMPTY_CODE = 100000;
    // LOYALTY
    public static final int LOYALTY_SMS_VERIFICATION_ERROR = 200000;
    public static final int LOYALTY_PASSWORD_PASSWORD_FAILED = 200001;
    public static final int LOYALTY_SMS_TEMPLATE_ERROR = 200002;

    // myprile 101000
    public static final int CANNOT_GET_USER_INFORMATION_CODE = 101000;

}

