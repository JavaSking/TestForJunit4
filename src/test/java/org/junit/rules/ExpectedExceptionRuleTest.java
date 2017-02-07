package org.junit.rules;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * ExpectedException测试。<br>
 * 从测试1和测试2可以看出，当Before注解碰到Rule注解时，在Before方法中初始化Rule的话将失效。<br>
 * 
 * @author JavaSking 2017年2月7日
 */
@RunWith(Suite.class)
@SuiteClasses({ ExpectedExceptionRuleTest1.class, ExpectedExceptionRuleTest2.class, ExpectedExceptionRuleTest3.class })
public class ExpectedExceptionRuleTest {

}
