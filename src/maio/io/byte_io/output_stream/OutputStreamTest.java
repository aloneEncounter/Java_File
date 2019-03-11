package maio.io.byte_io.output_stream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class OutputStreamTest
{
    public static void main(String[] args)
    {
//                writeFile();

        writeFile2();
    }

    public static void writeFile2()
    {

        //实现Closeable和AutoCloseable接口的类都可以方法try后的小括号中，他们可以自动关闭。
        try (OutputStream os = new FileOutputStream("e:/idea/miaofeng.txt");

                Scanner scanner = new Scanner(System.in);)
        {
            String content = null;

            while ((content = scanner.next()) != null)
            {
                os.write(content.getBytes());

                if (content.equals("no"))
                {
                    break;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void writeFile()
    {
        OutputStream os = null;
        try
        {
            os = new FileOutputStream("e:/idea/miaofeng.txt");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);

        String content = null;

        while ((content = scanner.next()) != null)
        {
            try
            {
                os.write(content.getBytes());
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            if (content.equals("no"))
            {
                break;
            }
        }

        try
        {
            os.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

//        scanner.close();
    }
}
