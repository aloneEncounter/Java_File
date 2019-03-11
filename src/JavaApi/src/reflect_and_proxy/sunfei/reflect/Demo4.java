package JavaApi.src.reflect_and_proxy.sunfei.reflect;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class Demo4 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Object object=Array.newInstance(Integer.class,10);

        int[] numbers={1,2,3};
        int[] numbers1={};
        System.arraycopy(numbers,0,numbers1,0,Math.min(numbers.length,numbers1.length));
        Arrays.stream(numbers).forEach(System.out::println);
        System.out.println(2 << 3);
        System.out.println(8 >>> 2);
        System.out.println(8 >> 2);
    }
}
