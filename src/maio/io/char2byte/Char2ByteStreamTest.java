package maio.io.char2byte;

import java.io.*;
import java.util.Scanner;

public class Char2ByteStreamTest
{
    //字节到字符的一个桥梁(输入流)
    public static void main(String[] args)
    {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream(
                        new File("/Users/sunfei/IdeaProjects/javase_pro/src/com/caj/advance/io/io2.txt"))))));
                Scanner scanner = new Scanner(System.in);
        )
        {
            String cont = null;
            
            while((cont = scanner.next()) != null)
            {
                bw.write(cont, 0, cont.length());

                bw.flush();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
