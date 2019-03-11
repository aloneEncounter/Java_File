package 数组;
/*有一个数列：8，4，2，1，23，344，12
* 循环输出数列的值
* 求数列中的多有数值之和
* 猜数游戏：从键盘上任意输入一数据，判断数列中是否包含此数
*/
import java.util.Scanner;

public class GussNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] num={8,4,2,1,23,344,12};
        int sum=0;
        //标识；记录用户是否猜对， true；猜对了，false；没猜对。
        boolean flage=false;
        //循环输出每个值
        for (int a:num){
            System.out.print(a+"\t");
            sum+=a;
        }

//        System.out.println("数列中的数为：");
//        for (int i=0;i<num.length;i++){
//            sum+=num[i];
//            System.out.print(num[i]+"\t");
   //     }

        System.out.println("\n数列中的数值总和为："+sum);

        //猜数
        System.out.print("您猜猜有哪个数字：");

        int guess=input.nextInt();
        for (int i=1;i<num.length;i++){
            if (num[i]==guess){
                //猜对了跳出 往后运行
               flage=true;   //标识
                break;
            }
        }
        if (flage){
            System.out.println("恭喜，猜对了");
        }else {
            System.out.println("很遗憾，猜错了");
        }
    }
}
