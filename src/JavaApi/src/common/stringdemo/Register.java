package JavaApi.src.common.stringdemo;
import java.util.Scanner;
//字符串常用方法：length（）   注意与数组的length属性的区别
//equals():比较两个字符串内容是否相等
//1、auals()与==       2、创建了几个字符串对象
public class Register {
    public static void main(String[] args) {

      /*  Scanner input=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName=input.next();
        System.out.println("请输入密码：");

        String pwd=input.next();
        if (pwd.length()<6){
            System.out.println("注册密码不足六位，请重新注册！！");
        }else {
            if(userName.equals("tom") && pwd.equals("123456")){
                System.out.println("注册成功");
            }
        }
*/
      //创建了几个字符串对象
        String str="hello";
        String str2=new String("hello");
        System.out.println(str.equals(str2));  //  true   内容相等
        System.out.println(str == str2);    //  false  不是一个对象

        // String 重写了equals（）变成了 比较字符串内容      ==依然是比较两个字符串是否为同一对象
        String s1="hello";
        String s2="hello";
        System.out.println(s1.equals(s2));  //true
        System.out.println(s1 == s2);  //true


        /*String pwd;
        do {
            System.out.println("请输入用户名：");
            String userName=input.next();
            System.out.println("请输入密码：");
            pwd=input.next();
            System.out.println("注册密码不足六位，请重新注册！！");
        }while(pwd.length()<=6);

        System.out.println("注册成功");*/
    }
}
