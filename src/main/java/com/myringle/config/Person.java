package com.myringle.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "ly.configuration")
public class Person {

    private String name;
    private String sex;
}
