package com.myringle.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(value = {GirlFriends.class})
public class CusConfigurationList {
   //List集合

     @Bean
    public  GirlFriends getGirlFriends(){
         GirlFriends girlFriends = new GirlFriends();
         return girlFriends;
    }





    }








