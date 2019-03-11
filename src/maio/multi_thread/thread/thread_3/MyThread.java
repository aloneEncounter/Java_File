package maio.multi_thread.thread.thread_3;

public class MyThread extends Thread
{
    private ShareVar sv;

    public MyThread(String name, ShareVar sv)
    {
        super(name);
        this.sv = sv;
    }

    @Override
    public void run()
    {
        this.sv.testShareVar2();
    }
}
