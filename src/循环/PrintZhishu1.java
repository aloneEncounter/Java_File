package 循环;

public class PrintZhishu1 {
    //2 3 5 7 11 13 17 19 23...97
    //打印1-100间的质数  方法2;
    public static void main(String[] args) {
        int j = 2;
        for (int i = 2; i < 100; i++) {
            j = 2;
            for (; i % j != 0; j++) {
                continue;
            }
            if (i == j) {
                System.out.println("1-100间的质数为：" + i);
            }
        }
//        System.out.println("1-100间的质数为："+i);

    }
}
