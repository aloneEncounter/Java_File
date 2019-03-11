package maio.io.file;

import java.io.File;

public class RecursorFileTest
{
    public static void printFile(File file)
    {
        if(file != null)
        {
            if(file.isDirectory())
            {
                File[] files = file.listFiles();

                /*for(int i = 0; i < files.length; i++)
                {
                    printFile(files[i]);
                }*/

                for(File f : files)
                {
                    printFile(f);
                }
            }
            else
            {
                System.out.println(file.getName());
            }
        }
    }

    public static void main(String[] args)
    {
        File file = new File("d:/");
        printFile(file);
    }
}
