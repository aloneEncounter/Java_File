package maio.reflect_and_proxy.proxy.dynamic_proxy;

//真实主题角色：真正完成任务的角色
public class RealSubject implements BaseSubject
{
    @Override
    public void subject()
    {
        System.out.println("出租房子");
    }
}
