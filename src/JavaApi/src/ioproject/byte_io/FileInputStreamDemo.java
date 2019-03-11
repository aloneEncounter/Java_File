package ioproject.byte_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//读取文件   e:\idea\test.txt 中的内容
public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        // 输入流  FileInputStream
        try {
            fis = new FileInputStream("e:\\idea\\test.txt");
            System.out.println("\n"+fis.available());

            // 1、借助输入流的read()方法去读文件
            /*int data;    //  返回字节的 整数表示
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }*/

            // 2、借助输入流的read(byte[] b) 方法去读文件
            byte[] b=new byte[1024];
            int data;     // 返回 的是读取到的字节数
            while ((data=fis.read(b)) !=-1){
                for (int i=0;i<data;i++){
//                    System.out.print(b[i]+"\t");
                    System.out.print((char)b[i]);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } /*finally {
            //关闭输入流
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}
