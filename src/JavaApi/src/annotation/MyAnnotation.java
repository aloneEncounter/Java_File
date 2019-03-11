package JavaApi.src.annotation;


// 自定义一个注解

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String name() default "huangquan";
    int age() ;
}
