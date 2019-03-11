package com.kgc.objtest;

public class Student {
    //学号  姓名   年龄  体重
    private int sid;
    private String name;
    private int age ;
    private int weight;

    public Student(){}

    public Student(int sid, String name, int age, int weight) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // 重写equals():告诉计算机一个新的规则：如果学号和名字都相同，我们认为是同一个对象
    //把你传过来的obj对象和this（当前学员）比较
    // instanceof 操作符的作用：判断某一个对象是否属于某一类型
    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }   //一开始学生类型相同
        if (!(obj instanceof Student)){
            return false;
        }
        Student s=(Student) obj;
        if (this.sid==s.sid && this.name.equals(s.name)){
            return true;
        }else{ return false;}
    }
   // 重写toString方法
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        Student s1=new Student(1,"张三",18,50);
        Student s2=new Student(1,"张三",18,50);
//        Student s2=s1;    //此时返回  true
        //默认情况下，equals()作用和== 是一样的，都是比较两个对象是否为同一个
//        System.out.println(s1 == s2);    //  false
//        System.out.println(s1.equals(s2));    //false
        // 现实中，如果学号和名字都相同，我们认为就是同一个对象
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.toString());
    }
}
