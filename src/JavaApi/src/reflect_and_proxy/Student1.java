package JavaApi.src.reflect_and_proxy;

public class Student1 {


    //-----------构造方法————————————

    public Student1() {
        System.out.println("公有、默认无参构造");
    }

    //有一个参数的构造方法
    public Student1(char name){
        System.out.println("姓名："+name);
    }

    //有多个参数的构造方法
    public Student1(String name ,int age){
        System.out.println("姓名："+name+"年龄："+ age);//这的执行效率有问题，以后解决。
    }

    //受保护的构造方法
    protected Student1(boolean n){
        System.out.println("受保护的构造方法 n = " + n);
    }

    //私有构造方法
    private Student1(int age){
        System.out.println("私有的构造方法   年龄："+ age);
    }



}
