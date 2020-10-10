package cn.myringle;

import org.junit.Test;

public class test {
    public static void main(String[] args) {
        DaysVarible[] values = DaysVarible.values();
        for (DaysVarible value : values) {
            System.out.println("value = " + value);
        }
        DaysVarible monday = DaysVarible.Monday;
        System.out.println(monday);
        int num = monday.getNum();
        System.out.println("num = " + num);
        String descrition = monday.getDescrition();
        System.out.println("descrition = " + descrition);
    }

    @Test
    public void  test(){
        DayVarible1 daysVarible1 = DayVarible1.daysVarible1;
        System.out.println("daysVarible1 = " + daysVarible1.toString());
        Integer num = daysVarible1.getNum();
        System.out.println("num = " + num);
        String name = daysVarible1.getName();
        System.out.println("name = " + name);

        DayVarible1 daysVarible2 = DayVarible1.daysVarible2;

    }
    @Test
    public void  test2(){
        System.out.println("今天是：   "+ Days.Monday+" ");
    }
}
