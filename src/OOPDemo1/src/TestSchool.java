package OOPDemo1.src;// 测试类  创建学校对象

public class TestSchool {
    public static void main(String[] args) {
        School s1 =new School();
        s1.name="北京市朝阳区214号";
        s1.address="朝阳学校";

        String s2=s1.showSchool();
        System.out.println(s2);
    }


}
