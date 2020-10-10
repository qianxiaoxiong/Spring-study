package com.myringle.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class CusConfigurationList2 {


     @Bean
     @ConfigurationProperties(prefix = "ly.configuration")
    public  GirlFriends getGirlFriends2(){
         GirlFriends girlFriends = new GirlFriends();
         return girlFriends;
    }





    }








