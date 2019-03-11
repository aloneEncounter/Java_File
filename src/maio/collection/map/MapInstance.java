package maio.collection.map;

import java.util.*;

public class MapInstance
{
    public void testHashtable()//同步
    {
        Hashtable<String, String> table = new Hashtable<>();

        table.put("a", "aaa");
        table.put("b", "bbb");
        table.put("c", "ccc");
        table.put("d", "ddd");
        table.put("e", "eee");

        System.out.println(table.keys());
        //1.键(同步获取)  Enumeration
       /* for (Enumeration<String> en = table.keys(); en.hasMoreElements();)
        {
           String keyElement =  en.nextElement();

            System.out.println("key = " + keyElement + ", value = " + table.get(keyElement));

        }*/

        //2.键  Iterator 遍历   keySet() 返回键
        for(Iterator<String> it = table.keySet().iterator(); it.hasNext();)
        {
            System.out.println(it.next());
        }

        //3.键    增强型的for  遍历

//        for (String s : table.keySet())
//        {
//            System.out.println("key = " + s);
//        }
        System.out.println("********************************");
        //1.值(同步获取)   Enumeration
       /* for(Enumeration<String> en = table.elements(); en.hasMoreElements();)
        {
            System.out.println(en.nextElement());
        }*/

        //2.值     Iterator 遍历   values() 返回键
        for (Iterator<String> iterator = table.values().iterator(); iterator.hasNext(); )
        {
            Object value =  iterator.next();

            System.out.println(value);

        }

        //3.值    增强型的for  遍历
//        for (String value : table.values())
//        {
//            System.out.println(value);
//        }

        //键值对   遍历

        Set<Map.Entry<String, String>> set = table.entrySet();   //  键值对

        for (Iterator<Map.Entry<String, String>> it = set.iterator(); it.hasNext(); )
        {
            Map.Entry<String, String> entry =  it.next();

            System.out.println(entry.getKey() + "=>" + entry.getValue());

        }
        for (Map.Entry<String,String> s : set){
            System.out.println(s.getValue() +"--"+ s.getKey());
        }

    }


    public void testHashMap()
    {
        Map<String, String> map = new HashMap<>();

        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        map.put("d", "ddd");
        map.put("e", "eee");

        //1.键
//        for(Iterator<String> it = map.keySet().iterator(); it.hasNext();)
//        {
//            System.out.println(it.next());
//        }

        //3.键
//        for (String s : map.keySet())
//        {
//            System.out.println("key = " + s);
//        }

        //1.值
//        for (Iterator<String> iterator = map.values().iterator(); iterator.hasNext(); )
//        {
//            Object value =  iterator.next();
//
//            System.out.println(value);
//
//        }

        //2.值
//        for (String value : map.values())
//        {
//            System.out.println(value);
//        }

        //键值对
        Set<Map.Entry<String, String>> set = map.entrySet();

        for (Iterator<Map.Entry<String, String>> it = set.iterator(); it.hasNext(); )
        {
            Map.Entry<String, String> entry =  it.next();

            System.out.println(entry.getKey() + "=>" + entry.getValue());

        }

    }

    public void testTreeMap()
    {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");
        map.put("d", "ddd");
        map.put("e", "eee");

        //1.键
        //        for(Iterator<String> it = map.keySet().iterator(); it.hasNext();)
        //        {
        //            System.out.println(it.next());
        //        }

        //3.键
        //        for (String s : map.keySet())
        //        {
        //            System.out.println("key = " + s);
        //        }

        //1.值
        //        for (Iterator<String> iterator = map.values().iterator(); iterator.hasNext(); )
        //        {
        //            Object value =  iterator.next();
        //
        //            System.out.println(value);
        //
        //        }

        //2.值
        //        for (String value : map.values())
        //        {
        //            System.out.println(value);
        //        }

        //键值对
        Set<Map.Entry<String, String>> set = map.entrySet();

        for (Iterator<Map.Entry<String, String>> it = set.iterator(); it.hasNext(); )
        {
            Map.Entry<String, String> entry =  it.next();

            System.out.println(entry.getKey() + "=>" + entry.getValue());

        }

    }
}
