package maio.reflect_and_proxy.reflect;

import java.lang.reflect.Constructor;

public class ConstructorTest
{
    public static void main(String[] args)
    {
        Class<String> clazz = String.class;

//        Constructor<?>[] constructors = clazz.getConstructors();
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();



        for (Constructor<?> constructor : constructors)
        {
            System.out.println(constructor);

            System.out.println(constructor.getName());
        }
    }
}
