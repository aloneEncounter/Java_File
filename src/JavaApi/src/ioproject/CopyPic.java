package JavaApi.src.ioproject;

//  读写二进制文件
//将E:\idea\pic.jpg  图片 --》E:\idea\newpic\newpic.jpg

import java.io.*;

public class CopyPic {
    //  file1:  "E:\\idea\\pic.jpg"    file2:"E:\\idea\\newpic\\newpic.jpg"
    public void copyPic(String file1,String file2){
        // 输入流 写
        DataInputStream dis =null;
        FileInputStream fis=null;

        //输出流  读
        DataOutput dos=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream(file1);
            dis=new DataInputStream(fis);

            fos=new FileOutputStream(file2);
            dos=new DataOutputStream(fos);

            int temp;
            while ((temp=dis.read())!=-1){
//                System.out.println(temp);
                dos.write(temp);
            }
            System.out.println("图片复制完成！！！！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                ((DataOutputStream) dos).close();
                fos.close();
                dis.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    public static void main(String[] args) {
        CopyPic copy=new CopyPic();
        copy.copyPic("E:\\idea\\pic.jpg","E:\\idea\\newpic\\newpic.jpg");

    }

}
