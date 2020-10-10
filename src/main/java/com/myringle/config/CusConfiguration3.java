package com.myringle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = "com.myringle.config" )
@Configuration //<beans ..
public class CusConfiguration3 {

    //第三种配置方法
     @Bean
    public  Person getPerson3(){
         Person person = new Person();
         person.setName("aaa");
         person.setSex("女");
         return person;
    }





    }








