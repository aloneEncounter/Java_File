package JavaApi.src.SocketDemo.p3;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

//  线程类
//接收客户请求，给予 客户一个响应
//        在线程构造方法中去绑定客户端的Socket
public class LoginThread extends Thread {
    private Socket socket;

    public LoginThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {

            //  获取输入流 得到客户需求
        try (InputStream is=socket.getInputStream();
             OutputStream os=socket.getOutputStream();
             ObjectInputStream ois=new ObjectInputStream(is);){

            User user=(User)ois.readObject();
            System.out.println("客户端说："+user.getUsername()+user.getPwd());

            // 获得客户的IP信息
            InetAddress ia=socket.getInetAddress();
            System.out.println("客户端的IP地址是："+ia.getHostAddress());
            System.out.println("客户端的姓名是："+ia.getHostName());

            // 反馈
            String a="我好想你啊";
            os.write(a.getBytes());



        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
