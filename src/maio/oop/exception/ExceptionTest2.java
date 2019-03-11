package maio.oop.exception;

import java.io.*;

public class ExceptionTest2
{
    public static void main(String[] args)
    {
//        byte b = 323;//错误

        InputStream is = null;

        try
        {
            System.out.println("流操作之前");
            is = new FileInputStream(new File("/Users/sunfei/IdeaProjects/javase_pro/src/com/caj/oop/exception/a.txt"));
            System.out.println("流操作之后");
        }
        catch (FileNotFoundException e)//如果抛出多个异常，并且他们之间有继承关系的情况下，先抛子类异常，再抛父类异常
        {
//            System.exit(0);//直接退出整个应用
            System.out.println("打印异常信息");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.println("打印异常信息");
            e.printStackTrace();
        }
        catch (Exception e)
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
