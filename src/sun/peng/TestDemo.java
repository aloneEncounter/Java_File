package sun.peng;

public class TestDemo {

    //java中的参数用于给方法传递值
    int foo(int i,double d) {
        //参数格式：类型 变量名
        //多个参数用逗号分开，这些参数叫做形参
        //形式参数可以被认为是方法中的变量
        System.out.println("foo");
        return 1;  // 带返回值的方法必须写return

    }
    void fun(){
        System.out.println("foo");
        return;  //可选
    }



    public static void main(String[] args) {
        TestDemo t = new TestDemo();
        //带返回值的方法可以被当作一个常量使用
        // 方法有参数时，在调用时必须给这些参数值
        int i = t.foo(1,2);
        int j=i+1;
        System.out.println(i);
        // 不带返回值的方法
        t.fun();
    }
}
