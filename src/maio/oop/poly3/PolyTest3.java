package maio.oop.poly3;

public class PolyTest3
{
    public static void main(String[] args)
    {
        Student student = new Student();

        Fruits fruits = new Fruits();

        Human human = fruits.eatFruits(student);

        if (human instanceof Student)
        {
            Student stu = (Student) human;

            stu.eat();

            stu.learning();

        }
        else
        {
            Teacher tea = (Teacher) human;

            tea.eat();

            tea.teaching();
        }
    }
}
