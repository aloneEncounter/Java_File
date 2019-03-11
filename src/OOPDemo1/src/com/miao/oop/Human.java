package com.miao.oop;

public class Human {
    int id ;
    String name ;
    int age;


    //初始化属性值
    public Human(){    //默认构造器

/*        // 调用父类中 相应的构造方法
        super();//构造方法 的第一行代码默认是super（）;
        this.age=0;
        this.name="null";
        this.id=0;*/
        this(0,null,0);//调用同一个类中相应的构造方法
    }
    public Human(int id,String name,int age){
        super();
//        this();   //  super()和this() 不能同时使用 ，因为他们都要求放到构造方法的 第一行
        this.age=age;    //this 代表当前对象
        this.name=name;
        this.id=id;
    }



    public void eat(String username){
        System.out.println("吃饭");

    }
    public void H(){
        System.out.println("火警:"+0+"名字："+name+"年龄："+age);
    }

//    java 中不支持直接输出对象信息  必须通过 toString  强制输出
    public String toString(){
        return  "human{"+id+name +age;
    }

}
