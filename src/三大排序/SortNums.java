package 三大排序;

import java.util.Arrays;

//用选择排序
public class SortNums {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 9, 1};
        int min = -1;//最小值下标

        //外层：计较几轮
        for (int i = 0; i < arr.length-1; i++) {
            min = i;//每轮min的初始值

            //内层:当前元素和后面元素比较，记录最小元素下标
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {//即升序排列   降序排列 将大于号改为小于号
                    min = j;
                }
            }
            //如果min发生变化，说明发现了更小的值，则将当前值和更小值交换，保证最小值放到数组的前面
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        //输出排序后的数组
        //System.out.print(Arrays.toString(arr) + "\t");
        for (int num : arr) {
            System.out.print(num+"\t");
        }
    }
}
