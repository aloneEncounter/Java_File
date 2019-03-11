package 数组;

import java.util.Scanner;

public class Shuzu {
    // 数组  计算30个人的平均分
    public static void main(String[] args) {
        double [] scores=new double[30];
        Scanner input=new Scanner(System.in);
        double sum=0;
        for(int i=0;i<scores.length;i++){
            System.out.print("请输入第"+(i+1)+"个同学的成绩：");
            //为数组的30 个格子赋值
            scores[i]=input.nextDouble();
            sum+= scores[i];
        }

        //计算平均分
        double avg=sum/scores.length;
        System.out.println("班级学员的平均分是："+avg);

    }
}
