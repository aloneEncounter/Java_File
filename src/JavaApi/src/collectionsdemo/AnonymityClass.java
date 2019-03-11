package JavaApi.src.collectionsdemo;

// 匿名类的 使用
//一般来说，new 一个对象时小括号后应该是分号，也就是new出对象该语句就结束了。但是出现匿名内部类就不一样，小括号后跟的是大括号
//，大括号中是该new 出对象的具体的实现方法。因为我们知道，一个抽象类是不能直接new 的，必须先有实现类了我们才能new出它的实现类。
abstract class Person{
    public abstract void eat();
}

public class AnonymityClass{
    public static void main(String[] args) {

        Person p=new Person() {     // 直接将抽象类Person中的方法在大括号中实现了，这样便可以省略一个类的书写
            @Override
            public void eat() {
                System.out.println("吃饭");
            }
        };
        p.eat();
    }

}

//  等价于

/*
class Child extends Person{

    @Override
    public void eat() {    //重写父类的方法
        System.out.println("人吃饭");
    }
}

public class AnonymityClass{
    public static void main(String[] args) {
        Person p =new Child();
        p.eat();
    }

}
*/

