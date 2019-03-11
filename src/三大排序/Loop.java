package 三大排序;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        for (int i = 1; i <9; i++) {
//            for (int i1 = 0; i1 <9; i1++) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//
//        }
        //水仙花数：该数的每一位数字的立方和刚好等于该数本身
       // Scanner input = new Scanner(System.in);
       // System.out.print("请输入一个数字：");
        //int num = input.nextInt();
        int i=100;
        for (;i<1000;i++){
            int geiwei=i%10;
            int shiwei=i/10%10;
            int baiwei=i/100;
            int sum=geiwei*geiwei*geiwei+shiwei*shiwei*shiwei+baiwei*baiwei*baiwei;
            if(sum==i){
                System.out.println(i);
             }

        }
        int a=10;
        int b=-3;
        System.out.println(a%b);
        System.out.println(a/b);
    }
}
