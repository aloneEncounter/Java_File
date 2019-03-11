package src;

import java.util.Scanner;

public class CalcGreatEighty {
    public static void main(String[] args) {
        //根据输入班级人数，录入相应成绩，计算80分以上人员比例
        Scanner input=new Scanner(System.in);
        System.out.println("请输入班级人数：");
        //班级总人数
        int total =input.nextInt();
        double count=0;
        for (int i=1;i<=total;i++){
            System.out.println("请输入第"+i+"个人的成绩：");
            double score=input.nextDouble();
            if (score<=80){
//                count++;
                continue;
            }
            count++;
        }
        System.out.println("成绩在80分以上的人数为:" + count);
        double rate=count/total*100;
        System.out.println("成绩在80分以上的人数比例是"+rate+"%");



    }


}
