package maio.reflect_and_proxy.proxy.static_proxy;


//真实主题角色：真正完成任务的角色  继承抽象主题角色
public class RealSubject extends AbstractSubject
{
    @Override
    public void subject()
    {
        System.out.println("出租房子");
    }
}
