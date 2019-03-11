package com.miao.oop.static_method;

public class Human {
    private static int id;
    private String name;

    public Human(){
//        this.id=0;
        Human.id=0;
    }

    public static void eat(){
        System.out.println("吃饭");
    }

    public class Innerclass{
        public void testInnerClass(){
            System.out.println("测试内部类方法");
        }
    }

}


