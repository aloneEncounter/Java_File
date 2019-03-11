package JavaApi.src.ioproject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 借助字符流往 e:\idea\简介.txt  中写内容
public class WriterDemo {
    public static void main(String[] args) {
        Writer fw=null;
        try {
            fw=new FileWriter("e:/idea/简介.txt",true);
            String info="输入和输出处理最后一部分内容";
            fw.write(info);
            fw.flush();   //不能忘记写
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fw.close();   //  不能忘记写
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
