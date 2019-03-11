package maio.oop.exception;


import java.io.*;
import java.nio.channels.AlreadyBoundException;

public class ExceptionTest3
{
    public static void main(String[] args)
    {
        //        byte b = 323;//错误

        InputStream is = null;

        //JDK7之后
        try
        {
            System.out.println("流操作之前");
            is = new FileInputStream(new File("/Users/sunfei/IdeaProjects/javase_pro/src/com/caj/oop/exception/a.txt"));
            System.out.println("流操作之后");

        }//多个异常在没有继承关系的情况下可以合并
        catch (AlreadyBoundException | FileNotFoundException e)
        {
            System.out.println("打印异常信息");
            e.printStackTrace();
        }
        finally//一定会执行的代码
        {
            System.out.println("关闭流操作");
            try
            {
                is.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }


    }

}
