package maio.io.byte2char;

import java.io.*;

public class Byte2CharStreamTest
{
    //字节到字符的一个桥梁(输入流)
    public static void main(String[] args)
    {
        try (BufferedReader bw = new BufferedReader(new InputStreamReader(new DataInputStream(new BufferedInputStream(
                new FileInputStream(
                        new File("/Users/sunfei/IdeaProjects/javase_pro/src/com/caj/advance/io/io.txt"))))));)
        {
            String cont = null;

            while((cont = bw.readLine()) != null)
            {
                System.out.println(cont);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
