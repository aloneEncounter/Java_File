  package 三大排序;

//经典算法：二分（拆半）查找法
public class SearchNum {
    public static void main(String...args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        int searchNum=8;//要查找的的数字
        int startIndex=0;//定义开始查找范围的下标
        int endIndex=arr.length-1;//定义结束查找范围的下标
        int midIndex=-1;//定义中间位置的下标
        boolean isFind=false;//标记是否找到，false没找到  true找到了


        do {
            midIndex=(startIndex+endIndex)/2;
            if (arr[midIndex]==searchNum){
                System.out.println("恭喜你找到了，下标是："+midIndex);
                isFind=true;
                break;
            }else if (arr[midIndex]>searchNum){
                endIndex=midIndex-1;
            }else{
                startIndex=midIndex+1;
            }
        }while(startIndex<=endIndex);
        if(!isFind){
            System.out.println("抱歉没有找到");
        }
    }
}
