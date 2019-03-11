package maio.collection.wrapperclass;

public class StringTest
{
    public static void main(String[] args)
    {
        String str = "abc";//0

        String str2 = new String("abc");//2

        String str3 = "a" + "bc";

        String str4 = "a";

        String str5 = str4 + "bc";

        String str6 = new String("abc");//2


        //两个对象如果equals的结果相等，则调用intern后它们使用==比较的结果也是相等的
//        System.out.println(str2.intern() == str6.intern());
//        //相同对象的哈希码一定是相同的，但相同哈希码不一定是同一个对象
//        System.out.println(str3.hashCode());
//        System.out.println(str2.hashCode());
//        System.out.println(str.equals(str2));
//        System.out.println(str2.equals(str6));





    }
}

