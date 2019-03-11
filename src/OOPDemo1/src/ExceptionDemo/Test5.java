package ExceptionDemo;


import java.util.InputMismatchException;
import java.util.Scanner;

//传统方式处理异常  try-catch-finally
//finally 1、是否发生异常都正常执行   2、不执行的唯一情况 catch中有 system.exit（1）
//多重catch

public class Test5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("请输入被除数");
        try {
            int num1 = in.nextInt();
            System.out.println("请输入除数");
            int num2 = in.nextInt();
            System.out.println(num1 + "/" + num2 + num1 / num2);
        }catch (InputMismatchException e){
            System.err.println("输入必须为整数");
            //异常对象e;    printStackTrace()  打印异常堆栈信息
            e.printStackTrace();
            //退出java虚拟机
//            System.exit(1);
//            return;
        }catch(ArithmeticException e){
            System.out.println("除数不能为0");
            e.printStackTrace();


        }catch(Exception e){
            System.out.println("出现了其他错误操作");
        }finally {
            System.out.println("感谢使用");
        }


    }
}
