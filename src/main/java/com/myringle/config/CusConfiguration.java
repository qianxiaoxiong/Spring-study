package com.myringle.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@ComponentScan(basePackages = "com.myringle.config" )
@Configuration //<beans ..
@PropertySource(value = {"classpath:/person.properties"})
public class CusConfiguration {

    @Value("${name}")
    private String name ;
    @Value("${sex}")
    private String sex;

    //第一种配置方法，用@Value 不用spring boot,只是基于spring-context包
    @Bean
    public Person getPerson1() {
        Person person = new Person();
        person.setName(this.name);
        person.setSex(this.sex);
        return person;
    }


}
