package OOPDemo1.src;
//成员（全局）变量和局部变量

public class VarTest {
    //成员属性（成员（全局）变量）  在类中声明，作用域整个类

    int age;
    String name;

    //成员方法
    public void method(){
        //局部变量  在使用前必须付一个初始值
        int num=1;
        System.out.println(num);
    }
    public void method2(){
        System.out.println(age);
    }

    public void method3(){
        for (int i=0;i<=10;i++){
            System.out.println(i);

        }
    }
}
