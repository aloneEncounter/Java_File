package interfaceDemo.com.miao.lock;

//防盗门
public class TheftProofDoor extends Door implements Lock,TakePhoto {

    @Override
    public void open() {
        System.out.println("开门");
    }

    @Override
    public void close() {
        System.out.println("关门");
    }

    @Override
    public void lockUp() {
        System.out.println("插进钥匙往右转三圈，咔嚓，锁上了。。。。。。。。");
    }

    @Override
    public void lockOpen() {
        System.out.println("插进钥匙往左转三圈，咔嚓，锁开了。。。。。。。。");
    }

    @Override
    public void takePhoto() {
        System.out.println("有人来访，咔嚓，拍照了 ，存档了。。。。。。。。");
    }
}
