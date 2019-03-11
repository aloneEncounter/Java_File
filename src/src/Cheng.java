package src;

import java.util.Scanner;

public class Cheng {

        public static void main(String[] args)
        {
            //        testChangeStructure();

            testSwitchStructure();
        }

        public static void testSwitchStructure()
        {
            Scanner scanner = new Scanner(System.in);

            int score = scanner.nextInt();

            switch (score / 10)//小括号内部接收一个常量
            {
                case 10:
                    System.out.println("优秀");
                    break;//强制终止程序在其作用域内的执行
                case 9:
                    System.out.println("优秀2");
                    break;
                case 8://分支
                    System.out.println("优秀3");
                    break;
                case 7://分支
                    System.out.println("良好");
                    break;
                case 6://分支
                    System.out.println("及格");
                    break;
                default:
                    System.out.println("不及格或无成绩");
                    break;
            }
        }

        public static void testChangeStructure()
        {
            //具备从控制台输入数据的功能
            Scanner s = new Scanner(System.in);

            //输入一个整数并返回
            int result = s.nextInt();

            if (result == 1)
            {
                System.out.println("走楼梯");
            }
            else if (result == 2)
            {
                System.out.println("坐电梯");
            }
            else
            {
                System.out.println("跳楼");
            }

        }
    }


