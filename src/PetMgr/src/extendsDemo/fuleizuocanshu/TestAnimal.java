package extendsDemo.fuleizuocanshu;

public class TestAnimal {
    public static void main(String[] args) {
        Master master = new Master();
        Animal animal = master.sendAnimal("cat");
        animal.shout();
    }
}
