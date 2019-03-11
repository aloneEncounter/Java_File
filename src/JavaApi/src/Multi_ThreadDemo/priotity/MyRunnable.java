package JavaApi.src.Multi_ThreadDemo.priotity;

// 实现Runnable 接口方式创建线程

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
