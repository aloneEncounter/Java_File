package JavaApi.src.SocketDemo.p3;

// 服务器端(使用多线程实现)
// 一直监听客户请求，
//一旦监听到客户请求，立刻创建一个线程，开启线程

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {
    public static void main(String[] args) {

        //  接收客户端请求
        // 创建一个Socket
        try {
            ServerSocket serverSocket = new ServerSocket(5000);//  绑定端口5000

            while (true) {
                // 使用accept() 侦听并接收到此ServerSocket的连接
                Socket    socket = serverSocket.accept();
                //  创建一个和该客户端响应的线程=
                LoginThread loginThread=new LoginThread(socket);

                 //启动线程
                loginThread.start();


            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
