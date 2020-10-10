package com.myringle.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = "com.myringle.config" )
//@Component //<beans ..
@Configuration  //@Componetn @Configuration都可以  不加不可以，最好用@Configuration
public class CusConfiguration4 {

    //第四中种配置方法   不用@EnableConfigureProperties() 只用@ConfigurePropertis()
     @Bean
     @ConfigurationProperties(prefix = "ly.configuration")
    public  Person getPerson4(){
         Person person = new Person();
         return person;
    }





    }








