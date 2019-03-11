package maio.network.url;


import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class URLTest
{
    public static void main(String[] args) throws Exception
    {
        //        getUrl();
        //        getUrl2();

        getUrl3();

    }

    public static void getUrl3() throws Exception
    {
//        System.out.println(IOUtils.toString(new URL("http://www.163.com"), "utf8"));

        FileUtils.copyURLToFile(new URL("http://www.163.com"), new File("/Users/sunfei/Desktop/网易.html"));
    }

    public static void getUrl2() throws Exception
    {
        URL url = new URL("http://www.163.com");

        InputStream is = url.openStream();

        OutputStream os = new FileOutputStream(new File("/Users/sunfei/Desktop/163.html"));

        byte[] b = new byte[512];

        int len = 0;

        while ((len = is.read(b)) != -1)
        {
            os.write(b, 0, len);
        }

        os.close();

        is.close();
    }

    public static void getUrl() throws IOException
    {
        URL url = new URL("http://www.163.com");

        URLConnection conn = url.openConnection();

        InputStream is = conn.getInputStream();

        OutputStream os = new FileOutputStream(new File("/Users/sunfei/Desktop/163.html"));

        byte[] b = new byte[512];

        int len = 0;

        while ((len = is.read(b)) != -1)
        {
            os.write(b, 0, len);
        }

        os.close();

        is.close();
    }
}
