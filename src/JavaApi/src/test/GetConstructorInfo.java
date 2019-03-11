package JavaApi.src.test;

//  1、newInstance 获取对象的实例
//  2、通过构造函数获取对象的实例

import java.lang.reflect.Constructor;

public class GetConstructorInfo {
    public void text1() throws Exception {
        Class clazz = Class.forName("JavaApi.src.stu.Person");
        Object obj = clazz.newInstance();    //通过newInstance获取对象实例
        System.out.println(obj);
        System.out.println(obj.toString());
    }

    public void test2() throws Exception {
        Class clazz = Class.forName("JavaApi.src.stu.Person");
        //获取类的所有“公有的”的构造函数

        Constructor[] cons = clazz.getDeclaredConstructors();
        System.out.println("===========构造函数展示===================");
        for (Constructor c : cons) {
            Class<?>[] parameterTypes = c.getParameterTypes();
            if (parameterTypes.length == 0) {
                System.out.println("此构造函数没有参数");
            } else {
                System.out.print("次构造函数参数列表为：【");
                for (int i = 0; i < parameterTypes.length; i++) {
                  if(i!=0){
                      System.out.print(",");
                  }
                  System.out.print(parameterTypes[i].getName());
                }
                System.out.println("】");
            }
//            System.out.println("\n"+c);
        }
        //无参构造实例化
        Constructor c1 =clazz.getConstructor();
        // 访问无参构造  通过无参构造获取 Person类的对象的实例
        Object obj=c1.newInstance();
        System.out.println(obj);

        //获取有参构造
        Constructor c2=clazz.getDeclaredConstructor(String.class,String.class,String.class);

        //c2是私有的
        c2.setAccessible(true);
        // 有参构造传递实例
        Object obj1=c2.newInstance("李四","北京","love you");
        System.out.println(obj1);

    }


    public static void main(String[] args) throws Exception {
        GetConstructorInfo con = new GetConstructorInfo();
        con.text1();
        con.test2();
    }
}
