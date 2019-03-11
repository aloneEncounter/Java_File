package JavaApi.src.Multi_ThreadDemo.priotity;

//设置线程优先级
public class Test {
    public static void main(String[] args) {
        Thread t1=new Thread(new MyRunnable(),"线程A");
        Thread t2=new Thread(new MyRunnable(),"线程B");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
    }
}
