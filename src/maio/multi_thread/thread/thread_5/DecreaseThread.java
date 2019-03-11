package maio.multi_thread.thread.thread_5;

public class DecreaseThread extends Thread
{
    private OperNum operNum;

    public DecreaseThread(OperNum operNum)
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
            this.operNum.decr();
        }
    }
}
