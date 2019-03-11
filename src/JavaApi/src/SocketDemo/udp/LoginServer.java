package JavaApi.src.SocketDemo.udp;
// 服务器

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

public class LoginServer {
    public static void main(String[] args) {
        //  准备了一个空包
        byte[] infos=new byte[1024];

        DatagramPacket dp=new DatagramPacket(infos,infos.length);

        //  快递点
        try(DatagramSocket socket=new DatagramSocket(5000);) {
            // 在快递点取礼物
            socket.receive(dp);
            //  拆礼物  得到dp 的字节数组   返回接收到的数据的长度
            String info=new String(dp.getData(),0,dp.getLength());
            System.out.println("客户端说："+info);


            // 给客户端一个响应
            String reply="一件羽绒服";
            byte[] replys=reply.getBytes();
            // 客户端的地址    获得Socket地址
           SocketAddress sa= dp.getSocketAddress();
           // 打包一个包裹
            DatagramPacket dp1=new DatagramPacket(replys,replys.length,sa);
            // 寄出去
            socket.send(dp1);


        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
