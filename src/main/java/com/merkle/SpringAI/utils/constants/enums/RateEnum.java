package com.merkle.SpringAI.utils.constants.enums;

import lombok.Getter;

@Getter
public enum RateEnum {
    BEST_DEALER_DISTANCE_RATE(0.8);

    private final Double rate;

    RateEnum(Double rate) {
        this.rate = rate;
    }

}
