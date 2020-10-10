package cn.itcast;

public class MyThread  extends   Thread{


     public  Runnable getRunnable(){

       return  new MyRunnable();

     }

}
