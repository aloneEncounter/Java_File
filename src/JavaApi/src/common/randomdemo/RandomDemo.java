package common.randomdemo;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        //种子  每次都不一样（jdk 根据种子 生成某种算法  生成随机数）
        //不同的种子构造的Random对象生成的随机数是不同的
        //相同的种子构造的Random对象生成的随机数是相同的


        Random random =new Random();
        Random random1=new Random(22);


        System.out.println(random.nextInt(111));
        System.out.println(random1.nextInt(10));
        /* for (int i = 0; i <= 10; i++) {
            System.out.println(random.nextInt(10)); System.out.println(random.nextInt(10));
        }*/

    }
}
