package forloop;

public class PingXingsbianxing {
    public static void main(String[] args){
        //用for循环输出一个平行四边形
        for(int i=1;i<=5;i++){
            //输出空白
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

//行  空白（5-i）   星星数
// 1    4          5
//2     3          5
//3     2          5
//4     1          5
// 5    0          5