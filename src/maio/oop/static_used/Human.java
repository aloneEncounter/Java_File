package maio.oop.static_used;

public class Human
{
    private static int id;//

    private String name;

    public Human()
    {
//        this.id = 0;
        Human.id = 0;
    }

    public void eat()
    {
        this.name = null;
        Human.id = 1;
//        OuterClass.eat2();
    }

    public static void eat2()
    {
        System.out.println("static eat2");
    }


}
