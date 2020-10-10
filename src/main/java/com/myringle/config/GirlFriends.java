package com.myringle.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "ly.configuration")  //产生了映射关系
@Data
public class GirlFriends {


    List<String> girlFriends;

}
