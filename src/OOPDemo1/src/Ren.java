package OOPDemo1.src;//人类:自定义数据类型（类模板）  -->>>根据类创建对象

public class Ren {
    //属性（特征）：成员变量
    //姓名  年龄  性别
    String name;
    int age;
    char sex;


    //方法（行为）：成员方法
    //自我介绍
//    public String showInfo(){
//        String info ="我叫："+name+";"+age+"岁;性别："+sex;
//        //（1）返回值  （2）方法结束<return 后面不可写代码>  （3）如果有返回值，只能返回一个值
//        return info;
//
//    }
    // 无返回值  在方法内部  已经打印
     public void showInfo(){
         sayHello();
         String info ="我叫："+name+";"+age+"岁;性别："+sex;
         System.out.println(info);
     }
     public void sayHello(){
         System.out.println("大家好!!");
     }

}
