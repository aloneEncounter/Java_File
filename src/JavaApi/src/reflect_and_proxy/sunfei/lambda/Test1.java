package JavaApi.src.reflect_and_proxy.sunfei.lambda;


//  方法的引用

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.function.BiFunction;


public class Test1 {
    public static int empSort(Employee o1, Employee o2) {
        if (o1.getId() < o2.getId()) return -1;
        else if (o1.getId() == o2.getId()) return 0;
        else return 1;
    }


    public static void main(String[] args) {

        Timer timer = new Timer(1000, System.out::println);
//        Timer timer=new Timer(1000,x->System.out.println(x));

        int j=1;   //最终变量
        Employee[] staff = new Employee[]{
                new Employee(1, "", new Date()),
                new Employee(2, "", new Date()),
                new Employee(3, "", new Date()),
        };

//        Arrays.sort(staff,new EmployeeSort());  // 传对象
        //Lambda 特殊引用类型  （实现Comparator接口）

        args=null;
        Arrays.sort(staff, (o1, o2) -> {
//            j=2;   会报错在lambda表达式中使用时，外围变量不可重新赋值
//            String[] s=args;
            if (o1.getId() < o2.getId()) return -1;
            else if (o1.getId() == o2.getId()) return 0;
            else return 1;
        });


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
