package maio.oop;

public /*final*/ class Human extends AbstractHuman
{
    private int id;//包级别(默认级别)

    private String name;//访问修饰符使用在成员变量上、类、方法

    private int age;

    //初始化属性值
    public Human()//默认构造器(默认构造方法)
    {
        //调用父类中的相应构造方法
        //        super();//构造方法中的第一行代码默认是super();
        //        this.id = 0;//当前对象
        //        this.name = null;
        //        this.age = 0;

        this(0, null);//调用同一个类中的相应构造方法
    }

    public Human(int id, String name)
    {
//        super();
//        this.id = id;
//        this.name = name;
        this(id, name, 0);
    }


    public Human(int id, String name, int age)
    {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public /*final*/ void eat()
    {
        int num = 3;
        System.out.println("吃饭");

        //        return name + "吃饭";
    }

//    void cry()
//    {
//        System.out.println("哭");
//    }
//
//    String cry(String name)
//    {
//        return name + "在哭";
//    }
//
//    int cry(int name)
//    {
//        return id;
//    }
//
//    String cry(int id, String name)
//    {
//        return name + "在哭";
//    }
//
//    int cry(String name, int id)
//    {
//        return id;
//    }

    @Override
    public String toString()
    {
        return "Human{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public void jumping()
    {
        System.out.println("跳。。。");
    }
}
