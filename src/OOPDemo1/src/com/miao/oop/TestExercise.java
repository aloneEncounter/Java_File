package com.miao.oop;

public class TestExercise {
    public static void main(String[] args) {

        Exercise human =new Exercise();
        //通过 引用名.属性名直接赋值
        //通过构造方法赋值
        //通过getter和setter赋值
        human.name="Life is short,I use python";
        human.hobby();
        System.out.println(human.name);
        System.out.println(human.hobby1("睡觉"));

        //  对应的两个 可以同时使用 互不影响
        Exercise human1=new Exercise("zhangsan",2,"nv");
        System.out.println(human1.name);
    }
}
