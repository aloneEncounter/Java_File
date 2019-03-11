package JavaApi.src.SocketDemo.udp;

//基于UDP 的Socket通信，客户端

import java.io.IOException;
import java.net.*;

public class LoginClient {
    public static void main(String[] args) {


        //买礼物
        String info = "心型巧克力";
        byte[] infos = info.getBytes();
        // 对方的地址端口号
        InetAddress ia;

        //  快递点
        try (DatagramSocket socket = new DatagramSocket();) {
            ia = InetAddress.getByName("localhost");


            // 包裹包装礼物
            DatagramPacket dp = new DatagramPacket(infos, infos.length, ia, 5000);

            // 通过快递点往外寄出礼物
            socket.send(dp);


            //接收服务器响应
            byte[] replys = new byte[1024];
            DatagramPacket dp1 = new DatagramPacket(replys,replys.length);

            //
            socket.receive(dp1);
            String reply=new String(dp1.getData(),0,dp1.getLength());
//            String reply=new String(dp1.getData(),0,dp1.getData().length);
            System.out.println("服务器说："+reply);


        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}