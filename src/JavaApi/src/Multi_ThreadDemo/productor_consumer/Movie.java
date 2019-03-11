package JavaApi.src.Multi_ThreadDemo.productor_consumer;


//  电影

import java.util.Set;

public class Movie {
    private String name;
    private String info;
    private boolean flag = true;// 设置标志位控制生产者生产，  消费者消费

    public String getName() {
        return name;
    }


    public String getInfo() {
        return info;
    }


    public synchronized void set(String name, String info) {
        if (!flag){  // !flag-->false  生产者等待，消费者消费
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        this.name = name;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.info = info;
        flag=false;   //  重置标志位，让消费者消费
        super.notify();
    }

    public synchronized void get() {

        if (flag){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.getName() + "---" + this.getInfo());
        flag=true;
        super.notify();
    }
}



