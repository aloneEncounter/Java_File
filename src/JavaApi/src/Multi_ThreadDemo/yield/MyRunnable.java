package JavaApi.src.Multi_ThreadDemo.yield;


public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"运行："+i);

            // 当i==3时。线程礼让，当前线程将CPU资源让出
            if (i==3){

                System.out.println("线程礼让");
                Thread.yield();

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
