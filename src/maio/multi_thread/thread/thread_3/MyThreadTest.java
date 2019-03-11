package maio.multi_thread.thread.thread_3;

public class MyThreadTest
{
    public static void main(String[] args)
    {
        ShareVar sv = new ShareVar();

        MyThread mt = new MyThread("mt", sv);

        MyThread mt2 = new MyThread("mt2", sv);

        mt.start();

        mt2.start();


    }
}
