package maio.oop.poly;

public class PolyTest
{
    public static void main(String[] args)
    {
        Student student = new Student();

        //        student.eat();
        //
        //        student.learning();

        Teacher teacher = new Teacher();

        //        teacher.eat();
        //
        //        teacher.teaching();

        System.out.println("---------以上是静态绑定，不是多态-------");

        Human human = student;

        human.eat();

        Human human2 = teacher;

        human2.eat();

        System.out.println("---------以上是动态绑定，是多态-------");

        //        Student stu = (Student)human;
        //
        //        stu.learning();
        //
        //        Teacher tea = (Teacher)human2;
        //
        //        tea.teaching();

        //instanceof:判断左边对象的引用是否指向右边类型的一个实例
        //如果转换不当，会抛出ClassCastException异常
        if (human instanceof Teacher)
        {
            Teacher tea = (Teacher) human;

            tea.eat();

            tea.teaching();
        }
        else
        {
            Student stu = (Student) human;

            stu.eat();

            stu.learning();
        }


    }
}
