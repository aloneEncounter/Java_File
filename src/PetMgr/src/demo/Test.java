package demo;

public class Test {
    public static void main(String[] args) {
        //绑定机制：静态绑定   动态绑定
        //实例方法  （动态绑定机制）   与引用变量实际引用的对象绑定，调用重写后的方法，由运行时的jvm决定
        //静态方法  （静态绑定机制）   与引用变量所声明的类型对象绑定，实际上在编译阶段就做了绑定
        //成员变量（静态变量和实例变量，静态绑定机制） 与引用变量所声明的类型对象绑定，实际上在编译阶段就做了绑定

        Father f=new Son();
        System.out.println(f.var);
        System.out.println(f.staticVar);
        f.m1();     //  son类的普通方法
        f.staticM2();    //father类的静态方法
    }
}
