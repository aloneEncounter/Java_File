//测试  狗狗类

public class TestDog {
    public static void main(String[] args) {
/*        Dog dog =new Dog();
//        dog.name="小白";
        dog.setName("小白");
//        dog.love=4;
        dog.setLove(4);
//        dog.strain="金毛";

        dog.setStrain("金毛");
//        dog.health=-1000;
        dog.setHealth(-100);
        dog.print();
        //只获得狗狗的健康值
        System.out.println(dog.getHealth());*/
//        Dog dog =new Dog("多多",30,89,"吉娃娃");
//        dog.print();

/*        // 狗狗看病
        Master master=new Master();
        master.cure(dog);
        dog.print();*/

        Pet dog=new Dog("佩奇",30,89,"吉娃娃");
        dog.print();
//        Master master=new Master();
//        master.cure(dog);
/*
        Penguin p =new Penguin();
        p.setHealth(100);
        p.setLove(89);
        p.setName("qq1号");
        p.setSex("q仔");
        p.print();   //使用不方便*/
    }
}
