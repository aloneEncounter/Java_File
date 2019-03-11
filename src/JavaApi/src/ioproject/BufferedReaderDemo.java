package JavaApi.src.ioproject;

import java.io.*;

// 用带缓冲区的字符串流 将e:\idea\简介.txt 读出来    编码格式是ANSI(GBK)

public class BufferedReaderDemo {
    public static void main(String[] args) {

        Reader fr = null;   //解决乱码
        BufferedReader br =null;   // 有缓冲区
        FileInputStream fis=null;

        try {
            fis = new FileInputStream("e:\\idea\\简介.txt ");
            fr = new InputStreamReader(fis, "UTF-8");    //用InputStreamReader

           br = new BufferedReader(fr);   // 有缓冲区
            String line=null;
            while ((line=br.readLine()) !=null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流  先开的后关  后开的先关
            try {
                br.close();
                fr.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
