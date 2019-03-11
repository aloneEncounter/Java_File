package JavaApi.src.Multi_ThreadDemo.join;

// 测试join()

public class ThreadJoinDemo {
    public static void main(String[] args) {
        System.out.println("*************线程强制执行*********************");
        //1、创建线程对象
        Thread temp = new Thread(new MyRunnable(),"temp");
        temp.start();
        for (int i = 0; i < 20; i++) {
            //当主线程执行到i==5时，暂停主线程，让子线程temp执行完毕后，主线程在执行
            if (i==5){
                try {
                    temp.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(200);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行：" + i);
        }
    }
}
