package 数组;

import jdk.internal.org.objectweb.asm.tree.IincInsnNode;

import java.util.Scanner;
// 输入5次消费金额，并计算总金额
public class Demo {
    public static void main(String[] args) {
        double[] money=new double[5];
        Scanner input=new Scanner(System.in);
        System.out.println("请输入会员本月的消费记录：");
        double sum=0;
        for(int i=0;i<money.length;i++) {
            System.out.print("请输入第" + (i + 1) + "次消费金额：");
            money[i] = input.nextDouble();

        }
        System.out.println("序号\t\t金额（元）");
        for (double pay:money) {
            sum += pay;
        }

        for(int i=1;i<=money.length ;i++) {

            System.out.println(i+"\t\t" + money[i-1]);
        }
        System.out.println("消费总经额是："+sum);




    }


}
