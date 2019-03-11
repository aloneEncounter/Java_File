package maio.io;

import javax.lang.model.element.NestingKind;
import java.io.File;
import java.lang.reflect.Field;


//遍历d盘中的所有文件
public class FileDemo {

    public static void printFile(File file){
        if (file!=null){
            if (file.isDirectory()){
                File[] a=file.listFiles();
                for (File f:a){
                    printFile(f);
//                    System.out.println(f);    //  只打印绝对路径
                }
            }else {
                System.out.println(file.getName());
            }
        }
    }
    public static void main(String[] args) {

        File file =new File("f:");
        printFile(file);
        String a="aaa";


//        System.out.println(File.pathSeparator);
//        System.out.println(File.pathSeparatorChar);
//        System.out.println(File.separator);
//        System.out.println(File.separatorChar);
    }
}
