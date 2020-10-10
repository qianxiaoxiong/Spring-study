package com.myringle.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = "com.myringle.config" )
@Configuration //<beans ..
@EnableConfigurationProperties(value = {Person.class})
public class CusConfiguration2 {

    //第二种配置方法
    @Bean
    public Person getPerson2() {
        Person person = new Person();
//         person.setName("aaa");
//         person.setSex("女");   加了也不行
        return person;
    }


}








