package JavaApi.src.Multi_ThreadDemo.productor_consumer;

public class Producer implements Runnable {
    private Movie movie=null;
    private boolean flag=false;

    public Producer(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        // 循环录入 50遍电影数据，两部电影交替录入
        for (int i = 0; i <50 ; i++) {

            if (flag){
                movie.set("变形精钢","一部科幻电影");
                flag=false;
            }else {
                movie.set("神偷奶爸","一部3D动画电影");
                flag=true;
            }
        }
    }
}
