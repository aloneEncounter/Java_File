package maio.oop.exception;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.nio.channels.AlreadyBoundException;

public class ExceptionTest4
{
    public static void main(String[] args)
    {
        //        byte b = 323;//错误

        //JDK7之后: try-with-resource
        //try后的小括号能够写入的内容：实现了Closeable或AutoCloseable的接口的类
        try (InputStream is = new FileInputStream(
                new File("/Users/sunfei/IdeaProjects/javase_pro/src/com/caj/oop/exception/a.txt"));)
        {
            System.out.println("流操作之前");
            System.out.println("流操作之后");

        }//多个异常在没有继承关系的情况下可以合并
        catch (IOException e)
        {
            System.out.println("打印异常信息");
            e.printStackTrace();
        }


    }

}
