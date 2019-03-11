package maio.reflect_and_proxy.reflect;

import java.lang.reflect.Method;

public class MethodTest {
    public static void main(String[] args) {
        Class<String> clazz = String.class;

//        Method[] methods = clazz.getMethods();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
        }
    }
}
