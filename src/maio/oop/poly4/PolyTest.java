package maio.oop.poly4;

public class PolyTest
{
    public static void main(String[] args)
    {
        Student student = new Student();

        Human human = student;

        human.eat();

//       human.learning();//会报错

       human.thinking();

    }
}
