package maio.collection.wrapperclass;

import java.util.Random;

import static java.lang.Math.abs;//静态导入，不建议大量使用

public class MathAndRandomTest
{
    public static void main(String[] args)
    {
        System.out.println(abs(-1));//绝对值
        System.out.println(Math.ceil(3.2));//求总页数
        System.out.println(Math.floor(-11.5));
        System.out.println(Math.floor(11.5));
        System.out.println(Math.round(3.5));//四舍五入
        System.out.println(Math.random());//随机值[0, 1)

        Random random = new Random();

        System.out.println(random.nextInt(100));
        System.out.println(random.nextDouble());//随机值[0, 1)
    }
}
