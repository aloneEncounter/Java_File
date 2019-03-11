package maio.collection.list1;

import java.util.*;
import java.util.stream.Stream;

public class Demo {
    public void testArrayList(){
        Demo1 d1=new Demo1(1,"zhangsan");
        Demo1 d2=new Demo1(2,"lisi");
        Demo1 d3=new Demo1(3,"wangwu");
        Demo1 d4=new Demo1(4,"jack");
        Demo1 d5=new Demo1(5,"rose");List<Demo1> list =new ArrayList<>();
        list.add(d1);
        list.add(d5);
        list.add(d2);
        list.add(d3);
        list.add(d4);

        //1、匿名内部类实现 Comparator 接口的重写
/*        Collections.sort(list, new Comparator<Demo1>() {
            @Override
            public int compare(Demo1 o1, Demo1 o2) {
                return o1.getId()-o2.getId();
            }
        });*/


        //2、由匿名来过渡而来
        // lambda使用“->”来定义的，其左边就是匿名类中重写方法的形参列表，其右边就是方法体中的内容

        Collections.sort(list,(o1, o2) -> {return o2.getId()-o1.getId();});
        //  只有一天语句时 可简写将 大括号省略
        Collections.sort(list,(o1, o2) -> o2.getId()-o1.getId());


        /*for (Demo1 info:list) {
            System.out.println(info);
        }*/

        //3、使用stream 接口 实现
        Stream<Demo1> stream=list.stream();    //获取串行的Stream对象
//        Stream<Demo1> stream=list.parallelStream();  //  获取并行的steam  输出没有顺序

        //forEach() 用法
    /*    stream.forEach(new Consumer<Demo1>() {  //匿名内部类 实现Consumer接口
            @Override
            public void accept(Demo1 demo1) {  //重写 accpet() 方法
                System.out.println(demo1);
            }
        });*/

        //用lambda 表达式改写(1)
//        stream.forEach(demo1 -> {     //Stream一旦被迭代之后不能进行第二次迭代
//            System.out.println(demo1);
//        });

        //用lambda 表达式改写(2)
       // stream.forEach(demo1 -> System.out.println(demo1));

//        stream.forEach(System.out::println);  // 方法的引用


        //  filter  用法
//        元素过滤：对Stream对象按指定的Predicate进行过滤，返回的Stream对象中仅包含未被过滤的元素
        /*stream.filter(new Predicate<Demo1>() {    //方式1：通过匿名内部类实现
            @Override
            public boolean test(Demo1 demo1) {
                return demo1.getId()>3;
            }
        }).forEach(System.out::println);*/

        // 方式 2 Lambda 表达式
        //stream.filter(demo1 -> { return demo1.getId()>3;}).forEach(System.out::println);

        //  2    计算所有元素的个数
//        long count=stream.filter(demo1 -> { return demo1.getId()>3;}).count();
//        System.out.println(count);

        //map元素一对一转换
        //它接收一个Funcation参数，用其对Stream中的所有元素进行处理，返回的Stream对象中的元素为Function对原元素处理后的结果
        // 方式（1）匿名函数实现 map
        /*stream.filter(demo1 -> demo1.getId()>3).map(new Function<Demo1, Demo2>() {
            public Demo2 apply(Demo1 demo1){

                return new Demo2(demo1.getName());          //demo-->	name:rose
                                                            //demo-->	name:jack

            }
        }).forEach(System.out::println);*/


        //  方式二  Lambda 表达式
        stream.filter(demo1 -> demo1.getId()>3).map(demo1 -> new Demo2(demo1.getName())).forEach(System.out::println);

    }

    public static void main(String[] args) {
        Demo d=new Demo();
        d.testArrayList();
    }

}
