package maio.collection.set;

import java.util.*;

public class SetInstance {
    public void testHashSet()//哈希(散列)算法
    {
        Set<String> set = new HashSet<>();

        set.add("fff");
        set.add("bbb");
        set.add("aaa");
        set.add("fff");
        set.add("eee");

//        System.out.println(set.size());    //  4

//        System.out.println(set);     //  [aaa, bbb, eee, fff]


        //1、普通for循环 遍历set
       /* for (String s : set)
        {
            System.out.println(s);
        }*/

        //2、Iterator 迭代器遍历

        for (Iterator<String> it = set.iterator(); it.hasNext(); ) {
            String next = it.next();

            System.out.println(next);
        }

        //3、set 转换成数组
        Object[] obj = set.toArray();

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }

    /*
       xml的常用解析方式：
       1.DOM解析(树状结构)
       2.SAX解析(流式)：
       DOM和SAX的区别：

     */
    public void testTreeSet()//哈希(散列)算法
    {
        NavigableSet<String> set = new TreeSet<>();

        set.add("fff");
        set.add("bbb");
        set.add("aaa");
        set.add("fff");
        set.add("eee");

        System.out.println(set.size());    //4

        System.out.println(set);    //  [aaa, bbb, eee, fff]

        //1、普通for循环遍历 set
    /*    for (String s : set) {
            System.out.println(s);
        }*/

        //2、迭代器遍历set

        for (Iterator<String> it = set.iterator(); it.hasNext(); ) {
            String next = it.next();

            System.out.println(next);
        }

    }
}
