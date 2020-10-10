package cn.myringle.annotation;
public class Injection
{
    @SelfAnnotation(name = "Person")
    static Person person;



    public void show()
    {
        System.out.println(person.getName()+","+person.getAge());
    }

}