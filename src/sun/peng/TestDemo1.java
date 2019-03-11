package sun.peng;

public class TestDemo1 {
    double fo(int i,double d){
        i=i+1;
        d=d+1;
        return i+d;
    }

    public static void main(String[] args) {
        TestDemo1 t=new TestDemo1();
        int i=1;
        double d=2;

        System.out.println(t.fo(i, d));
        System.out.printf("i=%d,d=%f",i,d);
//        给方法传递参数时，如果参数时基本类型变量
        //无论方法中如何修改这个参数，这两个变量的值，在方法执行后时不变的
    }
}
