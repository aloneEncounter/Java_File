package maio.oop.oop;

import java.util.Scanner;

public class HumanTest
{
    public static void main(String[] args)
    {
        Human human = new Human(21,  "火警", 119);

//        human.id = 110;
//
//        human.name = "金航";
//
//        human.age = 18;

        human.eat();


//        System.out.println(human.name);

        System.out.println(human);
        System.out.println(human.toString());


        //        Human human2 = new Human();
        //
        //        human2.id = 120;
        //
        //        human2.name = "金航";
        //
        //        human2.age = 28;
        //
        //        System.out.println(human2.name);
        Human human2 = null;
//        System.out.println(human2.name);
        Scanner a =null;
        int b=a.nextInt();
        System.out.println(b);


    }
}
