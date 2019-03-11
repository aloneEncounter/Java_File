package maio.reflect_and_proxy.proxy.static_proxy;


//代理主题角色：代理真实主题角色的角色
public class StaticProxySubject extends AbstractSubject
{
    private RealSubject realSubject;

    @Override
    public void subject()
    {
        if(this.realSubject == null)
        {
            this.realSubject = new RealSubject();
        }

        this.before();

        this.realSubject.subject();

        this.after();
    }

    public void before()
    {
        System.out.println("配家用电器");
    }

    public void after()
    {
        System.out.println("另一间房子中住着个单身美女");
    }
}
