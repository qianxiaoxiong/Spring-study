package com.myringle.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class CusConfigurationArray3 {

   //array数组
     @Bean
     @ConfigurationProperties(prefix = "ly.configuration")
    public  GirlFriendsArray girlFriendsArray3(){
         GirlFriendsArray girlFriendsArray = new GirlFriendsArray();
         return girlFriendsArray;
    }





    }








