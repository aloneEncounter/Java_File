package ioproject.byte_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 将 e:\我的青春谁做主.txt
// 内容复制到 e:\idea\hello.txt 中
public class InputAndOutputDemo {
    public static void main(String[] args) {
        FileInputStream fis =null;
        FileOutputStream fos=null;

        try {
            fis=new FileInputStream("e:\\我的青春谁做主.txt"); // 读
            fos=new FileOutputStream("e:\\idea\\a.txt",true);  // 写



            byte[] words=new byte[1024];
            int len =-1;
            while ((len=fis.read(words)) !=-1){
                fos.write(words,0,len);

            }

           /* //常见错误 1、少写了一个字节过来  2、  多写了很多空格   *****
            while (fis.read() !=-1){
                fis.read(words);   //读取文件
                fos.write(words,0,words.length);  //  写入文件

            }*/
            System.out.println("文件复制完成");
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
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
