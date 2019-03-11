package OOPDemo1.src;//榨汁机的测试类

import java.util.Scanner;

public class TestZhaZhi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入水果：");

        ZhaZhiJi ji1=new ZhaZhiJi();
//        String zhi=ji1.zhazhi("苹果");

        String fruit=input.next();
        System.out.print("你想要几杯：");
        int num =input.nextInt();

        //方法调用处：参数叫做实际参数，也叫实参
        //实参名字也可随便取，但是遵循驼峰命名规则，同时也要有意义
        //实参和形参的类型必须一致，名字可以一致，也可以不一致



        //方法有没有返回值  和 方法有没有参数 没有任何关系
        //方法参数可以有一个，也可以有多个，多个参数值间用逗号隔开（在形参和实参都是这样）
        //形参实参数量一定要一致，数据类型一定要一致

        String zhi =ji1.zhazhi(num,fruit);

        System.out.println(zhi);

    }

}
