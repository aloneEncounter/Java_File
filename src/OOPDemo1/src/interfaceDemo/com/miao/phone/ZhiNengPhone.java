package interfaceDemo.com.miao.phone;

public class ZhiNengPhone extends HandSet implements TakePhoto,NetWorking,Playing {

    public ZhiNengPhone() {
    }

    public ZhiNengPhone(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void sendMgs() {
        System.out.println("发送图片+图片+视频的信息+");
    }

    @Override
    public void call() {
        System.out.println("视频通话");
    }

    @Override
    public void netWork() {
        System.out.println("上网");
    }

    @Override
    public void playVideo(String name) {
        System.out.println("播放视频：《"+name+"》");
    }

    @Override
    public void takePhoto() {
        System.out.println("拍照");
    }
}
