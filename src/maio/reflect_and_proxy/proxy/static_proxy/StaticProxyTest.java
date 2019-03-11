package maio.reflect_and_proxy.proxy.static_proxy;

public class StaticProxyTest
{
    public static void main(String[] args)
    {
        AbstractSubject sub = new StaticProxySubject();

        sub.subject();
    }
}
