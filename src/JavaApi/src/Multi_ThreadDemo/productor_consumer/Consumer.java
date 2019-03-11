package JavaApi.src.Multi_ThreadDemo.productor_consumer;

public class Consumer implements Runnable{
    private  Movie movie=null;

    public Consumer(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        //  循环显示50次 电影信息
        for (int i = 0; i <50 ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            movie.get();
        }


    }
}
