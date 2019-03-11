package 数组;

//import java.lang.reflect.Array;
import java.util.Arrays;

//测试Arrays类常用方法
public class ArrayMethod {
    public static void main(String[] args) {
        //equals():比较两个数组是否相等
        int[] arr1={10,50,40,30};
        int[] arr2={10,50,40,30};
        int[] arr3={60,50,85};

        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(arr1,arr3));
        System.out.println("*************************************");

        //sort():对数组进行升序排列
        Arrays.sort(arr1);
        for(int num:arr1){
            System.out.print(num+"\t");
        }
        //降序排列
        for (int i=arr1.length-1;i>=0;i--){
            System.out.print(arr1[i]+"\t" );

        }
        System.out.println("\n********************************************");

        //toString():把一个数组转换成一个字符串
        System.out.println(Arrays.toString(arr1));
        System.out.println("*********************************************8");

        //fill():将数组进行赋值
        int[] arr4={10,50,40,20};
        Arrays.fill(arr4,0,3,40);
        System.out.println(Arrays.toString(arr4));

        //copyOf():把数组复制成一个新的长度的数组
        int[] arr11={10,50,40,60};
        int[] a=Arrays.copyOf(arr11,3);
        System.out.println(Arrays.toString(a));
        int[] arr5= Arrays.copyOf(arr11,8);//超出长度用0补位
        System.out.println(Arrays.toString(arr5));

        System.out.println("*************************");
        //binarySearch():查找某一元素在数组中的位置（前提是，数组已经升序排列好）
        int[] nums={85,1000,456,74};

        int index=Arrays.binarySearch(nums,0,2,1000);
//        Arrays.s
// tream(nums).forEach(System.out::println);//不用for循环输出
        //Arrays.stream(nums).forEach(n->System.out.printf("%-8d",n));
        Arrays.stream(nums).forEach(
                n-> {
                    System.out.printf("%-5d",n);
                     if(n<3  ) System.out.print("1");

                });

        System.out.println(index);


    }

}
