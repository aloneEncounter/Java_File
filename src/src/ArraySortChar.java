package src;

import java.util.*;

public class ArraySortChar {
    //字符排序，并查找某个特殊字符的位置
    public static void main(String[] args) {


        char[] chars = {'a', 'y', 'u', 'f'};
        System.out.println("排序前：");
        for (char c:chars){
            System.out.print(c+"\t");

        }
       System.out.println("\n排序后：");
        Arrays.sort(chars);

        for (char c:chars) {
            System.out.print(c + "\t");
        }
        int index=Arrays.binarySearch(chars,'f');
        System.out.print("\n字符f在数组中的位置是："+index);
    }

}
