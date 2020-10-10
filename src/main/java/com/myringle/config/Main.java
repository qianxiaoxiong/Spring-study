package com.myringle.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

       ApplicationContext AnnotaBeanIOC = (ApplicationContext)new AnnotationConfigApplicationContext(CusConfiguration2.class);
        String[] beanDefinitionNames = AnnotaBeanIOC.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        Person person = (Person) AnnotaBeanIOC.getBean("getPerson");
        System.out.println(person);
        Person person2 = (Person) AnnotaBeanIOC.getBean("getPerson2");
        System.out.println(person2);
        Person person4 = (Person) AnnotaBeanIOC.getBean("getPerson4");
        System.out.println(person4);


//        GirlFriends3 girlFriends3 = (GirlFriends3) AnnotaBeanIOC.getBean(GirlFriends3.class);
//        System.out.println(girlFriends3);

    }
}
