package JavaApi.src.Multi_ThreadDemo.SyncDemo;

//模拟多人抢票

public class Test {
    public static void main(String[] args) {
        Site site=new Site();
        Thread person1=new Thread(site,"张三");

        Thread person2=new Thread(site,"李四");
        Thread person3=new Thread(site,"Jack");

        person1.start();
        person2.start();
        person3.start();
    }
}
