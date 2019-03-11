package forloop;


//杨辉三角形

public class PascalTriangle {
/*    public static void main(String[] args) {

        for(int i=1;i<5;i++){
            for (int j=1;j<5-i;j++){
                System.out.print(" ");
            }
            for (int a=1;a<=i;a++){
                System.out.print(a);
            }
            for (int b=i;b>=2;b--){
                System.out.print(b-1);

            }
            System.out.println();
        }
        As();
    }*/

    public static void main(String... args) {
        int[][] num = new int[10][];

        for (int i = 0; i <= num.length; i++) {
            //初始化第二层数字大小

                num[i] = new int[i + 1];
            for (int j = 0; j <=i; j++) {
                if (i==0 || j==i ||j==0) {
                    num[i][j]=1;
                } else {
                    num[i][j] = num[i - 1][j] + num[i - 1][j - 1];
                }
                System.out.print(num[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}


