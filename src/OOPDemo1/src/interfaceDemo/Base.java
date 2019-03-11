package interfaceDemo;

//父类
public abstract class Base {
    public Base(){
        System.out.println("父类的无参构造方法");

    }
}

//子类
class Sub extends Base{
    public Sub(){
        System.out.println("子类的无参构造方法");
    }

    public static void main(String[] args) {
        Base b=new Sub();
    }
}
