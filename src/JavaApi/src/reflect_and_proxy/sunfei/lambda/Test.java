package JavaApi.src.reflect_and_proxy.sunfei.lambda;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import javax.swing.*;
import java.util.function.BiFunction;

class EmployeeSort implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getId() < o2.getId()) return -1;
        else if (o1.getId() == o2.getId()) return 0;
        else return 1;
    }
}

public class Test {




    public static void main(String[] args) {

        Timer timer=new Timer(1000,System.out::println);
//        Timer timer=new Timer(1000,x->System.out.println(x));

        Employee[] staff = new Employee[]{
                new Employee(1, "", new Date()),
                new Employee(2, "", new Date()),
                new Employee(3, "", new Date()),
        };

//        Arrays.sort(staff,new EmployeeSort());  // 传对象
        //Lambda 特殊引用类型  （实现Comparator接口）
        Arrays.sort(staff, (o1, o2) -> {
            if (o1.getId() < o2.getId()) return -1;
            else if (o1.getId() == o2.getId()) return 0;
            else return 1;
        });

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
