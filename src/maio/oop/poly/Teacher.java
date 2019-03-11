package maio.oop.poly;

public class Teacher extends Human
{

    public void teaching()
    {
        System.out.println("教课");
    }

    @Override
    public void eat()
    {
        System.out.println("老师吃饭");
    }
}
