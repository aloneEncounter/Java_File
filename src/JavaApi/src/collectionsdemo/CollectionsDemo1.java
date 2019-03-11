package JavaApi.src.collectionsdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("zoo");
        list.add("animal");
        list.add("fruit");
        list.add("pea");
        list.add("banana");
        list.add("learn");
        list.add("study");
        list.add("teacher");
        list.add("love");

        //打印输出集合中的最大值和最小值、
        String strMax = (String) Collections.max(list);
        String strMin = (String) Collections.min(list);

        System.out.println(strMax + "--" + strMin);    //  zoo--animal

        //升序排序
        Collections.sort(list);
        for (String str : list) {
            System.out.println(str);
        }

        //查找 binarySearch   返回一个int  位置值
        System.out.println(Collections.binarySearch(list, "zoo"));    //8
        System.out.println(Collections.binarySearch(list, "learn"));  //3
        System.out.println(Collections.binarySearch(list, "tom"));    // 找不到返回负值

        System.out.println("*******************************************");
        //反转集合元素  降序排列
        Collections.reverse(list);
        for (String str : list) {
            System.out.println(str);
        }

    }

}
