package forloop;

import java.util.Scanner;
//3个班5名学员，计算各个班的总成绩
public class ThreeTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arry=new int[3][5];

        for(int i=0;i<arry.length;i++){
            System.out.println("--------------请输入第"+(i+1)+"个班的成绩-------------");
            //记录当前班的每个人
            for (int j=0;j<arry[i].length;j++){
                System.out.print("请输入第"+(j+1)+"个学生的成绩：");
                arry[i][j]=input.nextInt();
            }
        }

        //计算各个班的成绩总和
        System.out.println("**************各个班的成绩总和**************");
        int sum =0;
        for (int i=0;i<arry.length;i++){
            System.out.print("第"+(i+1)+"个班的成绩，");
            sum =0;
            for (int j=0;j<arry[i].length;j++){
                sum += arry[i][j];
            }
            System.out.println("这个班的总成绩是："+sum);
        }
    }
}
