package JavaApi.src.enumdemo;

public class Student {
    public Genders sex;

    public static void main(String[] args) {
        Student stu =new Student();
        stu.sex=Genders.女;
        System.out.println(stu.sex);
        Boolean a=null;
    }
}
