package interfaceDemo.com.miao.usb;

//测试
public class Test {
    public static void main(String[] args) {
        Usb fan=new UsbFan();
        fan.service();

        Usb disk=new UsbDisk();
        disk.service();

        //插在Usb口上，电扇开始转
         //       插上U盘开始传输数据
    }
}
