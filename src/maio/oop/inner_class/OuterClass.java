package maio.oop.inner_class;

public class OuterClass
{
    public void test()
    {
        System.out.println("测试外部类中的方法");
    }

    public static void test2()
    {
        System.out.println("测试外部类的静态方法");
    }

    public class InnerClass
    {
        public void testInnerClass()
        {
            System.out.println("测试内部类的方法");
        }
    }

    public static class StaitcInnerClass
    {
        public void testStaticInnerClass()
        {
            System.out.println("测试静态内部类的方法");
        }
    }
}
