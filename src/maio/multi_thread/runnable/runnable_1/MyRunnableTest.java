package maio.multi_thread.runnable.runnable_1;

public class MyRunnableTest
{
    public static void main(String[] args)
    {
        MyRunnable mr = new MyRunnable();

        Thread t = new Thread(mr);

        t.start();
    }
}
