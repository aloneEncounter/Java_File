package JavaApi.src.SocketDemo.p1;

import java.io.*;
import java.net.Socket;

// 客户端
public class LoginClient {
    public static void main(String[] args) {
        try {
            // 发送请求到服务器
            //  创建一个客户端的Socket
            Socket socket = new Socket("localhost", 5000);

            //通过输出流发送请求
            String info = "用户名：Tom，密码:123456";
            OutputStream os = socket.getOutputStream();
            byte[] infos = info.getBytes();  //得到字节 数组
            os.write(infos);

            socket.shutdownOutput();
            // 接收服务器给我的响应
            InputStream is = socket.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String reply;
            while ((reply=br.readLine())!=null){
                System.out.println("服务器说："+reply);
            }

            // 释放资源
            os.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
