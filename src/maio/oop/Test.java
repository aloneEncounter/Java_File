package maio.oop;

public class Test
{
    public static void main(String[] args)
    {
        //AbstractHuman ah = new AbstractHuman();

        Student student = new Student();

        student.setId(111);
        student.setName("zhangsan");
        student.setAge(23);
        student.setSid(1);

        System.out.println(student);

    }
}
