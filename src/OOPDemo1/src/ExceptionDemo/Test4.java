package ExceptionDemo;

import java.util.Scanner;

//传统方式处理异常   try--catch

public class Test4 {
    public static void main(String[] args) {
      /*  Scanner in =new Scanner(System.in);
        System.out.println("请输入被除数");
        try {
            int num1 = in.nextInt();
            System.out.println("请输入除数");
            int num2 = in.nextInt();
            System.out.println(num1 + "/" + num2 + num1 / num2);
        }catch (ArithmeticException e){
            System.err.println("出现了错误操作");
            //异常对象e;    printStackTrace()  打印异常堆栈信息
//            e.printStackTrace();
            System.out.println(e.getMessage());  //打印异常的 字符串信息
            
        }
        System.out.println("感谢使用");*/
      // 1、数组下标越界异常    ArrayIndexOutOfBoundsException
        try {
            int[] num = new int[5];
            System.out.println(num[6]);  //  ArrayIndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        //2、空指针异常 NullPointerException
        String s=null;
        System.out.println(s.equals("aaa"));     //java.lang.NullPointerException
    }
}
