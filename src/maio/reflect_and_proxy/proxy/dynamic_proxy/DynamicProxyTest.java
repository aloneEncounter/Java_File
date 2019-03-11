package maio.reflect_and_proxy.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();

        InvocationHandler handler = new DynamicProxySubject(realSubject);

        BaseSubject sub = (BaseSubject) Proxy.newProxyInstance(BaseSubject.class.getClassLoader(),
                new Class<?>[]{BaseSubject.class}, handler);

        sub.subject();
    }
}
