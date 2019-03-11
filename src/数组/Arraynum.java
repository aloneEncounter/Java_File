
import java.util.Arrays;
//将数组 从小到大排序 Arrays.sort()
// Arrays.toString()可以打印数组的内容
// Arrays.sort(int[] a,int fromindex  , int toindex );对数组部分进行排序
// 就是对数组a 的下标从fromindex 到toindex-1的元素进行排序，小标为toindex 不包含在内
//Arrays.copyOf()对数组进行复制
public class Arraynum {
    public static void main(String[] args) {
        int[] array={6,8,10,5,3};
        int[] array1=new int[6];
        //Arrays.sort(array);
        Arrays.sort(array,1,4);
        Arrays.fill(array1,0,1,1);
        int[] a=Arrays.copyOf(array,3);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(a));
        num();
    }
    //请打印出所有的“水仙花”数
    //    水仙花数：该数的每一位数字的立方和刚好等于该数本身
    public static void num(){
        for (int i=100;i<1000;i++){
            int gewei=i%10;
            int shiwei=i/10%10;
            int baiwei=i/100;
            if (gewei*gewei*gewei+shiwei*shiwei*shiwei+baiwei*baiwei*baiwei==i){
                System.out.println(i+"是水仙花数");
            }
        }
        String str = "123456";
        for(int i = 0; i < str.length(); i++)
        {
            System.out.println(str.toCharArray()[i]);
        }
    }
}
