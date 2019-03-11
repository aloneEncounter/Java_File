package com.kgc.stu;

public class Test {

    public static void main(String[] args) {


        Student stu = new Student();
        System.out.println(stu.name);
        System.out.println(stu.adddress);
        System.out.println(Student.email);
        stu.method();
        Student.method2();


        Math.random();    //产生随机数
    }
}

