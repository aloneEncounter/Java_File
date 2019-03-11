package JavaApi.src.reflect_and_proxy.sunfei.inner_class;

//  嵌套内部类
public class Outer {
    private int i;

    void g() {
    }

    class Inner {
        private int i;
//        private int j=i;

        static final int J = 1;

         void f() {
            g();
            i = 1;
            Outer.this.i = 1;
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
//        Inner inner=outer.new Inner();
        Inner inner = new Outer().new Inner();
    }
}
