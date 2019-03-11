package maio.multi_thread.thread.thread_1;

public class MyThreadTest
{
    public static void main(String[] args)
    {
        MyThread mt = new MyThread();//创建状态：此时线程并没有被分配必不可少的资源

        MyThread mt2 = new MyThread();

//        mt.setPriority(Thread.MAX_PRIORITY);//线程优先级并不能决定优先级高的先执行
//        mt2.setPriority(Thread.NORM_PRIORITY);

        mt.start();//就绪状态：此时线程被分配了必不可少的资源，紧接着会进入到运行中状态

        mt2.start();

//        try
//        {
//            mt.join();//线程的合并：
////            mt2.join();
//        }
//        catch (InterruptedException e)
//        {
//            e.printStackTrace();
//        }
//
//        Thread.yield();//线程的让步：

        System.out.println("main thread 执行完毕");
    }
}
