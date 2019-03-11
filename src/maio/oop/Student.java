package maio.oop;

public class Student extends Human
{
    private /*final*/ int sid;

    public Student()
    {
        super();//调用父类中默认构造方法
        this.sid = 2;
    }

    public Student(int sid, String uname)
    {
        super();
        this.sid = 5;
    }

    public String learning()//方法的签名(声明)
    {
        //this.methodName()表示先在当前类中找是不是有该方法，
        // 如果有就调用该方法，如果没有，则调用父类中的该方法
        this.eat("zhangsan");
        System.out.println("学习");

        return "学习";
    }

    @Override
    public void eat()
    {
        super.eat();
        System.out.println("Student吃的方法");
    }

    public void eat(String name)
    {
        Student s = new Student();

        this.eat();
        System.out.println("学生" + name + "在吃饭");
    }

    @Override
    public String toString()
    {
        return super.toString() + ", " + this.sid;
    }

    public int getSid()
    {
        return sid;
    }

    public void setSid(int sid)
    {
        this.sid = sid;
    }
}
