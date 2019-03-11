package maio;

import java.lang.annotation.Annotation;

@MyAnnocation(age=10)
public class MyClass {





    public static void main(String[] args) {

        Class clazz=MyClass.class;
        Annotation ma=clazz.getAnnotation(MyAnnocation.class);
        System.out.println(ma.toString());
        System.out.println(ma.annotationType());
    }
    //公有的 无返回值的  以test开头的 无参数的
}
