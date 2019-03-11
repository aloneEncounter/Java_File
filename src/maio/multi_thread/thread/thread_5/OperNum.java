package maio.multi_thread.thread.thread_5;

public class OperNum
{
    private int num;

    public synchronized void incr()
    {
        while(this.num == 1)
        {
            try
            {
                //交出线程对该对象的控制权，即释放掉该对象上的锁，同时该方法会阻塞。
                // 直到另一个线程唤醒该对象，该线程将沿着wait之后的路径执行
                this.wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        num++;

        System.out.println(num);

        notify();//唤醒另一个线程对象
    }

    //wait和notify要成对使用
    public synchronized void decr()
    {
        while(this.num == 0)
        {
            try
            {
                //交出线程对该对象的控制权，即释放掉该对象上的锁，同时该方法会阻塞。
                // 直到另一个线程唤醒该对象，该线程将沿着wait之后的路径执行
                this.wait();

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        num--;

        System.out.println(num);

        notify();//唤醒的是另一个线程
    }
}
