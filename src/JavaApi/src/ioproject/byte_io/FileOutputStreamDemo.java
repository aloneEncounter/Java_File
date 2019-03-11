package ioproject.byte_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 字节输出流
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        FileOutputStream fos1=null;
        File file =new File("e:/idea/miao.txt");

        try {
            fos=new FileOutputStream("e:\\idea\\hello.txt");
            fos1=new FileOutputStream("e:\\idea\\miao.txt");
            String str="好好学习Java";
            // 将字符串打散为一个字节数组
            byte[] words=str.getBytes();
            fos.write(words,0,words.length);
            fos1.write(words,0,words.length);
            System.out.println("hello文件已被跟新");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
