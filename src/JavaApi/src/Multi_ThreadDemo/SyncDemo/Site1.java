package JavaApi.src.Multi_ThreadDemo.SyncDemo;

// 模拟网站 抢票
//  同步代码快

public class Site1 implements Runnable {
    private int count = 10;  //记录剩余票数
    private int num = 0;   //  记录当前 抢到第几张票


    @Override
    public void run() {
        // 循环  当剩余票数为0时，结束
        while (true) {

            synchronized (this) {
                if (count <= 0) {
                    break;
                }
                // 1、修改数据(剩余票数  抢到第几张票)

                count--;
                num++;

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 2、显示信息 反馈用户抢到第几张票

                System.out.println(Thread.currentThread().getName() + "抢到第" + num + "张票，剩余" + count + "张票");
            }
        }
    }


}