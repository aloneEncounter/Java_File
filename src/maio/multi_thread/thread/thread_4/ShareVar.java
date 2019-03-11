package maio.multi_thread.thread.thread_4;

public class ShareVar
{
    static int count = 0;
    public static synchronized void testShareVar()
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

    public static void testShareVar2()
    {
        synchronized (ShareVar.class)
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
