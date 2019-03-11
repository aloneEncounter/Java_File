package sun.peng;

public class TestDemo3 {
    void foo(Employee employee) {
         employee.setSalary(2000);
//        employee = new Employee("jack", 2000);


        //nums的内容没有改变，只是这个变量，现在现在引用了另一个新的数组
        //原始的123数组还是存在的，只是这个变量已经不再引用它了

    }

    public static void main(String[] args) {
        TestDemo3 t = new TestDemo3();
        Employee tom = new Employee("tom", 1000);
        t.foo(tom);
        System.out.println(tom);

    }
}
