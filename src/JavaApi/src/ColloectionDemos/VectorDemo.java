package JavaApi.src.ColloectionDemos;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v=new Vector();
        v.add("aaa");
        v.add("zhangsan");
        v.add("lisi");
        v.add("wangwu");

        System.out.println(v.size());
//        for(Enumeration<NewTitle> en=set.elements();en.hasMoreElements();){
//            System.out.println(en.nextElement());
//        }
        //Enumeration  vector独有的方法
        for(Enumeration<String> en =v.elements();en.hasMoreElements();){
            System.out.println(en.nextElement());
        }


    }
}
