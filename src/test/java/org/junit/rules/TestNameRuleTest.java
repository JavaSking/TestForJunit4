package org.junit.rules;

import org.junit.Rule;
import org.junit.Test;

/**
 * TestName���ԡ�
 * 
 * @author JavaSking 2017��2��6��
 */
public class TestNameRuleTest {

	@Rule
	public TestName testname = new TestName();

	@Test
	public void testSuccess() {

		System.out.println(testname.getMethodName());
	}
}
