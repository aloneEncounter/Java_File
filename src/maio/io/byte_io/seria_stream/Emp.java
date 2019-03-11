package maio.io.byte_io.seria_stream;
import java.io.Serializable;

//序列化对象是一定要实现一个Serializable接口, 序列化使用的场景在分布式服务上
//序列化：把内存中的数据存储到其他存储设备上
//反序列化：把其他存储设备上的数据读取到内存中
public class Emp implements Serializable
{
    private int id;

    private String name;

    public Emp()
    {
    }

    public Emp(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Emp{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
