package maio.collection.wrapperclass;

/**
 * 包装类:
 * byte->Byte
 * short->Short
 * char->Character
 * int->Integer
 * long->Long
 * float->Float
 * double->Double
 * boolean->Boolean
 *
 * 自动装箱：由原生类型自动的转换成包装类型
 * 自动拆箱：由包装类型装换成原生类型
 */

public class WrapperTest
{
    public static void main(String[] args)
    {
        Integer i = new Integer(1);

        int num = i;//自动拆箱

        Integer i2 = new Integer(1);

        System.out.println(i == i2);

        //在-128到127之间Integer类会自动缓存该范围
        Integer i3 = 100;
        Integer i4 = 100;

        System.out.println(i3 == i4);

        Integer i5 = 200;
        Integer i6 = 200;

        System.out.println(i5 == i6);


    }
}
