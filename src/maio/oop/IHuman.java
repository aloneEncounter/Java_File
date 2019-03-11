package maio.oop;

public interface IHuman extends A
{
    public static final int NUM = 0;

    public abstract void running();//接口中方法都是公有的抽象方法

    public default void addDefaultMethod()//公有的默认方法
    {

    }

    public static void addStaticMethod()//公有的静态方法
    {

    }
}
