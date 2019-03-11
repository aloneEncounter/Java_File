package maio.io.byte_io.decorator_io;

import java.io.*;
import java.util.Arrays;

public class DecoratorTest
{
    public static void main(String[] args) throws Exception
    {
        //        File file = new File("/Users/sunfei/IdeaProjects/javase_pro/src/com/caj/advance/io/io.txt");

        //        InputStream is = new FileInputStream(file);

//        BufferedInputStream bis = new BufferedInputStream(
//                new FileInputStream(new File("/Users/sunfei/IdeaProjects/javase_pro/src/com/caj/advance/io/io.txt")));


        DataInputStream dis = new DataInputStream(new BufferedInputStream(
                new FileInputStream(new File("/Users/sunfei/IdeaProjects/javase_pro/src/com/caj/advance/io/io.txt"))));

        byte[] b = new byte[512];

        int len = 0;

        while ((len = dis.read(b)) != -1)
        {
            String str = new String(b, 0, len);

            System.out.println(str);
        }

        dis.close();

    }
}
