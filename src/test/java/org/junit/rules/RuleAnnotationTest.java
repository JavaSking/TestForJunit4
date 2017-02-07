package org.junit.rules;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Rule注解测试。
 * 
 * @author JavaSking 2017年2月6日
 */
@RunWith(Suite.class)
@SuiteClasses({ ExpectedExceptionRuleTest1.class, TimeoutRuleTest.class, TestWatcherRuleTest.class, TestNameRuleTest.class, ErrorCollectorRuleTest.class

})
public class RuleAnnotationTest {

}
