package interfaceDemo.com.miao.usb;

// U盘
public class UsbDisk implements Usb {

    @Override
    public void service() {
        System.out.println("插上U盘开始传输数据");
    }
}
