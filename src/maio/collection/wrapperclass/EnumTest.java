package maio.collection.wrapperclass;

import java.util.Arrays;

public class EnumTest
{
    public static void main(String[] args)
    {
        System.out.println(MyEnum.FRI);

        System.out.println(Arrays.toString(MyEnum.values()));

        System.out.println(MyEnum.valueOf("SUN"));
        System.out.println(MyEnum.valueOf(MyEnum.class, "SUN"));


        MyEnum2 me = MyEnum2.valueOf("SUN");

        System.out.println(me.getDay());

        System.out.println(me.name());
    }

    private enum MyEnum
    {
        SUN, MON, TUS, WEN, THI, FRI, SAT;
    }

    private enum MyEnum2
    {

        SUN(7), MON(1), TUS(2), WEN(3), THI(4), FRI(5), SAT(6);

        private int day;//成员变量一定在枚举常量的下面声明

        MyEnum2(int day)
        {
            this.day = day;
        }

        public int getDay()
        {
            return day;
        }
    }

}
