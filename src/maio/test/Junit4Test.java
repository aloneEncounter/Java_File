package maio.test;

import maio.junit.Emp;
import org.junit.*;


public class Junit4Test
{
    private Emp emp =null;

    @BeforeClass
    public static void start()
    {
        System.out.println("start 方法被执行");
    }

    @AfterClass
    public static void end()
    {
        System.out.println("end 方法被执行");
    }

    @Before
    public void init()//相当于初始化
    {
        emp = new Emp();
        System.out.println("init 方法被执行");
    }

    @After
    public void destroy()//相当于销毁
    {
        emp = null;
        System.out.println("destroy 方法被执行");
    }

    @Test
//    @Ignore//忽略
    public void testGetSalary()
    {
        System.out.println("testGetSalary 方法被调用");

        String actual =  emp.getSalary();

        Assert.assertEquals("获取工资", actual);
    }

    @Test
    public void testGetSalary2()
    {
        System.out.println("testGetSalary2 方法被调用");

        Assert.assertEquals(emp, new Emp());
    }
}
