   package JavaApi.src.reflect_and_proxy.sunfei.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

   //  通过反射 操作一个对象   -->  属性
class A{
    private int i;
    A(int i ){this.i=i;}
    double f(int i,double j){
        return i+j;
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                '}';
    }
}
public class Demo3 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        A a=new A(10);
        A b=new A(10);

        Class cl=a.getClass();
        Field i=cl.getDeclaredField("i");
        i.setAccessible(true);   // i为私有的属性 获取访问权限后才可以获取
        System.out.println(i.get(a));   //取值
        i.set(a,99);   //  重新设置类中的值
//        i.set(b,99);   //  重新设置类中的值

        System.out.println(a);

        A c=new A(10);
        Method f=cl.getDeclaredMethod("f", int.class, double.class);

        //  invoke()  调用方法
        System.out.println(f.invoke(a, 1, 1.0));


    }
}
