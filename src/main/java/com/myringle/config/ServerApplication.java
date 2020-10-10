package com.myringle.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

    @Bean(name = "my-bean-test1")
    @ConfigurationProperties(prefix = "ly.configuration")
    public Person getBean() {
        return new Person();
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ServerApplication.class, args);
//        Person obj = context.getBean("my-bean-test1", Person.class);
//        System.out.println(obj);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println("beanDefinitionName = " + beanDefinitionName);
//        }

        Person Person1 = (Person) context.getBean("getPerson1");
        System.out.println(Person1);
        Person Person2 = (Person) context.getBean("getPerson2");
        System.out.println(Person2);
        Person Person3 = (Person) context.getBean("getPerson3");
        System.out.println(Person3);
        Person Person4 = (Person) context.getBean("getPerson4");
        System.out.println(Person4);

        GirlFriends GirlFriends = (GirlFriends) context.getBean("getGirlFriends");
        System.out.println(GirlFriends);
        GirlFriends GirlFriends2 = (GirlFriends) context.getBean("getGirlFriends2");
        System.out.println(GirlFriends2);
        GirlFriendsArray girlFriendsArray3 = (GirlFriendsArray) context.getBean("girlFriendsArray3");
        System.out.println(girlFriendsArray3);
        ListAdvanceObject ListAdvanceObject = (ListAdvanceObject) context.getBean("getAdvanceList");
        System.out.println(ListAdvanceObject);





    }

}
