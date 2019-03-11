package ExceptionDemo;

import java.util.Scanner;

//传统方式处理异常

public class Test1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("请输入被除数");

        int num1=in.nextInt();
        System.out.println("请输入除数");
        int num2=0;
        if (in.hasNextInt()){
            //录入的是整数
             num2=in.nextInt();
             if(num2==0){
                 System.err.println("除数为0，退出");  //错误流
                 System.exit(1);
             }
        }else{
            //录入的不是整数
            System.out.println("录入的除数不是整数。程序退出");
            System.exit(1);//退出java虚拟机  非0 就退出
        }

        System.out.println(num1+"/"+num2+num1/num2);
        System.out.println("感谢使用");

    }
}
