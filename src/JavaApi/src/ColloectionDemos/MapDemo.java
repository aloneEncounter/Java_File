package JavaApi.src.ColloectionDemos;
import com.sun.org.apache.bcel.internal.classfile.StackMapEntry;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//储存国家英文简称--国家全称（键--值对）
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> countries = new HashMap<String,String>();
        //往map集合中添加键值对
        countries.put("CN", "中华人名共和国"); //放入键值对
        countries.put("RU", "俄罗斯联邦");
        countries.put("FR", "法兰西共和国");
        countries.put("US", "美利坚合众国");

        //获取map的元素个数
        System.out.println(countries.size());

        //通过某个键获取某个值
//        String cnStr = (String) countries.get("CN");
        String cnStr = countries.get("CN");
        System.out.println(cnStr);

        //判断map中是否包含某个键
        boolean flag = countries.containsKey("US");
        System.out.println("集合中是否包含US：" + flag);

        //删除特定键对应的键值对
        countries.remove("US");
        System.out.println(countries.size());
        flag = countries.containsKey("US");
        System.out.println("集合中是否包含US：" + flag);

        //分别显示map中键集、值集、键值对集
        System.out.println(countries.keySet());  // [RU, CN, FR]
        System.out.println(countries.values());  //  [俄罗斯联邦, 中华人名共和国, 法兰西共和国]
        System.out.println(countries);      //  {RU=俄罗斯联邦, CN=中华人名共和国, FR=法兰西共和国}
//
     /*   //清空
        countries.clear();
        if (countries.isEmpty()){     // 是否为空
            System.out.println("Map数据已经清空");


        }*/
        System.out.println("*******************************");
        //分别获取Map中的键和值
        //（1）先获取到每个key，然后根据每个key拿到相应的value
        Set<String> keys = countries.keySet();
        //方法一：使用增强型for
        /*for (Object obj : keys) {
            String key = (String) obj;
            String value = (String) countries.get(key);
            System.out.println(key + "--" + value);
        }*/
        for (String key : keys) {
            String value = countries.get(key);
            System.out.println(key + "--" + value);
        }
        System.out.println("*******************************");

        //方法二：使用Iterator 迭代器拿到每一个key
        /*Iterator itor = keys.iterator();   //获得一个迭代器itor
        while (itor.hasNext()) {
            String key = (String) itor.next();
            String value = (String) countries.get(key);
            System.out.println(key + "--" + value);
        }*/
        Iterator<String> itor = keys.iterator();   //获得一个迭代器itor
        while (itor.hasNext()) {
            String key = itor.next();
            String value =countries.get(key);
            System.out.println(key + "--" + value);
        }

        System.out.println("*******************************");
        //（2）先拿到Map中的 键值对，然后再在每个键值对中分别取出来键和值
        /*Set ms=countries.entrySet();   //Map 中所有键值对的集合
        for (Object obj : ms){   //拿出所有键值对
            Map.Entry me=(Map.Entry) obj; //Map中的每一个键值对（Map.Entry类型）
            String key=(String) me.getKey();  //取出每个键值对中的键
            String value=(String) me.getValue();  //取出每个键值对中的值
            System.out.println(key + "--" + value);
        }*/
        Set<Map.Entry<String,String>> ms=countries.entrySet();   //Map 中所有键值对的集合
        for (Map.Entry<String,String> obj : ms){   //拿出所有键值对
//            Map.Entry me=(Map.Entry) obj; //Map中的每一个键值对（Map.Entry类型）
//            String key=(String) me.getKey();  //取出每个键值对中的键
//            String value=(String) me.getValue();  //取出每个键值对中的值
//            System.out.println(key + "--" + value);
            System.out.println(obj.getKey() + "--" + obj.getValue());
        }
        for (Iterator<Map.Entry<String, String>> entryIterator = ms.iterator(); entryIterator.hasNext(); ) {
            Map.Entry<String, String> next =  entryIterator.next();
            System.out.println(next);
        }
    }

}
