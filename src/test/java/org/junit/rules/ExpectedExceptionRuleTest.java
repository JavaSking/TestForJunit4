package org.junit.rules;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * ExpectedException���ԡ�<br>
 * �Ӳ���1�Ͳ���2���Կ�������Beforeע������Ruleע��ʱ����Before�����г�ʼ��Rule�Ļ���ʧЧ��<br>
 * 
 * @author JavaSking 2017��2��7��
 */
@RunWith(Suite.class)
@SuiteClasses({ ExpectedExceptionRuleTest1.class, ExpectedExceptionRuleTest2.class, ExpectedExceptionRuleTest3.class })
public class ExpectedExceptionRuleTest {

}
