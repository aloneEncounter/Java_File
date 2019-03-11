package JavaApi.src.reflect_and_proxy.sunfei.reflect;

import JavaApi.src.Multi_ThreadDemo.productor_consumer.Consumer;
import JavaApi.src.reflect_and_proxy.Student;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {


        //得到class对象的3种方式
        // 类.class   对象.getClass  Class.forName
//        Field 字段
        Class cl= Student.class;
        System.out.println("--------------------------------");
        Class superCl=cl.getSuperclass();    //  获取父类的对象
        System.out.println(superCl.getName());


//        Fiel d[] fields=cl.getFields();  //  获取所有公有的属性
        Field[] fields=cl.getDeclaredFields();  //  获取所有的属性
        Arrays.stream(fields).forEach(System.out::println);

        // getDeclaredMethods
        System.out.println("---------------------------");
        Method[] methods=cl.getDeclaredMethods();   //获取类中的所有方法
//        Arrays.stream(methods).forEach(System.out::println);
        Arrays.stream(methods).forEach(e->{
            System.out.println(e);
            Class[] params=e.getParameterTypes();   //  获取所有参数类型
            Arrays.stream(params).forEach(System.out::println);
            System.out.println(e.getReturnType());
        });



        // 获取构造方法
        System.out.println("------------------------------");
        Constructor[] constructor=cl.getDeclaredConstructors();
        Arrays.stream(constructor).forEach(System.out::println);
    }
}
