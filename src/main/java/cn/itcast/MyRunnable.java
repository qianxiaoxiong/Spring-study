package cn.itcast;

import java.util.Date;

public class MyRunnable implements Runnable {

    @Override
    public void run() {


            System.out.println(Thread.currentThread()+"  "+new Date());

    }
}