package maio.collection.wrapperclass;

/**
 * ==和equals的区别：
 * 1.两者都是比较两个对象是不是同一个对象
 * 2.当重写了hashCode和equals方法之后，==比较的是两个对象是不是同一个对象
 *   equals比较的两个对象内容是不是一样
 */
public class EqualsTest
{
    public static void main(String[] args)
    {
        Emp emp = new Emp("zhangsan");
        Emp emp2 = new Emp("zhangsan");

        String str = new String("lisi");
        String str2 = new String("lisi");

        System.out.println(str == str2);
        System.out.println(str.equals(str2));

        System.out.println(emp == emp2);
        System.out.println(emp.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp.equals(emp2));
    }
}
