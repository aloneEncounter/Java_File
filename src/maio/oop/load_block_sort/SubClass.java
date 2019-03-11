package maio.oop.load_block_sort;

public class SubClass extends SuperClass
{
    public SubClass()
    {
        System.out.println("子类构造方法");
    }
    
    {
        System.out.println("子类代码块");
    }

    static
    {
        System.out.println("子类静态代码块");
    }
}
