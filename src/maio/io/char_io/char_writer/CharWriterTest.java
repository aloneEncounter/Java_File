package maio.io.char_io.char_writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CharWriterTest
{
    public static void main(String[] args)
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
                "/Users/sunfei/IdeaProjects/javase_pro/src/com/caj/advance/io/char_io/char_writer/char_writer.txt")));

                Scanner scanner = new Scanner(System.in);)
        {
            String cont = null;

            while ((cont = scanner.next()) != null)
            {
                if (cont.equals("no"))
                {
                    break;
                }

                bw.write(cont);

                bw.flush();//清空缓存

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
