package JavaApi.src.Multi_ThreadDemo.join;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <15 ; i++) {
            try {
                Thread.sleep(100);    //  执行一次休眠0.1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"运行："+i);
        }
    }
}

