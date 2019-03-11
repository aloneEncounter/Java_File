package maio.multi_thread.runnable.runnable_2;

import java.util.Scanner;

public class MyRunnable implements Runnable
{
    //成员变量是被多个线程所共享，一个线程对同一个对象的成员变量的操作
    // 会影响到其他线程对该对象的成员变量的操作
    int count = 0;
    @Override
    public void run()
    {

        for (int i = 0; i < 5; i++)
        {

            try
            {
                Thread.sleep((long)(Math.random() * 1000));
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 执行第 " + ++count +" 次");
        }
    }
}
