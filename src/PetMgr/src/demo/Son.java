package demo;

public class Son extends Father {
    int var =90;
    static int staticVar=100;

    public void m1(){
        System.out.println("son类的普通方法");
    }
    public static void staticM2(){
        System.out.println("son类的静态方法");
    }
}
