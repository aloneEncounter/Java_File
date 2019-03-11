package JavaApi.src.ioproject;


import java.io.*;

public class Exercise {
    public static void main(String[] args) {

        // 字符输入流
        /*FileReader fr=null;
        try {
            fr=new FileReader("C:\\Users\\Administrator\\Desktop\\pet.template");

            StringBuffer s=new StringBuffer();
            char[] ch=new char[1024];
            int len=-1;
            while((len=fr.read(ch))!=-1){
                s.append(ch,0,len);
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
        }*/
        System.out.println(System.getProperty("file.encoding"));
        // 字节输入流
        FileInputStream fis = null;
        InputStreamReader isr=null;
        try {
            fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\pet.template");
            isr=new InputStreamReader(fis,"UTF-8");

            //字节输出流输出有乱码
           /* byte[] b=new byte[1024];
            int len=-1;
            while((len=fis.read(b))!=-1){
               for (int i=0;i<len;i++){
                   System.out.print((char) b[i]);
               }
            }*/

           StringBuffer sb=new StringBuffer();
           char[] ch =new char[1024];
           int len =-1;
           while((len=isr.read(ch))!=-1){
              sb.append(ch,0,len);
           }
            System.out.println(sb);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                isr.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
