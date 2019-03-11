package ExceptionDemo;

import java.util.Scanner;

//传统方式处理异常  try-catch

public class Test2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("请输入被除数");
        try {
            int num1 = in.nextInt();
            System.out.println("请输入除数");
            int num2 = in.nextInt();
            System.out.println(num1 + "/" + num2 + num1 / num2);
        }catch (Exception e){
            System.err.println("出现了错误操作");
            //异常对象e;    printStackTrace()  打印异常堆栈信息
            e.printStackTrace();
        }
        System.out.println("感谢使用");

    }
}
