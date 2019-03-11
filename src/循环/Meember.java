package 循环;

import java.util.Scanner;

public class Meember {
//输入八位用户编号，如果各位之和能被7整出，则中奖

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入8为会员卡号：");
        int num = input.nextInt();
        int i = 1;
        int sum=0;
        int result;
        while (i <= 8) {
            result=num%10;
            sum+=result;
            num /=10;
            i++;
        }
        if (sum%7==0){
            System.out.println("恭喜你，中奖啦，请领取现金500万");
        }else {
            System.out.println("很遗憾，您没有中奖，谢谢支持！");
        }


    }
}