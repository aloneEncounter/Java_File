package OOPDemo1.src;

//测试人类的，创建人类的对象
//创建对象 调用 方法/属性
public class TestRen {
    public static void main(String[] args) {
        //创建对象：类名  对象名 =new 类名（）;
        Ren ren1 =new Ren();
        //使用对象的属性和方法：对象名.属性     对象名.方法（）
        ren1.age=18;
        ren1.name="张三";
        ren1.sex='女';

        //有返回值
//        String s=ren1.showInfo();
//        System.out.println(s);
        //没有返回值
        ren1.showInfo();



        //创建对象：类名  对象名 =new 类名（）;
        Ren ren2 =new Ren();
        //使用对象的属性和方法：对象名.属性     对象名.方法（）
        ren2.age=20;
        ren2.name="李四";
        ren2.sex='男';

        //有返回值
//        String s2=ren1.showInfo();
//        System.out.println(s2);
        //没有返回值
        ren2.showInfo();

    }
}
