package JavaApi.src.reflect_and_proxy.sunfei.inner_class;

//  局部内部类
public class Outer1 {
    private int i;

    void g(int j) {
        final int K =1;

        class Inner { // 相当于在方法中定义了一个变量
           void f(){

           }
        }
    }



    public static void main(String[] args) {
        Outer1 outer = new Outer1();
//        Inner inner=outer.new Inner();
    }
}
