package maio.oop;

public class HumanTest
{

    public static void main(String[] args)
    {
        Human human = new Human(21, "火警", 119);

        //        human.id = 110;
        human.setId(110);//作用：在类外部为私有变量赋值

        //        human.name = "金航";
        human.setName("金航");
        //        human.age = 18;
        human.setAge(18);
                human.eat();

        //        System.out.println(human.name);
                System.out.println(human.getName());//getter作用：获取相应的属性值

        System.out.println(human);
        System.out.println(human.toString());



        //        OuterClass human2 = new OuterClass();
        //
        //        human2.id = 120;
        //
        //        human2.name = "金航";
        //
        //        human2.age = 28;
        //
        //        System.out.println(human2.name);


    }
}
