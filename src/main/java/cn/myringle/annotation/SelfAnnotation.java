package cn.myringle.annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SelfAnnotation
{
    String name();
}