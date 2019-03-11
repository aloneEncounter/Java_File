package interfaceDemo.com.miao.phone;
//普通手机类
public class CommonPhone extends HandSet implements Playing {

    public CommonPhone() {
    }

    public CommonPhone(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void sendMgs() {
        System.out.println("发送短信");
    }

    @Override
    public void call() {
        System.out.println("语音通话");
    }

    @Override
    public void playVideo(String name) {
        System.out.println("播放音频：《"+name+"》");
    }
}

