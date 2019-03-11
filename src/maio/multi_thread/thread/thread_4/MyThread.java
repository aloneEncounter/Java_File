package maio.multi_thread.thread.thread_4;

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
        ShareVar.testShareVar2();
    }
}
