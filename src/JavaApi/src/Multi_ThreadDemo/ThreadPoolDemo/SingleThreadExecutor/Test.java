package JavaApi.src.Multi_ThreadDemo.ThreadPoolDemo.SingleThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 使用 newSingleThreadExecutor() 方法 创建线程池
   //  创建一个单线程池
public class Test {
    public static void main(String[] args) {
        // 创建 线程池
       ExecutorService singleThreadExecutor= Executors.newSingleThreadExecutor();

       // 在线程池中执行10个任务
        for (int i = 0; i <10 ; i++) {
            singleThreadExecutor.execute(new MyRunnable(i));   // execute 执行一个线程
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable implements Runnable {
    int num;


    public MyRunnable(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" +num);
    }
}
