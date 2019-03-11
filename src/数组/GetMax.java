package 数组;//从键盘输入5位同学java考试成绩，并求最大值；

import java.util.Scanner;

public class GetMax {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double[] scores =new double[5];

        for (int i=0;i<scores.length;i++){
            System.out.print("请输入第"+(i+1)+"个同学的成绩：");
            scores[i]=input.nextDouble();
        }
        //获取最高分  max
        double max=scores[0];
        for (int i=1;i<scores.length;i++){
            if (scores[i]>max){
                max=scores[i];
            }
        }
        System.out.println("最高分是："+max);

    }

}
