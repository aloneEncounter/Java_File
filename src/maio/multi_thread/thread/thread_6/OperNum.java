package maio.multi_thread.thread.thread_6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OperNum
{
    private int num;

    private final Lock lock = new ReentrantLock();

    private final Condition incrCond = lock.newCondition();

    private final Condition decrCond = lock.newCondition();


    public void incr()
    {
        lock.lock();
        lock.lock();
        try
        {

            while (this.num == 1)
            {
                try
                {
                    incrCond.await();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

            num++;

            System.out.println(num);

            decrCond.signal();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            lock.unlock();
            lock.unlock();
        }

    }

    public void decr()
    {
        lock.lock();
        try
        {
            while (this.num == 0)
            {
                try
                {
                    decrCond.await();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

            num--;

            System.out.println(num);

            incrCond.signal();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            lock.unlock();
        }
    }
}
