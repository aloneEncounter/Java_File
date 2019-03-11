package JavaApi.src.annotation;


/**
 * java注解：
 * 1.内建注解：Ovveride Deprecated SuppressWarnings
 * 2.元注解：Target Retention Documented Inherited
 * 元注解是声明其他注解的注解
 */

public class BuilderInAnnocationTest {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated    //  过时的
    public void test(){
        System.out.println("过时的");
    }

    @SuppressWarnings(value ="alone")
//    @SuppressWarnings({"unuse","serial"})
    public void eat(){
        String a="alone";

        System.out.println("unuse");
    }


    public static void main(String[] args) {
        new BuilderInAnnocationTest().test();
        new BuilderInAnnocationTest().eat();
    }

}
