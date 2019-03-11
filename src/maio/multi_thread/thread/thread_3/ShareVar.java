package maio.multi_thread.thread.thread_3;

import java.util.concurrent.locks.ReentrantLock;

public class ShareVar
{
    private int count;

    //可重入锁 ReentrantLock 粗粒度锁(synchronized修饰方法)
    public synchronized void testShareVar()
    {
        for (int i = 0; i < 5; i++)
        {
            try
            {
                Thread.sleep((long) (Math.random() * 1000));
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " 执行了第 " + ++count + " 次");
        }
    }


    //细粒度
    public void testShareVar2()
    {
        synchronized (this)
        {
            for (int i = 0; i < 5; i++)
            {
                try
                {
                    Thread.sleep((long) (Math.random() * 1000));
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + " 执行了第 " + ++count + " 次");
            }
        }

    }
}
