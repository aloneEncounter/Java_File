package JavaApi.src.Multi_ThreadDemo.ThreadPoolDemo.FixedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 使用 newFixedThreadPool() 方法 创建线程池
   //  创建一个固定长度的线程池
public class Test {
    public static void main(String[] args) {
        // 创建 线程池    nThread 为线程池中的线程数目
       ExecutorService fixedThreadPool= Executors.newFixedThreadPool(3);


       // 在线程池中执行10个任务
        for (int i = 0; i <10 ; i++) {
            fixedThreadPool.execute(new MyRunnable(i));   // execute 执行一个线程


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
