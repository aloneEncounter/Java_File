package OOPDemo1.src;//学生类

public class Student {
    //属性： 姓名  成绩
    String name;
    int score;
    //一个类中允许出现多个同名但不同参数的方法 ，这种方法叫方法重载


    //构造方法
    //1、该方法缺少返回值     2、该方法名字必须和类名一样
    //每个类都有一个默认无参构造方法
    //但是，一旦手工添加了带参构造方法，那么系统默认的无参构造方法就被覆盖掉了，你想使用，必须显示
    // 的写出来

    public Student(){}

    //带参数

    public Student(String name,int score){
        //this 是什么， this是当前对象
        this.name=name;
        this.score=score;
    }

    //方法：显示个人成绩的信息
    public void showInfo(){
        System.out.println(name+"的成绩是："+score);
    }

}
