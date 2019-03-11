//人类
public class Person extends Animal {
    private String name;

/*    public Person(){}
    public Person(String name,String sex){}
    public Person(String name,String sex,int age){
        this(name,sex);//  this  调用自己的构造方法  放到第一行
        this.age=age;
    }*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
