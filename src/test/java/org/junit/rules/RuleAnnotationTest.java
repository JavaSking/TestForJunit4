package org.junit.rules;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Ruleע����ԡ�
 * 
 * @author JavaSking 2017��2��6��
 */
@RunWith(Suite.class)
@SuiteClasses({ ExpectedExceptionRuleTest1.class, TimeoutRuleTest.class, TestWatcherRuleTest.class, TestNameRuleTest.class, ErrorCollectorRuleTest.class

})
public class RuleAnnotationTest {

}
