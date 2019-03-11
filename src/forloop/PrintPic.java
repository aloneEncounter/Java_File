package forloop;

//打印一个菱形
public class PrintPic {
    public static void main(String[] args) {
         for (int i=1;i<=5;i++){
             //空格
             for (int j=1;j<=5-i;j++) {
                 System.out.print(" ");
             }
             //列数，星星
             for (int k=1;k<=2*i-1;k++){
                 System.out.print("*");

             }

             System.out.println();

         }



         //在补一个4行的倒三角形
        for (int i=1;i<=4;i++){
            //空白
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            //星星
            for (int j=1;j<=2*(5-i)-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
