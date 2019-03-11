package JavaApi.src.ioproject;

// 将pet.template 文件中的内容读出来
//将都出来的内容特定部分进行替换
//将替换后的新内容重新写入到另一个文件中

// 字符串的 replace() 方法  替换字符串
import java.io.*;

public class ReaderAndWriterDemo {
    // "e:/idea/pet.template"     "e:/idea/newPet.txt"
    public void copyFile(String file1,String file2 ){
        //输入流读取
        BufferedReader reader = null;
        InputStreamReader ir = null;
        FileInputStream fis = null;


        //输出流写入
        BufferedWriter writer=null;
        FileWriter fw=null;

        try {
            //从源文件中读取
            fis = new FileInputStream(file1); // 读取字节流
            ir = new InputStreamReader(fis, "UTF-8");  //  字节流包成字符流 ，限制编码格式
            reader = new BufferedReader(ir);   // 带缓冲的流 更高效
            StringBuffer sbf = new StringBuffer();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sbf.append(line);

            }
            System.out.println("替换前的内容是：" + sbf);
            //文件内容的替换
            String newStr = sbf.toString().replace("{name}", "欧欧").replace("{type}",
                    "狗狗").replace("{master}", "张三");

            System.out.println("替换后的内容是：" + newStr);

            //将替换后的内容写入新文件
            fw=new FileWriter(file2);
            writer=new BufferedWriter(fw);

            writer.newLine();
            writer.write(newStr);
            writer.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                ir.close();
                fis.close();

                writer.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


    public static void main(String[] args) {
        ReaderAndWriterDemo demo=new ReaderAndWriterDemo();
        demo.copyFile("e:/idea/pet.template","e:/idea/newPet.txt");
    }
}
