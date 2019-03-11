public class TestDog1 {
    public static void main(String[] args) {
        // 父类引用
        // 指向子类对象
        Pet dog=new Dog("佩奇",30,89,"吉娃娃");
        Dog d =(Dog)dog;    //  向下转型
        d.catchFly();
        /*dog.print();
        Master master=new Master();
        master.cure(dog);
        master.feed(dog);
        dog.print();*/

        System.out.println("******************");


        Pet penguin=new Penguin();
        penguin.setHealth(40);
        penguin.setLove(89);
        penguin.setName("qq1号");
//        penguin.setSex("q仔");
        penguin.print();


//        master.cure(penguin);
        penguin.print();
        Penguin p=(Penguin)penguin;// 向下转型
        p.swim();

    }
}
