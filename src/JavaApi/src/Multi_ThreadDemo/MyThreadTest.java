package JavaApi.src.Multi_ThreadDemo;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();

        /*t1.start();  //  启动线程
        t2.start();  //  启动线程*/

        t1.run();    // 执行后输出的是主线程
        t2.run();    //1.只有一条执行路径  2.依次调用了两次run()方法

    }
}
