package JavaApi.src.ioproject;

//文件操作：创建文件   查看文件相关信息  删除文件

import java.io.File;
import java.io.IOException;

public class FileDemo {
    //北京 ---》 南京--》上海--》广州  1.txt

    //  c:\1\2\3\1.txt    绝对路径   从盘符出发 往下找
    //     2\3\1.txt    相对路径 相对当前位置，继续往下找

    //创建文件
    public void creat(File file){
        if (!file.exists()){
            try {
                file.createNewFile();
                System.out.println("文件已经创建！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //查看文件相关信息
    public void showFileInfo(File file){
        if (file.exists()){
            // 如果文件存在则查看其信息
            if (file.isFile()){

                System.out.println("该文件名是："+file.getName());
                System.out.println("相对路径是："+file.getPath());
                System.out.println("绝对路径是："+file.getAbsolutePath());
                System.out.println("该文件长度是："+file.length()+"字节");

            }if (file.isDirectory()){
                System.out.println("此文件是目录");
            }
        }else {
            System.out.println("此文件不存在");
        }

    }
    //删除文件
    public void delete(File file){
        if (file.exists()){
            file.delete();
            System.out.println("文件已删除");
        }else {
            System.out.println("该文件不存在");
        }
    }

    public static void main(String[] args) {
        FileDemo fileDemo=new FileDemo();
        File file=new File("e:\\idea\\test.txt");
//        File file=new File("test.txt");
        fileDemo.creat(file);
        fileDemo.showFileInfo(file);
//        fileDemo.delete(file);
    }
}
