package JavaApi.src.SocketDemo.p1;

// 服务器端

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {
    public static void main(String[] args) {

        //  接收客户端请求
        // 创建一个Socket
        try {
            ServerSocket serverSocket = new ServerSocket(5000);//  绑定端口5000

            // 使用accept() 侦听并接收到此ServerSocket的连接
            Socket socket = serverSocket.accept();
            //获得输入流，获得用户请求  字节流  包成字符流
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String info;
            while ((info = br.readLine()) != null) {
                System.out.println("客户端说：" + info);
            }

            //   给客户端一个响应
            String reply = "欢迎登陆";

            // 通过输出流将响应发送回客户端
            OutputStream os = socket.getOutputStream();
            os.write(reply.getBytes());


            // 释放相应资源
            os.close();
            br.close();
            is.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}