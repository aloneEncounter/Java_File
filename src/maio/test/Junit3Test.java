package maio.test;

import maio.junit.Emp;
import junit.framework.TestCase;
import org.junit.Assert;


/**
 * JUnit3:
 * 1.测试类必须要继承TestCase
 * 2.测试方法必须满足以下条件：
 *   (1)测试方法必须公有
 *   (2)测试方法必须无返回值类型
 *   (3)测试方法必须以test开头
 *   (4)测试方法必须无形参
 */
public class Junit3Test extends TestCase
{
    private Emp emp =null;
    @Override
    protected void setUp() throws Exception//相当于初始化
    {
        emp = new Emp();
        System.out.println("setUp 方法被执行");
    }

    @Override
    protected void tearDown() throws Exception//相当于销毁
    {
        emp = null;
        System.out.println("tearDown 方法被执行");
    }

    public void testGetSalary()
    {
        System.out.println("testGetSalary 方法被调用");


        String actual =  emp.getSalary();

        Assert.assertEquals("获取工资", actual);
    }

    public void testGetSalary2()
    {
        System.out.println("testGetSalary2 方法被调用");

        Assert.assertEquals(emp, new Emp());

    }
}
