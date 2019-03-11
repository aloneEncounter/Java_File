package OOPDemo1.src;//测试类

import java.util.Scanner;

public class UserManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //创建对象
        User user = new User();
        user.name="admin";
        user.password="123456";

        System.out.print("请输入用户名:");
        String name=input.next();
        System.out.print("请输入密码：");
        String pwd=input.next();

        //  判断用户输入用户名和密码是否正确
        if (name.equals(user.name) && pwd.equals(user.password)){
            System.out.print("请输入新密码：");
            user.password=input.next();
            System.out.println("修改密码成功!您的密码是："+user.password);

        }else{
            System.out.println("用户名和密码不正确，您没有权限更新密码");
        }

    }
}
