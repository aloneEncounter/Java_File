package JavaApi.src.Multi_ThreadDemo;
/*
* 继承thread类的方式创建线程
*
* */
public class MyThread extends Thread{
    //重写run()方法
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
