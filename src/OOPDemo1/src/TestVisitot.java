package OOPDemo1.src;//测试类 实现景区收费功能
//（无参方法的调用）
import java.util.Scanner;

public class TestVisitot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;

        do {
            Visitor v=new Visitor();

            System.out.print("请输入姓名：");
            v.name=input.next();
            System.out.print("请输入年龄：");
            v.age=input.nextInt();

//          调用showPrice()  方法
            v.showPrice();

            System.out.print("是否继续（y/n）？");
            answer=input.next();
        }while(answer.equals("y"));


        System.out.println("退出程序！！！");

    }
}
