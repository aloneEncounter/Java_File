package maio.oop.load_block_sort;

public class SuperClass
{
    private static int num = 12;

    public SuperClass()
    {
        System.out.println("父类构造方法");
    }

    {
        System.out.println("父类代码块");
    }

    static
    {
        System.out.println("父类静态代码块");
    }

//    public static void testStaticMethod()
//    {
//        System.out.println("父类静态方法");
//    }
}
