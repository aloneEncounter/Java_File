package maio.multi_thread.thread.thread_2;

public class MyThreadTest
{
    public static void main(String[] args)
    {
        MyThread mt = new MyThread();
        MyThread mt2 = new MyThread();

        mt.start();
//        mt2.start();

        System.out.println("main thread 执行完毕");
    }
}
