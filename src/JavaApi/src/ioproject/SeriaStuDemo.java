package JavaApi.src.ioproject;

import java.io.*;


//序列化 和 反序列化学生对象
public class SeriaStuDemo {
    public static void main(String[] args) {
        Student stu=new Student("小红",18,"女","123456");

        //对象输入流
        ObjectOutputStream oos=null;
        FileOutputStream fos=null;

        //对象输出流
        ObjectInputStream ois=null;
        FileInputStream fis=null;

        try {
            //序列化
            fos=new FileOutputStream("e:\\idea\\student.txt");
            oos=new ObjectOutputStream(fos);  // 需将OutputStream 作为参数

            oos.writeObject(stu);//  写一个对象


            //反序列化
            fis=new FileInputStream("e:\\idea\\student.txt");
            ois=new ObjectInputStream(fis);  // 需将InputStream 作为参数

            Student stu1=(Student) ois.readObject();
            System.out.println("反序列化后的信息："+stu1.getName()+"-"+stu1.getAge()+"-"+stu1.getGender()+"-"+stu1.getPassword());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {

                oos.close();
                fos.close();

                ois.close();
                fis.close();


            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
