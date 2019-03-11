package OOPDemo1.src;//测试类

import OOPDemo1.src.StudentMgr;

import java.util.Scanner;

public class TestStuSearch {
    public static void main(String[] args) {
        StudentMgr st= new StudentMgr();
        Scanner input=new Scanner(System.in);
        //插入了5名学员 的成绩
        for (int i=0;i<5;i++){
            System.out.print("请输入学员信息：");
            String newName=input.next();
            st.addName(newName);
        }
        //显示学员姓名信息
        st.showName();

        //特定区域查找特定学生
        System.out.print("请输入开始查找的位置：");
        int start=input.nextInt();
        System.out.print("请输入结束查找的位置：");
        int end =input.nextInt();
        System.out.print("请输入查找的姓名：");
        String name=input.next();

        System.out.println("********查找结果*********");
        boolean flag=st.searchName(start,end,name);
        if (flag){
            System.out.println("找到了");
        }else {
            System.out.println("没有找到！！");
        }


    }

}
