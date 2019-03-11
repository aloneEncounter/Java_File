package JavaApi.src.ioproject;

import java.io.*;

// 用字符串流 将e:\idea\简介.txt 读出来    编码格式是ANSI(GBK)

//文件中有汉字时
public class FileReaderDemo {
    public static void main(String[] args) {
        // 获取文件系统的默认编码格式
        System.out.println(System.getProperty("file.encoding"));
//        FileReader fr=null;
        Reader fr=null;   //解决乱码
        try {
//            fr=new FileReader("e:\\idea\\简介.txt");
            FileInputStream fis=new FileInputStream("e:\\idea\\简介.txt ");
            fr=new InputStreamReader(fis,"UTF-8");    //用InputStreamReader

            StringBuffer s=new StringBuffer();
            char[] ch=new char[1024];
            int len=-1;
            while ((len=fr.read(ch))!=-1){
                s.append(ch,0,len);
//                s.append(ch);
            }
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
