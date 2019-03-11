package maio.for循环;

public class LoopStructureTest
{
    public static void main(String[] args)
    {
        //        testWhile();
        //        testDoWhile();
        //        testFor();
        //        testFor2();
        //        testForWithEvenResult();
        //        testForWithOddResult();
        //        testForWithEvenResult2();
        //        testForWithOddResult2();
        //        testForWithEvenResult3();
//        testForWithOddResult3();
        test();
    }

    public static void test()
    {
        String str = "123456";
        for(int i = 0; i < str.length(); i++)
        {
            System.out.println(str.toCharArray()[i]);
        }
    }

    public static void testForWithOddResult3()
    {
        int num = 0;
        int sum = 0;

        for (; num <= 5; )
        {
            num++;

            if (num % 2 == 0)
            {
                continue;//强制终止本次循环，进入下次循环
            }
            sum += num;

        }

        System.out.println("sum = " + sum);
        System.out.println("num = " + num);
    }

    public static void testForWithEvenResult3()
    {
        int num = 0;
        int sum = 0;

        for (; num <= 5; )
        {
            num++;
            if (num > 5)
            {
                break;
            }

            if (num % 2 != 0)
            {
                continue;//强制终止本次循环，进入下次循环
            }
            sum += num;

        }

        System.out.println("sum = " + sum);
        System.out.println("num = " + num);
    }


    public static void testForWithOddResult2()
    {
        int num = 0;
        int sum = 0;

        for (; num <= 5; )
        {
            if (num % 2 != 0)
            {
                sum += num;
            }

            num++;
        }

        System.out.println("sum = " + sum);
        System.out.println("num = " + num);
    }

    public static void testForWithEvenResult2()
    {
        int num = 0;
        int sum = 0;

        for (; num <= 5; )
        {
            if (num % 2 == 0)
            {
                sum += num;
            }
            num++;
        }

        System.out.println("sum = " + sum);
        System.out.println("num = " + num);
    }

    public static void testForWithOddResult()
    {
        int num = 1;
        int sum = 0;

        for (; num <= 5; )
        {
            sum += num;
            num += 2;
        }

        System.out.println("sum = " + sum);
        System.out.println("num = " + num);
    }

    public static void testForWithEvenResult()
    {
        int num = 0;
        int sum = 0;

        for (; num <= 5; )
        {
            sum += num;
            num += 2;
        }

        System.out.println("sum = " + sum);
        System.out.println("num = " + num);
    }

    public static void testFor2()
    {
        int num = 0;
        int sum = 0;

        for (; num <= 5; )
        {
            sum += num;
            num++;
        }

        System.out.println("sum = " + sum);
        System.out.println("num = " + num);
    }

    public static void testFor()
    {
        int num = 0;
        int sum = 0;

        for (; num <= 5; num++)
        {
            sum += num;

        }
        System.out.println("sum = " + sum);
        System.out.println("num = " + num);
    }

    public static void testDoWhile()
    {
        int num = 0;
        int sum = 0;
        do
        {
            sum += num;
            num++;
        } while (num <= 5);

        System.out.println("sum = " + sum);
        System.out.println("num = " + num);
    }

    public static void testWhile()
    {
        int num = 0;
        int sum = 0;
        while (num <= 5)
        {
            sum += num;
            num++;
        }

        System.out.println("sum = " + sum);
        System.out.println("num = " + num);
    }

}
