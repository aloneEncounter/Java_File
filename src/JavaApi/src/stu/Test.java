package JavaApi.src.stu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Map<String,Student> student=new HashMap<String,Student>();
        Student s1=new Student("张三","男");
        Student s2=new Student("王五","女");
        Student s3=new Student("李四","男");
        // 键--值：学员的英文名字--学员
        student.put("jack",s1);
        student.put("tom",s2);
        student.put("kitty",s3);


        // 根据特定的key 获取相应的value
        Scanner input=new Scanner(System.in);
        System.out.print("请输入您要寻找的学员英文名：");
        String key=input.next();
        if (student.containsKey(key)){
            // 根据key获取 value  默认返回的是 Object 类型 需要强转为 Student 类型  在通过其对象去调用 student类中的具体信息
//            Student stu=(Student)student.get(key);
            Student stu=student.get(key);
            System.out.println("您要找的学员是："+stu.getName()+"--"+stu.getSex());
        }else{
            System.out.println("对不起，没有您要寻找的学员");
        }
    }
}
