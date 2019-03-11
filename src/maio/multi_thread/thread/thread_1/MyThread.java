package maio.multi_thread.thread.thread_1;

public class MyThread extends Thread
{
    @Override
    public void run()//运行中状态
    {
//        System.out.println("my thread " + this.getId() + " run....");
//        System.out.println("my thread " + this.getName() + " run....");
//        System.out.println("my thread " + Thread.currentThread().getId() + " run....");
        System.out.println("my thread " + Thread.currentThread().getName() + " run....");

        //io肯定阻塞
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }//该方法执行完毕后该线程就是一种死亡状态
}
