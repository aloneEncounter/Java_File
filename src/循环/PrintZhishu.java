package 循环;

public class PrintZhishu {
    //1 11 13 17 19 23...97
    //打印1-100间的质数
    public static void main(String[] args){
        int i=2;
        for (;i<100;i++){
            if (i%2==0 && i!=2 || i%3==0 && i!=3 ||i%5==0 && i!=5 || i%7==0 && i!=7){
                continue;
            }else{
                System.out.println("1-100间的质数为："+i);
            }
        }
//        System.out.println("1-100间的质数为："+i);

    }
}
