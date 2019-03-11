package forloop;

public class Triangle {
    public static void main(String[] args){

        //用for循环输出一个小星星
        for (int i=1;i<=5;i++){
            //输出空白行
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }                               //行  空白（5-i）   星星数（2*i-1）
            //每一行小星星 的个数              //1    4           1
            for (int j=1;j<=2*i-1;j++){    //2    3           3
                System.out.print("*");     //3    2           5
                                          //4     1           7
            }                            // 5     0           9
            //每一行星星输出后都要换行
            System.out.println();
        }

        // 产生0-9中任意整数的方法
        int random=(int)(Math.random()*10);
        System.out.println(random);
    }
}
