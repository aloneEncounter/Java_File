package JavaApi.src.common;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int i=9;

        List list=new ArrayList();
        list.add(i);   //  ?????why????? i自动装箱 --》Integer
    }
}
