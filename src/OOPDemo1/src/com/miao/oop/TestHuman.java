package com.miao.oop;

public class TestHuman {
    public static void main(String[] args) {
        Human human=new Human();

        human.name="张三";
        human.age=19;
        human.eat("lisi");
        System.out.println(human.name);
        System.out.println(human);  // com.miao.oop.Human@4554617c    不可直接输出对象信息
        System.out.println(human.toString());    // com.miao.oop.Human@4554617c
        human.H();


    }
}
