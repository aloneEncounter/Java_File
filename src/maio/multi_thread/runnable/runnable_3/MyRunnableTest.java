package maio.multi_thread.runnable.runnable_3;

public class MyRunnableTest
{
    public static void main(String[] args)
    {
        MyRunnable mr = new MyRunnable();

        Thread t = new Thread(mr);
        Thread t2 = new Thread(mr);

        t.start();
        t2.start();
    }
}
