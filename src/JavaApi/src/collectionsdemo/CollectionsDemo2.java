package JavaApi.src.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        Student s1 = new Student("张三", "男", 1);
        Student s2 = new Student("Jack", "男", 2);
        Student s3 = new Student("小花", "女", 5);
        Student s4 = new Student("小兰", "女", 8);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //打印输出集合中的最大值和最小值、
//        String strMax = (String) Collections.max(list);
//        String strMin = (String) Collections.min(list);

//        System.out.println(strMax + "--" + strMin);    //  zoo--animal

        //升序排序    必须 实现comparable接口  ，重写 compareTo 方法  指定比较规则
        Collections.sort(list);
        for (Student str : list) {
            System.out.println(str.getNumber() + "--" + str.getName() + "--" + str.getSex());
        }

    }
}
