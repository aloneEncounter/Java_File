package maio.collection.list1;

import java.util.Objects;

public class Emp
{
    private String name;

    public Emp()
    {
    }

    public Emp(String name)
    {
        this.name = name;
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
        return "Emp{" + "name='" + name + '\'' + '}';
    }
}
