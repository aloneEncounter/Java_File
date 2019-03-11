package maio.collection.generic_type;

public class GenericType<T, E, M>
{
    public <T> void test(T t, T t2)
    {
        System.out.println(t + ", " + t2);
    }

    public void test2(E e, M m)
    {
        System.out.println(e + ", " + m);
    }

    public static void main(String[] args)
    {
        GenericType gt = new GenericType();

        gt.test("abc", 3);
    }
}
