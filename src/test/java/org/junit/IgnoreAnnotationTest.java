package org.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Ignoreע����ԡ�
 * 
 * @author JavaSking 2017��2��6��
 */
@RunWith(Suite.class)
@SuiteClasses({ IgnoreAnnotationMethodTest.class, IgnoreAnnotationClassTest.class })
public class IgnoreAnnotationTest {

}
