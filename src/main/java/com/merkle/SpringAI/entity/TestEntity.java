package com.merkle.SpringAI.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class TestEntity {

    private String name;

    public void hello(){
        System.out.println("hello()");
    }
}
