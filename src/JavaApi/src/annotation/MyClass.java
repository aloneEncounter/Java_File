package JavaApi.src.annotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@MyAnnotation(age = 20)
public class MyClass {

    public void test(){

        Class<MyClass> clazz=MyClass.class;

//        MyAnnotation ma=clazz.getAnnotation(MyAnnotation.class);

//        System.out.println(ma.name()+"--"+ma.age());

        Annotation[] annotation=clazz.getAnnotations();
        System.out.println(Arrays.toString(annotation));

    }

    public static void main(String[] args) {
        new MyClass().test();
    }
}
