package 三大排序;

public class Bubblesort {
    public static void main(String[] args) {
        int[] num={8,7,6,4,2};
        for (int i=0;i<num.length-1;i++){
            for (int j=0;j<num.length-1-i;j++){
                if (num[j]>num[j+1]){
                    int a=num[j];
                    num[j]=num[j+1];
                    num[j+1]=a;

                }
            }

        }
        for (int a:num){
            System.out.print(a);
        }
    }
}
