package com.merkle.GenAI.utils.constants;

public class ResultMsg {

    public static final String SUCCESS = "success";
    public static final String FAILED = "failed";

    // 系统异常
    public static final String SYSTEM_EXCEPTION = "System exception";

    // Params
    public static final String INVALID_VERIFICATION_CODE = "Invalid verification code";
    public static final String PARAMS_ERROR = "Invalid params, please double check.";
    public static final String APP_VERSION_CHECK_ERROR = "Please upgrade to the latest version.";

    // Permission
    public static final String ACCESS_MODLE_ERROR = "Access modle error, please double check.";
    public static final String PERMISSION_TYPE_ERROR = "Incorrect permission type. Please contact your amdinistor.";
    public static final String ACCESS_DENY = "Access deny. Please contact your amdinistor.";
    public static final String ACCOUNT_NOT_EXIST = "Account not exist, please register a new one.";

    // Account
    public static final String ACCOUNT_NOT_CONSISTENCE = "Account not consistence.";
    public static final String ACCOUNT_NOT_VALID = "Account not valid.";
    public static final String ACCOUNT_CRDENTIAL_ERROR = "Account crendital error(access_key or access_id).";
    public static final String PHONE_HAS_BIND = "The phone number has been registered";
    public static final String ACCOUNT_SETTING_ERROR = "The account for program setting account configuration error";

    // Account Setting
    public static final String TYPE_EXISTED = "This type already exist, please double  check.";
    public static final String TYPE_NOT_EXIST = "This type does not exist.";
    public static final String ACCOUNTSETTING_NOT_EXIST = "Account setting does not exist.";

    // Customer
    public static final String CONSUMER_EXISTED = "Customer already exist, please double  check.";
    public static final String STATUS_ERROR = "Customer status is incorrect.";
    public static final String PROFILE_ALREADY_COMPLETED = "Customer profile already completed.";
    public static final String CUSTOMER_CANT_EDIT = "Customer cant edit.";
    public static final String VEHICLE_PLATE_EXISTING = "Customer vehicle plate number already exist.";
    public static final String VEHICLE_MODLE = "Customer vehicle modle is incorrect.";
    public static final String PLATE_NUMBER_HAS_BIND = "The plate number has been registered";
    public static final String VEHICLE_NOT_EXIST_OR_STATUS_ERROR = "Customer vehicle not existing or status error.";
    public static final String CUSTOMER_NON_ERROR = "Customer not existing or status error.";
    public static final String IDENTITY_MISSING = "Customer identity is mandatory.";
    public static final String IDENTITY_ALREADY_BINDED = "This identity already binded, please sign in.";
    public static final String COMMUNICATION_NO_CONFIRM = "The communication not confirm";
    public static final String PRIVACY_NO_CONFIRM = "This Privacy not confirm";
    public static final String CUSTOMER_CAN_NOT_DELETE_BY_VEHICLE = "Since the vehicle has not been deleted, the customer cannot be deleted, so please delete the vehicle first";
    public static final String CUSTOMER_CAN_NOT_DELETE_BY_REGISTRATION = "Since the registration has not been deleted, the customer cannot be deleted, so please delete the registration first";
    public static final String CUSTOMER_CAN_NOT_DELETE_BY_CASE = "Since the case has not been deleted, the customer cannot be deleted, so please delete the case first";
    public static final String CUSTOMER_ID_EMPTY = "Customer id is empty";
    public static final String CUSTOMER_PHONE_ERROR = "Customer phone is error";
    public static final String CUSTOMER_ID_LICENSE_NUMBER_CANNOT_BE_MODIFIED = "License plate number cannot be modified";
    public static final String CUSTOMER_VEHICLE_NUMBER_OVER_LIMIT = "The number of vehicles exceeds the limit";

    // Retailer
    public static final String PHONE_EXISTED = "Phone already exist, please double  check.";
    public static final String PLATE_NUMBER_EXISTED = "Phone already exist, please double  check.";
    public static final String BIND_PHONE_ERROR = "Link mobile failed. Please try again later.";
    public static final String RETAILER_NOT_EXIST = "Retailer not exist.";
    public static final String RETAILER_STATUS_INAPPROPRIATE = "Retailer Status is inappropriate.";
    public static final String MASTER_ACCOUNT_STATUS_INAPPROPRIATE = "Retailer master account status is inappropriate.";
    public static final String RETAILER_CREDENTIAL_ERROR = "Retailer OPT or status error or not exist.";
    public static final String TYRE_DATA_ERROR = "Tyre info is empty.";
    public static final String RETAILER_NON_ERROR = "Retailer not exist or status is inappropriate.";
    public static final String RETAILER_SUB_ACCOUNT_NON_EXIST = "Retailer sub account not exist or status is "
            + "inappropriate.";
    public static final String PHONE_HAS_BIND_BY_RETAILER = "The phone number has been registered by retailer";
    public static final String PHONE_HAS_BIND_BY_SUB_ACCOUNT = "The phone number has been registered by retailer sub account";

