package maio.io.byte_io.seria_stream;

import java.io.*;

public class SeriaTest
{
    public static void main(String[] args) throws Exception
    {
        //        testSeriaObject();

        testReSeriaObject();


    }

    public static void testReSeriaObject() throws IOException, ClassNotFoundException
    {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(
                "/Users/sunfei/IdeaProjects/javase_pro/src/com/caj/advance/io/byte_io/seria_stream/seria_obj.txt")));

        Object obj = ois.readObject();

        if(obj instanceof Emp)
        {
            Emp emp = (Emp)obj;

            System.out.println(emp);
        }
    }

    public static void testSeriaObject() throws Exception
    {
        Emp emp = new Emp(1, "张三");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "/Users/sunfei/IdeaProjects/javase_pro/src/com/caj/advance/io/byte_io/seria_stream/seria_obj.txt"));

        oos.writeObject(emp);

        oos.close();
    }
}
