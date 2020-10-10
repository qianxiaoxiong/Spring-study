package cn.itcast;


public class testMain {

    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            MyThread thread = new MyThread();

            Thread thread1 = new Thread(thread.getRunnable());

            thread1.start();
            thread1.run();

        }


    }
}
