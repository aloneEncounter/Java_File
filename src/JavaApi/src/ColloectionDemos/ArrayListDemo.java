package JavaApi.src.ColloectionDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//新闻管理
public class ArrayListDemo {
    public static void main(String[] args) {
        // 集合储存多条新闻标题
        NewTitle title1=new NewTitle(1,"北京终于晴天了1","admin");
        NewTitle title2=new NewTitle(2,"北京终于晴天了2","admin");
        NewTitle title3=new NewTitle(3,"北京终于晴天了3","admin");
        NewTitle title4=new NewTitle(4,"北京终于晴天了4","admin");
        NewTitle title5=new NewTitle(5,"北京终于晴天了5","admin");



//        ArrayList list =new ArrayList();
        List<NewTitle> list=new ArrayList<NewTitle>();    //父类引用指向子类对象    使用时只能调用list的方法 ，ArrayList独有的方法不能调用
        list.add(title1);
        list.add(title2);
        list.add(title3);
        list.add(title4);
        list.add(1,title5);  //用泛型后只能添加 Newtitle 类型

        System.out.println(list);
        System.out.println("新闻标题的总数："+list.size());

//        遍厉有序的集合  ：1、普通for，遍历索引 2、增强型for  3、iterator 迭代器

        //1、遍历list， 取出每条新闻标题的题目  get()遍历 返回的是一个 object类型 强制转换成Newtitle 类型
        for (int i = 0; i <list.size() ; i++) {
//            NewTitle title=(NewTitle)list.get(i);
            NewTitle title=list.get(i);

            System.out.println(title.getTitle());
        }
        System.out.println("************************************");
        //2、增强型for
        for (NewTitle title:list) {
//            NewTitle title=(NewTitle) object;
            System.out.println(title.getTitle());
        }
        //3、通过Iterator遍历
        System.out.println("***********************");
        Iterator<NewTitle> itor=list.iterator();
        while (itor.hasNext()){
//            NewTitle title=(NewTitle) itor.next();
            NewTitle title=itor.next();
            System.out.println(title.getTitle()+"--"+title.getAuthor());
        }

        System.out.println("***************************************");
        System.out.println(list.contains(title1));     // contains  判断list中是否包含 title1   true
        list.remove(title1);
        System.out.println(list.contains(title1));    //false   remove  删除title1
        System.out.println(list.size());
        System.out.println("*****************************");
        list.clear();        //    clear（） 清空整个集合
        System.out.println(list.size()); //  0
        System.out.println(list.isEmpty());    //   isEmpty()  判断集合受否为空

    }
}
