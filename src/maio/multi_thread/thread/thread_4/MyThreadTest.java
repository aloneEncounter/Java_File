package maio.multi_thread.thread.thread_4;

public class MyThreadTest
{
    public static void main(String[] args)
    {
        ShareVar sv = new ShareVar();

        ShareVar sv2 = new ShareVar();

        MyThread mt = new MyThread("mt", sv);

        MyThread mt2 = new MyThread("mt2", sv2);

        mt.start();

        mt2.start();


    }
}
