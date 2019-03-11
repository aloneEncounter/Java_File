package maio.multi_thread.runnable.runnable_1;

public class MyRunnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("my runnable " + Thread.currentThread().getName() + " run...");
    }
}