    public static final String RETAILER_CAN_NOT_DELETE_BY_REGISTRATION = "Since the registration has not been deleted, the retailer cannot be deleted, so please delete the registration first";

    public static final String RETAILER_CAN_NOT_DELETE_BY_CASE = "Since the case has not been deleted, the retailer cannot be deleted, so please delete the case first";
    public static final String RETAILER_ID_EMPTY = "Retailer id is empty";


    // Case
    public static final String ACH_EMPTY = " Account OCH Configuration not setup correctly.";
    public static final String ACH_SETUP_INCORRECT = " Account OCH configuration not setup correctly.";
    public static final String ACH_CASE_HEADER_EMPTY = " Account OCH configuration - customer case header info is empty .";
    public static final String ACH_CASE_TIRE_EMPTY = " Account OCH configuration - customer case tire info is empty .";
    public static final String ACH_FIELD_EMPTY = " Account OCH require field is empty.";
    public static final String ACH_PARAMETER_SETTING_EMPTY = " Account OCH parameter setting is empty.";
    public static final String ACH_CASE_INFO_EMPTY = "Can not find this case  info.";
    public static final String ACH_FIELD_INFO_EMPTY = "The required field is empty,field is ";
    public static final String ACH_CAN_NOT_MATCH = "The required field can't match ,field is  ";
    public static final String ACH_TYPE_ILLEGAL = "Type illegal,type is";
    public static final String ACH_FILE_NOT_EXIST = "File not exist.";
    public static final String ACH_FILE_ILLEGAL = "Files over 2MB,file name is ";

    // Registration
    public static final String MISSING_REQUIRED_FIELD = "Missing required field";
    public static final String REGISTER_TYRE_CNT_ERROR = "Tyres count error or empty";
    public static final String BARCODE_ERROR = "Barcode(serial number) value is incorrect.";
    public static final String MILEAGE_ERROR = "Mileage is required, please double check and provide it.";
    public static final String MILEAGE_EXCEED_MAX = "Mileage can not exceed maximum.";
    public static final String MILEAGE_IMAGE_ERROR = "Mileage photo is required, please double check and provide it.";
    public static final String DOT_ERROR = "Product dot is incorrect.";
    public static final String TYRE_PURCHASE_DATE_ERROR = "Product purchase date is incorrect.";
    public static final String TYRE_PURCHASE_PROOF_EMPTY = "Kindly complete the purchase proof to continue. They are mandatory for the registration.";
    public static final String TYRE_INVOICE_NUMBER_EMPTY = "Kindly complete the invoice number to continue. They are mandatory for the registration.";
    public static final String TYRE_DUPLICATED_ERROR = "Tyre has already been registered.";
    public static final String SERIAL_NUMBER_IMAGE_EMPTY = "serial number image is empty,please double  check.";
    public static final String REGISTRATION_ITEMS_EMPTY = "Registration item is empty,please double  check.";
    public static final String PATTERN_BLACKLIST_ERROR = "Product pattern is blacklisted.";

    public static final String WHEEL_POSTION_ERROR = "wheel postion is incorrect.";

    public static final String REGISTRATION_NOT_EXIST = "Tyre registration not exist.";
    public static final String REGISTRATION_STATUS_ERROR = "Tyre registration can't file a case, maybe alredy filed.";
    public static final String WHEEL_POSITION_EMPTY = "Wheel position is empty";
    public static final String BARCODE_DUPLICATED_ERROR = "Barcode is duplicate";



    // Program
    public static final String PROGRAM_DATA_EMPTY = "Program info is empty.";
    public static final String PROGRAM_STRATEGY_ERROR = "Program strategy error.";
    public static final String PROGRAM_RULE_ERROR = "Program rule error.";
    public static final String PROGRAM_DATATYPE_ERROR = "Program rule data type error";

    // sub account
    public static final String SUB_ACCOUNT_EMPTY = "Sub account is empty,please double  check.";
    public static final String SUB_ACCOUNT_NOT_EXIST = "Sub account not exist.";

    // case evidence
    public static final String CASE_EVIDENCE_EMPTY = "case evidence is empty,please double  check.";

    // customer case
    public static final String CUSTOMER_CASE_EMPTY = "The case is empty,please double  check.";
    public static final String CUSTOMER_CASE_REPEATED = "The case number is repeated";

    public static final String MILEAGE_DISTANCE_OVER_10000 = "Validate mileage - registration mileage > 10000km";

    public static final String CUSTOMER_CASE_FORBID_BY_RETAILER_STATUS = "Cant not file case for retailer";

    // admin
    public static final String TOKEN_INVALID = "Token is invalid";
    public static final String LOGIN_ERROR = "Account or password has error";
    public static final String USER_EMPTY = "User does not exist";
    public static final String PASSWORD_ERROR = "Password error";
    public static final String EMAIL_EMPTY = "Email is empty";
    public static final String EMAIL_EXIST = "Email is exist";

