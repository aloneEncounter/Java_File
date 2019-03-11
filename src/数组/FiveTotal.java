package 数组;

import java.util.Scanner;

public class FiveTotal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] arry=new int[2][5];//第一个5是指5各班，第二个是指每个班有5个人

        //循环录入每个班级 的学员的成绩
        //外层循环：班
        for (int i=0;i<arry.length;i++){
            System.out.println("————————————————请输入第"+(i+1)+"个班的成绩————————————");
            //内层循环：当前班的每个人
            for (int j=0;j<arry[i].length;j++){
                System.out.print("请输入第"+(j+1)+"个同学的成绩：");
                arry[i][j] = input.nextInt();
            }
        }
        //计算各个班分别的总成绩
        System.out.println("\n***************成绩统计******************");
        int sum=0;
        for (int i=0;i<arry.length;i++){
            System.out.print("第"+(i+1)+"个班，");
            sum=0;//每个班进来统计总成绩前，需将sum清零
            for (int j=0;j<arry[i].length;j++){
                sum +=arry[i][j];
            }
            System.out.println("这个班的总成绩是："+sum);
        }
    }
}
