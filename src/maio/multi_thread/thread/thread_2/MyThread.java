package maio.multi_thread.thread.thread_2;

public class MyThread extends Thread
{
    int count = 0;

    @Override
    public void run()//运行中状态
    {


        for (int i = 0; i < 5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " 运行第" + ++count +"次");
        }
    }
}
