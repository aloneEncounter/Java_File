package maio.io.char_io.char_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CharReaderTest
{
    public static void main(String[] args)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(new File(
                "/Users/sunfei/IdeaProjects/javase_pro/src/com/caj/advance/io/char_io/char_reader/char_reader.txt"))))
        {
            String cont = null;

            while ((cont = br.readLine()) != null)
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
