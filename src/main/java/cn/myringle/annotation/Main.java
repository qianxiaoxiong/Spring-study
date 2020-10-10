package cn.myringle.annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         //反射的三种方式
          //1.
        Class<CusAnnotation> aClass = CusAnnotation.class;
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        //2.
        try {
            Class<CusAnnotation> cusAnnotation = (Class<CusAnnotation>) Class.forName("cn.myringle.annotation.CusAnnotation");
            for (Annotation annotation : cusAnnotation.getAnnotations()) {
                System.out.println(annotation);
            }
            CusAnnota annotation = cusAnnotation.getAnnotation(CusAnnota.class);
            Class value = annotation.value();
            Class<? extends Annotation> aClass1 = annotation.annotationType();
            Class<? extends CusAnnota> aClass2 = annotation.getClass();
            System.out.println(aClass1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



    @Test
    public  void  test() throws IllegalAccessException {

        Class<CusAnnotation> cusAnnotationClass = CusAnnotation.class;

        CusAnnota annotation = cusAnnotationClass.getAnnotation(CusAnnota.class);
        String usernameAnno = annotation.username();
        CusAnnotation cusAnnotation1 =null;
        try {
            cusAnnotation1 = cusAnnotationClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Field username1 = null;
        try {
            username1 = cusAnnotationClass.getDeclaredField("username");


        } catch (Exception e) {
            e.printStackTrace();
        }
//        username1
        username1.set(null,usernameAnno);
        CusAnnotation cusAnnotation = new CusAnnotation();

        System.out.println(cusAnnotation.username);

    }


    @Test
    public  void  test2() throws Exception {
        //取得Injection的类描述类
        Class<Injection> clazz=Injection.class;
        //取得所有的字段描述对象
        Field[] fields=clazz.getDeclaredFields();
        System.out.println(fields.length);
        for(Field field:fields){
            //取得每个字段上面的注解对象
            Annotation[] annotations=field.getDeclaredAnnotations();
            System.out.println(annotations.length);
            for(Annotation annotation:annotations){
                //判断注解对象是不是SelfAnnotation类型的
                if(annotation.annotationType()==SelfAnnotation.class){
                    System.out.println("yes");
                    //通过SelfAnnotation的name获取要使用的beanName
                    String beanName=((SelfAnnotation) annotation).name();
                    //生成一个Peron的类描述类
                    Class<?> cc=Class.forName("cn.myringle.annotation."+beanName);
                    //生成一个Person对象
                    Object ob=cc.newInstance();
                    System.out.println(field.getName());
                    //通过此方法将新建的实例对象赋值给 static Peron person
                    //如果是非static，那么set的第一个参数必须指定实例对象，也就是哪个Injection对象

                    field.set(null, ob);
                    //获取名字为show的方法
                    Method method=clazz.getDeclaredMethod("show");
                    //调用该方法
                    method.invoke(clazz.newInstance());

                    //基本和上面的一样，只是生成Person对象时，反射调用了带参数的构造
                    Class<?> c2=Class.forName("cn.myringle.annotation."+beanName);
                    Class<?>[] ptype=new Class[]{String.class,Integer.class};
                    Constructor<?> ctor=c2.getConstructor(ptype);
                    Object[] obj=new Object[]{new String("lxq"),new Integer(25)};
                    Object object=ctor.newInstance(obj);
                    field.set(null, object);
                    Method method2=clazz.getDeclaredMethod("show");
                    method2.invoke(clazz.newInstance());

                }
            }
        }
        //因为 static Peron person，所以新建的Injectin对象的Peron对象都是通过反射最后赋值过得
        Injection injection=new Injection();
        System.out.println(injection.person.getName()+","+injection.person.getAge());

    }
}
