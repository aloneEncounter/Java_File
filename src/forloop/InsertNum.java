package forloop;

import java.util.Scanner;

//在长度为5 的数组中（降序），再正确的位置插入一个数值
public class InsertNum {
    public static void main(String[] args) {
//        int[] nums={99,85,82,63,60};
        int[] nums=new int[6];
        nums[0]=99;
        nums[1]=83;
        nums[2]=82;
        nums[3]=63;
        nums[4]=60;
        Scanner input =new Scanner(System.in);
        System.out.print("请输入要插入的值：");
        int num=input.nextInt();

        int index=nums.length;
        //将用户插入的数据和数组中的5个数一次比较，知道遇到第一个比他小的数值为止
        //第一个比他 小的数值所在的位置，就是这个数值要插入的位置
        for(int i=0;i<nums.length;i++){
            if (num>nums[i]){
                index=i;
                break;
            }
        }
        //将原来的数值位置，依次往后移动，留出空位，插入新值
        for (int j=nums.length-1 ;j>index;j--){
            nums[j]=nums[j-1];
        }
        nums[index]=num;
        System.out.println("插入后的下标是："+index);
        System.out.println("插入后的新数组元素是：");
        for (int num1:nums ){
            System.out.print("\t"+num1);
        }
    }

}

