package com.merkle.GenAI.utils.constants;

public class RedisDirectory {

    public static final String VERIFICATION_CODE = "verificationCode:";

    // SECONDS
    public static final int VERIFICATION_CODE_EXPIRATION_TIME = 300;

    public static final Long VERIFICATION_CODE_EXPIRATEDAT = 300L;
    //登录token 过期时间
    public static final Integer EXPIRE_DATE = 2 * 60 * 60;

    //APP 登录token 过期时间
    public static final Integer APP_EXPIRE_DATE = 30 * 24 * 60 * 60;
    //登录用户类型
    public static final String TOKEN_BEFORE_USER = "User";
    public static final String TOKEN_BEFORE_RETAILER  = "Retailer";
    public static final String TOKEN_BEFORE_RETAILER_SUB_ACCOUNT  = "RetailerSubAccount";
    public static final String TOKEN_BEFORE_CONSUMER  = "Consumer";


}
