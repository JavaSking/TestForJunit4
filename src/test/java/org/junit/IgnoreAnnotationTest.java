package org.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Ignore注解测试。
 * 
 * @author JavaSking 2017年2月6日
 */
@RunWith(Suite.class)
@SuiteClasses({ IgnoreAnnotationMethodTest.class, IgnoreAnnotationClassTest.class })
public class IgnoreAnnotationTest {

}
