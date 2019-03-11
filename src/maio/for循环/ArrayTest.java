package maio.for循环;

public class ArrayTest

{
    public static void main(String[] args)
    {
        //        testMultFor();
        //        testMultFor2();
        //        testMultFor3();
        //        testMultFor4();
        testMultFor5();
    }

    //请打印出所有的“水仙花”数
    //    水仙花数：该数的每一位数字的立方和刚好等于该数本身
    public static void testMultFor5()
    {

        for (int i = 100; i < 1000; i++)
        {
            int geWei = i % 10;
            int shiWei = i / 10 % 10;
            int baiWei = i / 100;

            if (geWei * geWei * geWei + shiWei * shiWei * shiWei + baiWei * baiWei * baiWei == i)
            {
                System.out.println(i + "是水仙花数");
            }
        }
    }

    public static void testMultFor4()
    {
        for (int i = 9; i >= 1; i--)
        {

            for (int j = 9; j >= i; j--)
            {
                System.out.printf("%d x %d = %-3d ", j, i, i * j);
            }

            System.out.println();
        }
    }

    public static void testMultFor3()
    {
        for (int i = 1; i <= 9; i++)
        {

            for (int j = 1; j <= i; j++)
            {
                System.out.printf("%d x %d = %-3d ", j, i, i * j);
            }

            System.out.println();
        }
    }

    public static void testMultFor2()
    {
        for (int i = 1; i <= 9; i++)
        {

            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " * " + i + " = " + i * j + "   ");
            }

            System.out.println();
        }
    }

    public static void testMultFor()
    {
        for (int i = 1; i <= 9; i++)
        {

            for (int j = 1; j <= 9; j++)
            {
                if (i >= j)
                {
                    System.out.print(j + " * " + i + " = " + i * j + "   ");
                }

            }

            System.out.println();
        }
    }

}
