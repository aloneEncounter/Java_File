package JavaApi.src.common.stringdemo;
import java.util.Scanner;

//作业提交
//字符串截取  indenxOf()  lastindexOf()    substring(begin)   substring(begin,end)
public class StrDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*********欢迎提交作业**********");
        System.out.print("请输入作业名：");
        String name = input.next();
        System.out.print("请输入邮箱：");
        String email = input.next();

        boolean nameFlag = false;
        //   检查文件名：必须以.java为后缀
        int index = name.indexOf(".");

        if (index != -1 && index != 0 && name.substring(index).equals(".java")) {
            //文件名正确
            nameFlag = true;
        } else {
            System.out.println("文件名无效！");
        }


        //检查邮箱:@  .
        boolean emailFlag = false;
        int index1 = email.indexOf("@");
        int index2 = email.indexOf(".");
        if (index1 != -1 && index1 != 0 && index2 != -1 && index2 != 0 && index1 < index2) {
            emailFlag = true;
        } else {
            System.out.println("邮箱无效！！！");
        }

        if (nameFlag && emailFlag) {
            System.out.println("作业提交成功!!!!!");
        } else {
            System.out.println("作业提交失败！！！");
        }

    }
}
