package maio.reflect_and_proxy.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//代理主题角色：代理真实主题角色的角色
//JDK的动态代理只能代理接口
public class DynamicProxySubject implements InvocationHandler
{
    private RealSubject realSubject;

    public DynamicProxySubject(RealSubject realSubject)
    {
        this.realSubject = realSubject;
    }

    public void before()
    {
        System.out.println("配家用电器");
    }

    public void after()
    {
        System.out.println("另一间房子中住着个单身美女");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        if(this.realSubject == null)
        {
            this.realSubject = new RealSubject();
        }

        this.before();

        Object methodReturnValue = method.invoke(this.realSubject, args);

        this.after();

        System.out.println(methodReturnValue);

        return methodReturnValue;
    }
}
