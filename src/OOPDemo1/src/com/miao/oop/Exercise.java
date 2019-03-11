package com.miao.oop;
//  创建一个人类
public class Exercise {
    String name;
    int age ;
    private String sex;

    //构造方法 方法名与类名相同  初始化对象的信息  通过new直接调用
    public Exercise(){
        this("lisi",18,"woman");// 调用同一个类中相应的构造方法
    }

    public Exercise(String name, int age, String sex) {
        super();//   必须在 构造方法的第一行   调用父类中默认的构造方法
        this.name = name;
//   不在第一行就会报错   同时也不可与this同时使用（this，与super一样都要放到构造方法的第一行）
//        super();
        this.age = age;
        this.sex = sex;
    }


    void  hobby(){
        System.out.println("玩游戏");

    }
    String hobby1(String love){
        return love;
    }
}
