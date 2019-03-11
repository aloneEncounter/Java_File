package maio.oop.poly;

public class Student extends Human
{

    public void learning()
    {
        System.out.println("学习");
    }

    @Override
    public void eat()
    {
        System.out.println("学生吃饭");
    }
}
