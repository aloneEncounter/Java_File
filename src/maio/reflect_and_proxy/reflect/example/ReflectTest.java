package maio.reflect_and_proxy.reflect.example;

import java.lang.reflect.Method;

public class ReflectTest
{
    public static void main(String[] args) throws Exception
    {
        Class<Caculation> clazz = Caculation.class;

        Caculation caculation = clazz.newInstance();


        System.out.println("-------调用sayHi()方法--------");
        //  获取公有的构造方法

        Method method = clazz.getMethod("sayHi", String.class);

        Object methodReturnValue = method.invoke(caculation, "张三");

        System.out.println(methodReturnValue);



        System.out.println("-------调用sayHello()方法--------");

        method = clazz.getDeclaredMethod("sayHello", new Class[]{String.class});

        method.setAccessible(true);//设置方法可访问

        methodReturnValue = method.invoke(caculation, "李四");

        System.out.println(methodReturnValue);




        System.out.println("-------调用sum()方法--------");

        method = clazz.getDeclaredMethod("sum", int.class,Integer.TYPE);

        System.out.println(int.class == Integer.TYPE);//true

        method.setAccessible(true);//设置方法可访问

        methodReturnValue = method.invoke(caculation, 3, 5);

        System.out.println(methodReturnValue);


    }
}
