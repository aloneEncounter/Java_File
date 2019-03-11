package SingletonDemo;
/*
* 单利模式
* 1、类被final修饰（不可被继承）
* 2、构造方法私有（不能通过外部new来调用构造方法）
* 3、要有一个私有的、静态的，被final修饰的实例
* 4、要有一个共有的、静态的，返回满足3条件的实例*/


public final class Singleton {

    private Singleton(){}

    private  static final Singleton a=new Singleton();



    public static Singleton getInstance(){
        return a;
    }


}
