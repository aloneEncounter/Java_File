package maio.reflect_and_proxy.reflect;

public class ClassTest
{
    public static void main(String[] args)
    {
                getFirstClass();

//                getSecondClass();

//        getThirdClass();
    }

    public static void getThirdClass()
    {
        Class<String> clazz = String.class;

        System.out.println(clazz);
        System.out.println(clazz.getName());
        System.out.println(clazz.getCanonicalName());

        System.out.println(clazz.getSuperclass());   // class java.lang.Object
        System.out.println(clazz.getSuperclass().getName());  //java.lang.Object
//        System.out.println(clazz.getDeclaredMethods());
    }

    public static void getSecondClass()
    {
        //jdbc连接数据库时用到Class.forName(类的完整限定名);
        try
        {
            Class<?> clazz = Class.forName("java.lang.String");

            System.out.println(clazz.toString());
            System.out.println(clazz);
            System.out.println(clazz.getName());
//            System.out.println(clazz.getCanonicalName());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void getFirstClass()
    {
        String str = new String();

        //描述String类的类，简称(Class)类类
        Class<?> clazz = str.getClass();

//        System.out.println(clazz.toString());
        System.out.println(clazz.getName());
        System.out.println(clazz.getCanonicalName());
    }
}
