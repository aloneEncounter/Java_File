package SingletonDemo;

public class SingletonTest {
    public static void main(String[] args) {

        Singleton a=Singleton.getInstance();
        Singleton a1=Singleton.getInstance();
        System.out.println(a==a1);

    }
}
