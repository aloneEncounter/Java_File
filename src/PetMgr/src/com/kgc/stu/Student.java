package com.kgc.stu;

//public
public class Student {
    //实例变量
    private int age;
    String name;
    public String  adddress;
    //类变量
    public static String email;


    //静态 方法    不能访问 类的实例变量和实例方法   不能使用this   可以访问 静态变量  和方法

    public static void method2(){
//        System.out.println(age);     不能访问 类的实例变量和实例方法
//        method();
//        this.age;      不能使用this
        System.out.println(email);   //可以访问 静态变量  和方法

    }

    //实例方法    可访问静态变量、方法、实例变量实例方法
    public void method(){
        System.out.println(age);     //可访问静态变量、方法、实例变量实例方法
        System.out.println(email);
        method2();

    }

}
