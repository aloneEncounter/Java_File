package JavaApi.src.SocketDemo;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {
    public static void main(String[] args) {

//        text();
        test2();
    }





    public static void text() {
        try {
            FileUtils.copyURLToFile(new URL("http://www.163.com"), new File("C:\\Users\\Administrator\\Desktop\\网易.html"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void test2(){
         try {
            URL url = new URL("http://www.baidu.com");
            URLConnection conn = url.openConnection();
            InputStream is=url.openStream();
            OutputStream os=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\百度.html");
            byte[] b=new byte[1024];
            int a=0;
            while((a=is.read(b))!=-1){

//                String s=new String(b,0,a);
//                System.out.println(s);
                os.write(b,0,a);

            }
            os.close();
            is.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
