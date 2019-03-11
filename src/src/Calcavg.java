package src;

import java.util.Scanner;

public class Calcavg {
    public static void main(String[] args) {
        //循环录入 某学生5门 成绩 计算平均分
        Scanner input=new Scanner(System.in);
        System.out.print("请输入你的姓名：");
        String name=input.next();
        //标识：用户输入是否有误 true：输入无误 false  输入有误
        boolean flage=true;

        double sum=0;
        double avg=0;
        for (int i=1;i<=5;i++){
            System.out.print("请录入第" + i + "门的成绩:");
            //每门成绩
            double socre=input.nextDouble();
            sum+=socre;
            //如果录入为负数
            if(socre<0){
                System.out.println("分数录入不能为负数");
                flage=false;
                break;
            }
        }
        //if（flage）{} 等同于 flagel==true
        if(flage) {
            avg = sum / 5;
            System.out.print("五门成绩平均分为：" + avg);
        }
    }


}