    // customer job
    public static final String JOB_PARAMS_EMPTY = "The job parameter is empty.";
    public static final String JOB_ID_EMPTY = "The job id is empty.";

    // message template
    public static final String MESSAGE_TEMPLATE = "Message template is empty.";
    public static final String MESSAGE_TYPE_NOT_EXIST = "Message type not exist.";
    public static final String MESSAGE_TEMPLATE_EXIST = "The template already exists.";
    public static final String MESSAGE_FIELD_TYPE_NOT_EXIST = "The template field not exists.";

    // vehicle category manufacturers models
    public static final String VEHICLE_CATEGORY_NOT_EXIST = "Vehicle category not exist.";
    public static final String VEHICLE_MANUFACTURERS_NOT_EXIST = "Vehicle manufacturer not exist.";
    public static final String VEHICLE_MODELS_NOT_EXIST = "Vehicle model not exist.";
    public static final String PLATE_NUMBER_ERROR = "Plate number is error";
    public static final String VEHICLE_CAN_NOT_DELETE_BY_REGISTRATION = "Since the registration has not been deleted, the vehicle cannot be deleted, so please delete the registration first";


    // assets
    public static final String ASSETS_GROUP_NOT_EXIST = "Assets group not exist.";
    public static final String ASSETS_GROUP_EXIST = "Assets group  exist.";
    public static final String FILE_UPLOAD_FAILD = "Fail to upload file.";

    // job
    public static final String CLASS_NOT_FOUND = "Class not found.";
    public static final String EXPRESSION_ERROR = "Expression formatting error.";
    public static final String JOB_EXIST = "job or feed has exists.";

    // sms
    public static final String SMS_TEMPLATE_EXIST = "The sms template already exists.";
    public static final String SMS_TEMPLATE_NOT_EXIST = "The sms template not exists.";

    // user role
    public static final String USER_PERMISSION_ERROR_MSG = "User can only have one role";

    // user group
    public static final String USER_GROUP_EXIST = "User group already exists.";
    public static final String USER_GROUP_NOT_EXIST = "User group not exists.";

    // user prefered language
    public static final String LOCAL_LANGUAGE_ERROR = "language not found";

    // campaign
    public static final String CAMPAIGN_NOT_AVAILABLE = "campaign is not active";
    public static final String CAMPAIGN_NOT_AVAILABLE_FOR_CUSTOMER = "campaign is not active for customer";
    public static final String CAMPAIGN_ENABLE_BLACKLIST = "participator in blacklist";
    public static final String CAMPAIGN_REWARD_NOT_AVAILABLE = "campaign prize is not avaiable";
    public static final String CAMPAIGN_COUPON_STATUS_ERROR = "coupon status is not correct";
    public static final String COUPON_NOT_AVAILABLE = "coupon is not avaliable";
    public static final String COUPON_STATUS_ERROR = "coupon status is invalid";

    // reward
    public static final String REWARD_EXIST_ERROR = "reward is not exist";
    public static final String REWARD_NOT_AVAILABLE = "reward is not active";
    public static final String REWARD_NOT_AVAILABLE_FOR_CUSTOMER = "reward is not active for customer";

    // case feedback error
    public static final String CASE_FEEDBACK_ERROR = "Customer case feedback can't be send";

    // api debounce
    public static final String API_DEBOUNCE_ERROR = "can`t call api twice at same times";

    // sms config error
    public static final String SMS_CONFIG_ERROR = "sms config error";

    // in consumer registration limitation
    public static final String REGISTRATION_FORBIDDEN_ERROR = "Dear Customer, Please register your tyres through Dealer login to avail benefit of Conti Summer Mela. Warranty registration can be done only through Dealer login during Campaign period.";

    public static final String DUPLICATE_API_FORBIDDEN_ERROR = "The server is busy, please try again later.";

    public static final String VALIDATE_TYRE_SIZE_ERROR = "抱歉，您添加的輪胎尺寸不匹配。";

    // case
    public static final String REGISTRATION__CANT_NOT_DELETE_WITH_CASE = "Since the case has not been deleted, the registration cannot be deleted, so please delete the case first";

    public static final String PLATE_NUMBER_AND_PHONE_NOT_MATCH = "Plate number and Phone not match";

    // Normal Warranty
    public static final String NORMAL_WARRANTY_CUSTOMER_EMPTY = "Illegal Plate Number";

    // Normal Warranty
    public static final String CANNOT_GET_USER_INFORMATION = "Cannot get user information";

    // Loyalty 发送短信失败
    public static final String LOYALTY_SMS_VERIFICATION_ERROR = "Failed to send a Verification message.";

    public static final String LOYALTY_PASSWORD_PASSWORD_FAILED = "FThe internal system ID indicates that the user name and password are incorrect.";

    public static final String LOYALTY_SMS_TEMPLATE_ERROR = "The incoming SMS template is incorrect";
}
