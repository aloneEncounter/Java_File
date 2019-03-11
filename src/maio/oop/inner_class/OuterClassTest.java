package maio.oop.inner_class;

public class OuterClassTest
{
    public static void main(String[] args)
    {
        OuterClass oc = new OuterClass();

        oc.test();

//        OuterClass.InnerClass ic = new OuterClass().new InnerClass();
        OuterClass.InnerClass ic = oc.new InnerClass();

        ic.testInnerClass();

        OuterClass.StaitcInnerClass sic = new OuterClass.StaitcInnerClass();

        sic.testStaticInnerClass();

    }
}
