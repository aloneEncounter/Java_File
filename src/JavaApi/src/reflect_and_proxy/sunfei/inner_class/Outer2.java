package JavaApi.src.reflect_and_proxy.sunfei.inner_class;

import java.util.Arrays;
import java.util.Comparator;

//  匿名内部类
public class Outer2 {
    public static void main(String[] args) {
        class A{}
        A[] a=new A[3];

        Arrays.sort(a, new Comparator<A>() {
            @Override
            public int compare(A o1, A o2) {
                return 0;
            }
        });

    }

}
