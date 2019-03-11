package JavaApi.src.Multi_ThreadDemo.SLEEP;

// 主线程休眠5秒
public class Test {
    public static void main(String[] args) {
        System.out.println("--------------主线程开始休眠-------------------");
        Wait.bySec(5);//  让主线程休眠5秒
        System.out.println("-------------主线程休眠结束！！！------------");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程！！！！");
            }
        }).start();

        new Thread(()-> System.out.println("woaini")).start();

    }
}
