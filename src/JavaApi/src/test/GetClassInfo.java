package JavaApi.src.test;

import java.lang.*;

public class GetClassInfo {

    public void test (String className) throws Exception{

        // 获取Person类对象 (包含包名的全类名)
        Class clazz=Class.forName(className);


        //获取类所在的包名   不包含包的类名
        Package pkg=clazz.getPackage();
        System.out.println(clazz.getSimpleName()+"定义在："+pkg.getName()+"包中");
        System.out.println("---------------------------------------------");

        //获取对象所表示的实体（类、接口、基本类型、void）的超类Class
        //如果此对象是Object类、一个接口、一个基本数据类型或void，他的超类返回Null
        //如果此对象是一个数组类，返回表示Object类的class对象
        Class superClass=clazz.getSuperclass();
        System.out.println(clazz.getSimpleName()+"的超类："+superClass.getName());
        System.out.println("---------------------------------------------");

        //获取Person类所实现的接口
        //如果Person类没有实现任何的接口，返回一个长度为0的数组
        //如果Person类是一个基本数据类型或者void，那么也返回一个长度为0的数组
        Class<?>[] interfaces =clazz.getInterfaces();
        System.out.println("所示现的接口有：");
        for (Class c:interfaces){
            System.out.println(c);
            System.out.println(c.getName());
        }
        System.out.println("----------------------------");


    }

    public static void main(String[] args) throws Exception{
        GetClassInfo getci=new GetClassInfo();
        getci.test("JavaApi.src.stu.Person");
//        getci.test("java.lang.String");
    }

}
