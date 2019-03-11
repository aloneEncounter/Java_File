package JavaApi.src.reflect_and_proxy.sunfei.inner_class;

import java.util.Arrays;
import java.util.Comparator;

//  匿名内部类
public class Outer3 {

    interface I {
        void f();

        void g();
    }


     static void f(I i){

    }

    static class C implements I{

        @Override
        public void f() {

        }

        @Override
        public void g() {

        }
    }

    public static void main(String[] args) {

        /*f(new I() {
            @Override
            public void f() {

            }

            @Override
            public void g() {

            }
        });*/
       f(new C());
    }

}
