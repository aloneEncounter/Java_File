package JavaApi.src.reflect_and_proxy.sunfei.reflect;

import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Date date=new Date();

        //得到class对象的3种方式
        // 类.class   对象.getClass  Class.forName
        Class c1=Date.class;
        Class c2=date.getClass();
        Class c3=Class.forName("java.util.Date");

        Date d=(Date) c1.newInstance(); // 通过反射创建一个对象


        Class c4=int.class;   //无包名 类名  点给不出方法

        double[] d1 ={};
        Class c5=d.getClass();
        Class c6=double[].class;
        System.out.println(c6.getName());
    }
}
