package maio.multi_thread.thread.thread_5;


public class OperNumTest
{
    public static void main(String[] args)
    {
        OperNum operNum = new OperNum();

        IncreaseThread it = new IncreaseThread(operNum);

        IncreaseThread it2 = new IncreaseThread(operNum);

        DecreaseThread dt = new DecreaseThread(operNum);

        DecreaseThread dt2 = new DecreaseThread(operNum);

//        it.start();
//
//        it2.start();
//
//        dt.start();
//
//
//        dt2.start();
        int i=2;
        System.out.println(i+(++i));

        i++;
        i++;
        --i;
        System.out.println(i);
        int x=5;

        System.out.println(x++/2);
        System.out.println(~(-1));
        System.out.println(~7);
        System.out.println(~-7);
        System.out.println(~-9);
    }
}
