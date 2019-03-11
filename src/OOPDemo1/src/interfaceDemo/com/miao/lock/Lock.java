package interfaceDemo.com.miao.lock;

//锁
public interface Lock {
    //上锁
    public void lockUp();   //abstract 可以不写

    //开锁
    public void lockOpen();
}
