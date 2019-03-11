package JavaApi.src.Multi_ThreadDemo.ThreadPool;

//   创建自定义线程池

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        // 创建一个自定义线程池

        ThreadPoolExecutor executor=new ThreadPoolExecutor(5,7,300,
                TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(4));
        for (int i = 1; i <=12 ; i++) {
            executor.execute(new MyRunnable(i));
            System.out.println("线程池中的数："+executor.getPoolSize()+"，队列中等待执行的任务数："+executor.getQueue().size()+",已经执行完的任务数："+
                    executor.getCompletedTaskCount());
        }
        //  关闭线程池
        executor.shutdown();
    }
}



class MyRunnable implements Runnable{

    int num;  // 第几个任务

    public MyRunnable(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行任务"+num);
        //  休眠2秒钟
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务"+num+"执行完毕");
    }
}
