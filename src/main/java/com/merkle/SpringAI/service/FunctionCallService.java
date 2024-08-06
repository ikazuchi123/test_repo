package com.merkle.SpringAI.service;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import java.util.function.Function;

import java.util.List;

@Configuration(proxyBeanMethods = false)
public class FunctionCallService {

    //如果想要实现某个function的call，要在这里注册
    @Bean
    @Description("According to the pilot, search for all the Mobile Suits that he has ever driven.")
    public Function<DummyDataService.Pilot, List<DummyDataService.MobileSuit>> searchMobileSuitByPilot(DummyDataService dummyDataService) {
        return dummyDataService::searchMsByName;
    }

}
