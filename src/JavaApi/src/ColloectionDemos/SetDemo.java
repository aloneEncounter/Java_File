package JavaApi.src.ColloectionDemos;

//测试set的使用

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        NewTitle title1=new NewTitle(1,"北京终于晴天了1","admin");
        NewTitle title2=new NewTitle(2,"北京终于晴天了2","admin");
        NewTitle title3=new NewTitle(3,"北京终于晴天了3","admin");
        NewTitle title4=new NewTitle(4,"北京终于晴天了4","admin");
        NewTitle title5=new NewTitle(5,"北京终于晴天了5","admin");
        Set<NewTitle> set =new HashSet<>();
        set.add(title1);
        set.add(title2);
        set.add(title3);
        set.add(title4);
        set.add(title5);

//        System.out.println(set);
        System.out.println(set.size());
//      遍历无序的集合  ：1、增强型for  2、iterator 迭代器


        //使用增强型for遍历每条新闻信息
        for (Object obj:set) {
            NewTitle title=(NewTitle)obj;
            System.out.println(title.getId() + "--" + title.getTitle());
        }
        System.out.println("**************************");
        //使用迭代器遍历
        Iterator itor =set.iterator();//获得一个迭代器itor
        //通过迭代器迭代出集合元素
        while (itor.hasNext()){   //判断迭代器有无 元素
            NewTitle title=(NewTitle)itor.next();    //  返回 迭代器下一个元素
            System.out.println(title.getId() + "--" + title.getTitle());
        }


    }
}
