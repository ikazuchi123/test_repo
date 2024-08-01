package com.merkle.GenAI.utils.constants.enums.campaign;

import lombok.Getter;

public enum RewardStrategyEnum {

    BUSINESS_STRATEGY("business_strategy","rewardBusinessStrategy"),
    LIMITATION_STRATEGY("limitation_strategy", "rewardLimitationStrategy");

    @Getter
    private final String strategy;

    @Getter
    private final String clazzName;

    RewardStrategyEnum(String strategy, String clazzName) {
        this.strategy = strategy;
        this.clazzName = clazzName;
    }

    public static String getClassName(String strategy) {
        for (RewardStrategyEnum strategyEnum: values()) {
            if (strategy.equals(strategyEnum.strategy)) {
                return strategyEnum.clazzName;
            }
        }
        return null;
    }
}
