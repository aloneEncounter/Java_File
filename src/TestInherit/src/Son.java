//  源文件名字  必须和 Java公共类 （public class）的名字一致，  Java源文件只能有一个公共类 可以有多个非公共类
class Father{
    String name="father";
    public Person m1(){
        System.out.println("father类m1的方法");
        return new Person();
    }
    //静态方法
    public static void m2(){
        System.out.println("父类的静态方法");
    }
}


public class Son extends Father {
    String name="son";
    public Student m1(){
        System.out.println("son类的m1的方法");
        return new Student();       //返回值类型  是父类 返回值的子类
    }
    // 静态方法  中不可用super和this（与对象相关联） static 与类相关，与对象无关
    public static void m2(){
        Father.m2();
        System.out.println("子类的静态方法");
    }

    public void varTest(){
        System.out.println(name);
        System.out.println(super.name);
        super.m1();
    }

    public static void main(String...args){
    /*    Son son =new Son();
        son.varTest();
        son.m1();*/
    Son.m2();
    }

}
