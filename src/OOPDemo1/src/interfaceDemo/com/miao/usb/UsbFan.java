package interfaceDemo.com.miao.usb;

//  usb风扇
public class UsbFan implements Usb {
    // 服务  功能

    @Override
    public void service() {
        System.out.println("插在Usb口上，电扇开始转");

    }
}
