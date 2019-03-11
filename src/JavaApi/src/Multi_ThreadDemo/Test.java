package JavaApi.src.Multi_ThreadDemo;

// 获取和设置主线程名字
public class Test {
    public static void main(String[] args) {
        // 1.获取主线程对象
        Thread t=Thread.currentThread();
        System.out.println("当前线程是："+t.getName());

        t.setName("MyJavaThread");
        System.out.println("当前线程是："+t.getName());
    }

}
