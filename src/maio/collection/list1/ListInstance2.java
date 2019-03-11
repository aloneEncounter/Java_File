package maio.collection.list1;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ListInstance2
{
    public void testArrayList()
    {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("ddd");
        list.add("bbb");
        list.add("aaa");
        list.add("ccc");

        Collections.sort(list);

        for (Iterator<String> it = list.iterator(); it.hasNext(); )
        {
            String elem = it.next();

            System.out.println(elem);

        }
    }

    //通过外部类进行排序
    public void testArrayListWithDefinitedOuterClass()
    {
        Employee emp = new Employee(1, "zhangsan");
        Employee emp2 = new Employee(2, "lisi");
        Employee emp3 = new Employee(3, "wangwu");
        Employee emp4 = new Employee(4, "zhaoliu");
        Employee emp5 = new Employee(5, "chenqi");

        List<Employee> list = new ArrayList<>();

        list.add(emp4);
        list.add(emp2);
        list.add(emp5);
        list.add(emp);
        list.add(emp3);

        Collections.sort(list, new MyComparatorWithOuterClass());

        for (Employee employee : list)
        {
            System.out.println(employee);
        }
    }

    //通过内部类进行排序
    public void testArrayListWithDefinitedInnerClass()
    {
        Employee emp = new Employee(1, "zhangsan");
        Employee emp2 = new Employee(2, "lisi");
        Employee emp3 = new Employee(3, "wangwu");
        Employee emp4 = new Employee(4, "zhaoliu");
        Employee emp5 = new Employee(5, "chenqi");

        List<Employee> list = new ArrayList<>();

        list.add(emp4);
        list.add(emp2);
        list.add(emp5);
        list.add(emp);
        list.add(emp3);

        Collections.sort(list, new MyComparatorWithInnerClass());

        for (Employee employee : list)
        {
            System.out.println(employee);
        }
    }


    private class MyComparatorWithInnerClass implements Comparator<Employee>
    {
        @Override
        public int compare(Employee o1, Employee o2)
        {
            return o2.getId() - o1.getId();
        }
    }

    //方法的引用(JDK8+)
    public void testArrayListWithMethodRef()
    {
        Employee emp = new Employee(1, "zhangsan");
        Employee emp2 = new Employee(2, "lisi");
        Employee emp3 = new Employee(3, "wangwu");
        Employee emp4 = new Employee(4, "zhaoliu");
        Employee emp5 = new Employee(5, "chenqi");

        List<Employee> list = new ArrayList<>();

        list.add(emp4);
        list.add(emp2);
        list.add(emp5);
        list.add(emp);
        list.add(emp3);

        Collections.sort(list, new MyComparatorWithInnerClass()::compare);

        for (Employee employee : list)
        {
            System.out.println(employee);
        }
    }

    //匿名的内部类
    public void testArrayListWithAnonymousClass()
    {
        Employee emp = new Employee(1, "zhangsan");
        Employee emp2 = new Employee(2, "lisi");
        Employee emp3 = new Employee(3, "wangwu");
        Employee emp4 = new Employee(4, "zhaoliu");
        Employee emp5 = new Employee(5, "chenqi");

        List<Employee> list = new ArrayList<>();

        list.add(emp4);
        list.add(emp2);
        list.add(emp5);
        list.add(emp);
        list.add(emp3);

        Collections.sort(list, new Comparator<Employee>()
        {
            @Override
            public int compare(Employee o1, Employee o2)
            {
                return o1.getId() - o2.getId();
            }
        });

        for (Employee employee : list)
        {
            System.out.println(employee);
        }
    }

    //用Lambda Expression
    public void testArrayListWithLambdaExpression()
    {
        Employee emp = new Employee(1, "zhangsan");
        Employee emp2 = new Employee(2, "lisi");
        Employee emp3 = new Employee(3, "wangwu");
        Employee emp4 = new Employee(4, "zhaoliu");
        Employee emp5 = new Employee(5, "chenqi");

        List<Employee> list = new ArrayList<>();

        list.add(emp4);
        list.add(emp2);
        list.add(emp5);
        list.add(emp);
        list.add(emp3);

        //由匿名来过渡而来
        //lambda使用“->”来定义的，其左边就是匿名类中重写方法的形参列表，其右边就是方法体中的内容
//        Collections.sort(list, (Employee o1, Employee o2) -> {return o1.getId() - o2.getId();});
        Collections.sort(list, (o1, o2) -> {return o1.getId() - o2.getId();});

        for (Employee employee : list)
        {
            System.out.println(employee);
        }
    }

    //用Lambda Expression
    public void testArrayListWithLambdaExpressionAndStream()
    {
        Employee emp = new Employee(1, "zhangsan");
        Employee emp2 = new Employee(2, "lisi");
        Employee emp3 = new Employee(3, "wangwu");
        Employee emp4 = new Employee(4, "zhaoliu");
        Employee emp5 = new Employee(5, "chenqi");

        List<Employee> list = new ArrayList<>();

        list.add(emp4);
        list.add(emp2);
        list.add(emp5);
        list.add(emp);
        list.add(emp3);

        //由匿名来过渡而来
        //lambda使用“->”来定义的，其左边就是匿名类中重写方法的形参列表，其右边就是方法体中的内容
        //        Collections.sort(list, (Employee o1, Employee o2) -> {return o1.getId() - o2.getId();});
        Collections.sort(list, (o1, o2) -> {return o1.getId() - o2.getId();});

//        for (Employee employee : list)
//        {
//            System.out.println(employee);
//        }

        Stream<Employee> stream = list.stream();

        stream.forEach(new Consumer<Employee>()
        {
            @Override
            public void accept(Employee employee)
            {
                System.out.println(employee);
            }
        });

        //Stream一旦被迭代之后不能进行第二次迭代
//        stream.forEach(employee -> System.out.println(employee));
//        stream.forEach(System.out::println);//方法的引用

    }

    //用Lambda Expression
    public void testArrayListWithLambdaExpressionAndStreamPlus()
    {
        Employee emp = new Employee(1, "zhangsan");
        Employee emp2 = new Employee(2, "lisi");
        Employee emp3 = new Employee(3, "wangwu");
        Employee emp4 = new Employee(4, "zhaoliu");
        Employee emp5 = new Employee(5, "chenqi");

        List<Employee> list = new ArrayList<>();

        list.add(emp4);
        list.add(emp2);
        list.add(emp5);
        list.add(emp);
        list.add(emp3);

        Collections.sort(list, (o1, o2) -> {return o1.getId() - o2.getId();});

//        Stream<Employee> stream = list.stream();
        Stream<Employee> stream = list.parallelStream();//并行流：输出没有顺序

        //Stream一旦被迭代之后不能进行第二次迭代
        //        stream.forEach(employee -> System.out.println(employee));
//        stream.forEach(System.out::println);//方法的引用

      /*  stream.filter(new Predicate<Employee>()
        {
            @Override
            public boolean test(Employee employee)
            {
                return false;
            }
        });*/


//        stream.filter(employee -> {return employee.getId() > 3;}).forEach(System.out::println);


//        long counter = stream.filter(employee -> employee.getId() > 3).count();
////
//        System.out.println(counter);

//
//        stream.filter(employee -> employee.getId() > 3).map(new Function<Employee, Emp>()
//        {
//            public Emp apply(Employee employee)
//            {
//                return new Emp(employee.getName());
//            }
//        });


        stream.filter(employee -> employee.getId() > 3).map(employee -> {return new Emp(employee.getName());}).forEach(System.out::println);

    }


    public void testArrayListWithDefinitedObj()
    {
        Emp emp = new Emp("zhangsan");
        Emp emp2 = new Emp("lisi");
        Emp emp3 = new Emp("wangwu");
        Emp emp4 = new Emp("Zhaoliu");
        Emp emp5 = new Emp("chenqi");

        List<Emp> list = new ArrayList<>();

        list.add(emp4);
        list.add(emp);
        list.add(emp5);
        list.add(emp3);
        list.add(emp2);

        Collections.sort(list,((o1, o2) -> o1.getName().compareTo(o2.getName())));
        Collections.sort(list, (o1, o2) -> o2.getName().compareTo(o1.getName()));

        list.forEach(System.out::println);
    }


}
