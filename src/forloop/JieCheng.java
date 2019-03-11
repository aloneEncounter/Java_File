package forloop;

import java.util.Scanner;

public class JieCheng {
    public static void main(String[] args){
        //计算 n1! 1*2*3*...n
        Scanner input =new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int n=input.nextInt();
        int result=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            result*=i;    //1 2*1 3*2*1
            sum+=result;
        }
        System.out.println(n+"的阶乘为："+result);
        System.out.println("1!+2!+3!+..."+n+"!="+sum);
    }




}
