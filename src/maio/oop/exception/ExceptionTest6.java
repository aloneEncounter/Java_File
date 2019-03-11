package maio.oop.exception;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionTest6
{
    public static void main(String[] args)
    {
        try (InputStream is = new FileInputStream(
                new File("/Users/sunfei/IdeaProjects/javase_pro/src/com/caj/oop/exception/b.txt"));)
        {
            System.out.println("流操作之前");
            System.out.println("流操作之后");

        }//多个异常在没有继承关系的情况下可以合并
        catch (IOException e)
        {
//            e.printStackTrace();

            //
            try
            {
                //自定义异常
                throw new MyException("自定义异常" + e.getMessage());
            }
            catch (MyException e1)
            {
                e1.printStackTrace();
            }
        }


    }

}
