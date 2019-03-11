package forloop;

import java.util.Scanner;
public class C1{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double[] money=new double[5];
        for(int i=0;i<money.length;i++){
            System.out.print("第"+(i+1)+"购物金额：");
            money[i]=input.nextDouble();
        }
        for(double a:money){
            System.out.println(a);
        }

    }
}