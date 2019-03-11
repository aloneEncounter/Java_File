package JavaApi.src.Multi_ThreadDemo.ThreadPoolDemo.scheduledThreadpool;

//  使用newScheduledThreadPool() 方法创建线程池
//   延迟  定时执行

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService=Executors.newScheduledThreadPool(3);
        System.out.println("***************开始执行********************");
        scheduledExecutorService.scheduleAtFixedRate(new MyRunnable(),1,2, TimeUnit.SECONDS);


    }

}




class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"延时1秒执行，每2秒执行一次");
    }
}
