package maio.collection.wrapperclass;
import java.util.Objects;

public class Emp
{
    private String name;

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
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Emp emp = (Emp) o;
        return Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }

    @Override
    public String toString()
    {
        return "Emp{" + "name='" + name + '\'' + '}';
    }
}
