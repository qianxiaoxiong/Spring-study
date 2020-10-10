package com.myringle.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class CusConfigurationAdvanceList {


     @Bean
     @ConfigurationProperties(prefix = "ly.configuration")
    public  ListAdvanceObject getAdvanceList(){
         ListAdvanceObject listAdvanceObject = new ListAdvanceObject();
         return listAdvanceObject;
    }





    }








