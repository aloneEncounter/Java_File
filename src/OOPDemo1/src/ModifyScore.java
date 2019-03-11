package OOPDemo1.src;//修改成绩


public class ModifyScore extends Student {
    //遍历学员信息，发现如果有一个学生成绩小于60，则集体提分2分
    public void modifyScore(Student[] stu){
        for(int i=0;i<stu.length;i++){
            if (stu[i].score<60){
                stu[i].score+=2;
            }
        }
    }

    //输出学员信息
    public void showInfo(Student[] stu){
        for (Student stus:stu){
            stus.showInfo();
        }
    }

    public static void main(String[] args) {
        ModifyScore ms =new ModifyScore();
        Student[] stu =new Student[3];

//        Student s1=new Student();
//        s1.name="张三";
//        s1.score=40;
        Student s1=new Student("张三",40);

/*      Student s2=new Student();
        s2.name="李四";
        s2.score=90;*/

        Student s2=new Student("李四",90);

/*        Student s3=new Student();
        s3.name="王五";
        s3.score=55;*/
        Student s3=new Student("王五",55);

        stu[0]=s1;
        stu[1]=s2;
        stu[2]=s3;

        //调用属性
        ms.modifyScore(stu);
        //调用方法
        ms.showInfo(stu);

    }

}
