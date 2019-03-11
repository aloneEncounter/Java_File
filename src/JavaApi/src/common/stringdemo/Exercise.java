package JavaApi.src.common.stringdemo;

import java.util.Scanner;

public class Exercise {
    public Boolean verify(String name, String pwd, String pwd1) {
        boolean flag = false;
        if (name.length() >= 3 && pwd.length() >= 6 && pwd1.length() >= 6 ) {

            if (pwd.equals(pwd1)){
                flag=true;
            }else{
                System.out.println("两次输入的密码必须相同");
            }

        } else {
            System.out.println("用户名不能小于3，密码长度不能小于6");
        }
        return flag;
    }


    public static void main(String[] args) {
        Exercise a = new Exercise();
        Scanner input = new Scanner(System.in);
        System.out.println("*****欢迎进入注册系统************");
        Boolean b;

        do {
            System.out.print("请输入用户名：");
            String userName = input.next();
            System.out.print("请输入密码：");
            String pwd = input.next();
            System.out.print("请再次输入密码：");
            String pwd1 = input.next();
            b = a.verify(userName, pwd, pwd1);

        } while (b == false);
        System.out.println("注册成功！请牢记密码");
    }
}
