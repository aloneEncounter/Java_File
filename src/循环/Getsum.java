package 循环;

public class Getsum {
    //1-10 累加 输出累加总和 大于20 的当签数
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        for (;i<=10;i++){
            sum+=i;
            if(sum>20){
                //System.out.println("1-10之间数字累加之和大于20 的当前数是："+i);
                break;
            }

        }
        //System.out.println("和为："+sum);
        System.out.println("1-10之间数字累加之和大于20 的当前数是："+i);
    }

}
