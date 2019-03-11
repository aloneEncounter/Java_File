package JavaApi.src.Multi_ThreadDemo.DeadLock;

//  模拟死锁

public class Test {
    public static void main(String[] args) {

        Object bobby=new Object();
        Object duck=new Object();

        Thread tangtang = new Thread(new TangTang(bobby,duck));
        Thread doudou = new Thread(new DouDou(bobby,duck));

        tangtang.start();
        doudou.start();
    }
}


class TangTang implements Runnable {

    Object bobby ;  // 芭比
    Object duck ;   //  玩具鸭

    public TangTang(Object bobby, Object duck) {
//        super();
        this.bobby = bobby;
        this.duck = duck;
    }

    @Override
    public void run() {

        synchronized (bobby) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (duck) {

            }
            System.out.println("糖糖把芭比给豆豆玩");
        }


    }
}


class DouDou implements Runnable {
    Object bobby ;
    Object duck ;

    public DouDou(Object bobby, Object duck) {
//        super();
        this.bobby = bobby;
        this.duck = duck;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (duck) {

            synchronized (bobby) {

            }
            System.out.println("豆豆把玩具鸭 给堂堂完");
        }

    }
}
