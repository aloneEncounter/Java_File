package maio.oop.singleton;

/**
 * 单例模式
 * 1.类被final修饰(不能被继承)
 * 2.构造方法私有(不能通过外部new来调用构造方法)
 * 3.要有一个私有的、静态的、被final修饰的实例
 * 4.要有一个公有的、静态的、返回满足3条件的实例
 */
public final class Singleton
{
    private static final Singleton SINGLETON_INSTANCE = new Singleton();

    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        return SINGLETON_INSTANCE;
    }
}
