package JavaApi.src.collectionsdemo;

// 匿名类的 使用
//一般来说，new 一个对象时小括号后应该是分号，也就是new出对象该语句就结束了。但是出现匿名内部类就不一样，小括号后跟的是大括号
//，大括号中是该new 出对象的具体的实现方法。因为我们知道，一个抽象类是不能直接new 的，必须先有实现类了我们才能new出它的实现类。
interface Human{
    public void speak();
}

/*public class AnonymityClass1{
    public static void main(String[] args) {
        Human  human =new Human() {

            public void learn(){   //   匿名内部类自定义的方法
                System.out.println("学习");
            }

            @Override
            public void speak() {    //  实现接口的的方法speak
                System.out.println("人吃饭");
            }
        };
        human.speak();
       // human.learn();// learn() 方法调用不\
       了


    }
}*/

//  等价于

public class AnonymityClass1{
    public static void main(String[] args) {

        new Human() {

            public void learn(){   //   匿名内部类自定义的方法
                System.out.println("学习");
            }

            @Override
            public void speak() {    //  实现接口的的方法speak
                System.out.println("人吃饭");
            }
        }.learn();

        // human.learn();// learn() 方法调用不了
    }
}
