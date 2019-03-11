package maio.io.byte_io.input_stream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;

public class InputStreamTest
{
    public static void main(String[] args)
    {
                testReadFile();
//
                testReadFile2();

        testReadFile3();

    }

    public static void testReadFile3()
    {
        try
        {
            FileUtils.write(new File("e:/idea/peiqi.txt"), "adsjfkla;jfdasljkfa;", "utf8");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void testReadFile2()
    {
        File file =new File("e:/idea/miaofeng.txt");


        try {
            FileUtils.copyFile(new File("e:/idea/miaofeng.txt"), new File("e:/idea/peiqi.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void testReadFile()
    {
        File file = new File("e:/idea/miaofeng.txt");

        try (InputStream is = new FileInputStream(file);)
        {
            byte[] b = new byte[512];

            int len = 0;

            while ((len = is.read(b)) != -1)
            {
                String str = new String(b, 0, len);

                System.out.println(str);

               for (int i=0;i<len;i++){
                   System.out.print((char) b[i]);
               }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

