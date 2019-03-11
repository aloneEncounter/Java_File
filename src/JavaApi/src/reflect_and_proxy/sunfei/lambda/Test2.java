package JavaApi.src.reflect_and_proxy.sunfei.lambda;


//  函数式接口

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;


public class Test2 {

    @FunctionalInterface
            // 保证是函数式接口
    interface F {
        int f();
//        int g();
    }

    static void f(IntSupplier intSupplier) {

    }


    public static void main(String[] args) {
////        f(()->{});
//        f(()->{return 1;});
//
        Employee[] staff = new Employee[]{
                new Employee(1, "", new Date()),
                new Employee(5, "A", new Date()),
                new Employee(3, "", new Date()),
                new Employee(5, "Baa", new Date()),
                new Employee(5, "Cx", new Date()),
        };

//        Arrays.sort(staff,new EmployeeSort());  // 传对象
        //Lambda 特殊引用类 型  （实现Comparator接口）

        //  进行比较
        /*Arrays.sort(staff,
                Comparator.comparing(Employee::getId)
                        .thenComparing(Employee::getName)
        );*/

        // 自定义比较规则  按名字比较，谁的名字长就在后边
        /*Arrays.sort(staff,Comparator.comparing(Employee::getName,
                (s,t)-> {
                     return Integer.compare(s.length(), t.length());

                }));*/

        //  可以简化为
        Arrays.sort(staff,Comparator.comparing(Employee::getName,
                Comparator.comparingInt(String::length)));


        //  静态方法的引用
//        Arrays.sort(staff, Test1::empSort);


        Arrays.stream(staff).forEach(a -> System.out.println(a));

        //Lambda  复制给变量
        BiFunction<Employee, Employee, Integer> employeeSprt =
                (o1, o2) -> {
                    if (o1.getId() < o2.getId()) return -1;
                    else if (o1.getId() == o2.getId()) return 0;
                    else return 1;
                };
        //  语法  (o1,o2)->{}  1、必须跟某一接口对应  2、该只有一个抽象方法
        //  o1->{}  1个参数 可省略小括号
        //  o1->       只有一条语句  可省略大括号
        //   无参数() ->{}


    }
}
