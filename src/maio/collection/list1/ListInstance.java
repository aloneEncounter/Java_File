package maio.collection.list1;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListInstance
{
    public void testVector()
    {
        Vector v = new Vector();

        v.add("aaa");
        v.add(1);
        v.add(true);
        v.add(1);

//        System.out.println(v.size());//测试Vector中有几个元素

//        System.out.println(v);

//        for (int i = 0; i < v.size(); i++)
//        {
//            System.out.println(v.get(i));
//        }

//        for (Object obj : v)
//        {
//            System.out.println(obj);
//        }
    }

    public void testVector2()//建议使用泛型
    {
        Vector<String> v = new Vector<>();

        v.add("aaa");
        v.add("bbb");
        v.add("ccc");
        v.add("ddd");
        v.add("aaa");


//        for (String temp : v)
//        {
//            System.out.println(temp);
//        }

        for (Enumeration<String> en = v.elements(); en.hasMoreElements();)
        {
            System.out.println(en.nextElement());
        }
    }

    public void testArrayList()
    {
//        List<String> list = new ArrayList<>();//不是线程安全的
        List<String> list = new CopyOnWriteArrayList<>();//线程安全

        list.add("aaa");
        list.add("ddd");
        list.add("bbb");
        list.add("eee");
        list.add("aaa");

        Collections.sort(list);

//        Collections.shuffle(list);

//        list = Collections.synchronizedList(list);//不建议使用

//        for (String s : list)
//        {
//            System.out.println(s);
//        }

        //ArrayList用Iterator迭代器
        for (Iterator<String> it = list.iterator(); it.hasNext(); )
        {
            String next =  it.next();

            System.out.println(next);
        }

//        for (ListIterator<String> iterator = list.listIterator(list.size()); iterator.hasPrevious(); )
//        {
//            String prev =  iterator.previous();
//
//            System.out.println(prev);
//
//        }
    }

    public void testLinkedList()
    {
        List<String> list = new LinkedList<>();

        list.add("aaa");
        list.add("ddd");
        list.add("bbb");
        list.add("eee");
        list.add("aaa");

//        Collections.sort(list);

        for (ListIterator<String> iterator = list.listIterator(list.size()); iterator.hasPrevious(); )
        {
            String prev =  iterator.previous();

            System.out.println(prev);

        }
    }
}
