package maio.reflect_and_proxy.reflect.example;

public class Caculation
{
    public void sayHi(String name)
    {
        System.out.println(name + ": hi!");
    }

    private String sayHello(String name)
    {
        return name + ": Hello!";
    }

    private int sum(int num, int num2)
    {
        return num + num2;
    }
}
