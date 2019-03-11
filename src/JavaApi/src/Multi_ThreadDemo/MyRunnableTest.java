package JavaApi.src.Multi_ThreadDemo;

public class MyRunnableTest {
    public static void main(String[] args) {
        // 1、创建线程对象
        Runnable myRunnable=new MyRunnable();
//        MyRunnable myRunnable=new MyRunnable();
        Thread t=new Thread(myRunnable,"MyThread");   //修改线程名字


        // 2、启动线程
        t.start();
    }
}
