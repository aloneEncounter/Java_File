package JavaApi.src.ioproject;

import java.io.*;

// 带缓冲区的字符输出流往 e:\idea\简介.txt  中写内容
// 借助字符输入流将文件内容读出来，显示在控制台
public class BufferedWriterDemo {
    public static void main(String[] args) {
        Writer fw=null;
        BufferedWriter bw=null;

        Reader reader=null;
        BufferedReader br=null;
        try {
            //输出
            fw=new FileWriter("e:/idea/简介.txt",true);
            bw=new BufferedWriter(fw);

            bw.write("你好！！");
            bw.newLine();
            bw.write("往文件中写内容");
            bw.newLine();
            bw.write("写入完毕");
            bw.flush();

            //输入
            reader=new FileReader("e:/idea/简介.txt");
            br=new BufferedReader(reader);
            String line=null;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                reader.close();
                bw.close();
                fw.close();   //  不能忘记写
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


