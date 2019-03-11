package JavaApi.src.common;
import java.util.Scanner;

public class MathDemo {
    // 会员随机中奖：会员号百位数==计算机随机生成的数字
    public static void main(String[] args) {
        System.out.println(Math.random());// 随机生成 [0~1) 之间的浮点数

        // 随机生成 [0~10) 之间的浮点数
        System.out.println(Math.random() * 10);

        // 随机生成 [0~10) 之间的整数
        System.out.println((int) (Math.random() * 10));
        Scanner input = new Scanner(System.in);
        System.out.println("请输入四位的会员号：");
//        int num = input.nextInt();
        int num = input.nextInt();

        String s=Integer.toString(num); //基本类型转换成字符串
        if (s.length()==4){

            int baiwei = (int) num / 100 % 10;
            int random = (int) (Math.random() * 10);

            if (baiwei == random) {
                System.out.println("中奖了");
            } else {

                System.out.println("没中奖");
            }
        }else {
            System.out.println("输入错误，请输入四位的会员卡号");
        }
    }
}
