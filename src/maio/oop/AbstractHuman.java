package maio.oop;

public abstract class AbstractHuman implements IHuman
{
    private int ahid;

    public AbstractHuman()
    {
    }

    public void drinking()
    {
        System.out.println("喝水");
    }

    public abstract void jumping();

    @Override
    public void running()
    {
        System.out.println("跑。。。");
    }
}
