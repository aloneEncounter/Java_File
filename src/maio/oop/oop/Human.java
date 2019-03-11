package maio.oop.oop;

public class Human
{
    int id;

    String name;

    int age;

    //初始化属性值
    public Human()//默认构造器(默认构造方法)
    {
        //调用父类中的相应构造方法
//        super();//构造方法中的第一行代码默认是super();
//        this.id = 0;//当前对象
//        this.name = null;
//        this.age = 0;

        this(0, null, 0);//调用同一个类中的相应构造方法
        super.equals("");
    }



    public Human(int id, String name, int age)
    {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void eat()
    {
        System.out.println(name + "吃饭");

        //        return name + "吃饭";
    }

    @Override
    public String toString()
    {
        return "Human{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}
