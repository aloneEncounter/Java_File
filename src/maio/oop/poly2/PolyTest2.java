package maio.oop.poly2;

public class PolyTest2
{
    public static void main(String[] args)
    {
        Student student = new Student();

        Fruits fruits = new Fruits();

        fruits.eatFruits(student);

        Teacher teacher = new Teacher();

        fruits.eatFruits(teacher);
    }
}
