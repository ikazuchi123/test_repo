package com.merkle.GenAI.utils.constants.enums.campaign;

import lombok.Getter;

public enum CampaignStrategyEnum {

    BUSINESS_STRATEGY("business_strategy","campaignBusinessStrategy"),
    LIMITATION_STRATEGY("limitation_strategy", "campaignLimitationStrategy"),
    BLACKLIST_STRATEGY("blacklist_strategy","campaignBlackListStrategy");

    @Getter
    private final String strategy;

    @Getter
    private final String clazzName;

    CampaignStrategyEnum(String strategy, String clazzName) {
        this.strategy = strategy;
        this.clazzName = clazzName;
    }

    public static String getClassName(String strategy) {
        for (CampaignStrategyEnum strategyEnum: values()) {
            if (strategy.equals(strategyEnum.strategy)) {
                return strategyEnum.clazzName;
            }
        }
        return null;
    }
}
