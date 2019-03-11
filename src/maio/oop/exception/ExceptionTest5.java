package maio.oop.exception;


import java.io.*;

public class ExceptionTest5
{
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception
    {
       InputStream is = new FileInputStream(
                new File("/Users/sunfei/IdeaProjects/javase_pro/src/com/caj/oop/exception/a.txt"));

    }

}
