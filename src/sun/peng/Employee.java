package sun.peng;

public class Employee {
    private String name;
    private double salary;

    public Employee(){
//        this("tom",1);
        System.out.println("无参构造器");
    }
    public Employee(String name, double salary) {
        this();  //调用无参构造器  必须在第一行
        this.name = name;
        this.salary = salary;
        System.out.println("带参构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
}
