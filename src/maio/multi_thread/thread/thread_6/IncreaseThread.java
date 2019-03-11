package maio.multi_thread.thread.thread_6;

public class IncreaseThread extends Thread
{
    private OperNum operNum;

    public IncreaseThread(OperNum operNum)
    {
        this.operNum = operNum;
    }

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
            this.operNum.incr();
        }
    }
}
