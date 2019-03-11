package maio.multi_thread.thread.thread_6;


public class OperNumTest
{
    public static void main(String[] args)
    {
        OperNum operNum = new OperNum();

        IncreaseThread it = new IncreaseThread(operNum);

        IncreaseThread it2 = new IncreaseThread(operNum);

        DecreaseThread dt = new DecreaseThread(operNum);

        DecreaseThread dt2 = new DecreaseThread(operNum);

        it.start();

        it2.start();

        dt.start();

        dt2.start();
    }
}
