package maio.oop.singleton;

public class SingletonTest
{
    public static void main(String[] args)
    {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton == singleton2);
    }
}
