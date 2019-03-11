package maio.test;


//   Suite 可以依次执行全面 多个类中的测试实例

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)      // Runwith下的suite
@SuiteClasses({Junit3Test.class, Junit4Test.class})   //括号内为Class数组
public class JunitTest
{
}
