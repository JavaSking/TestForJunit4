package org.junit.rules;

import org.junit.Rule;
import org.junit.Test;

/**
 * TestName²âÊÔ¡£
 * 
 * @author JavaSking 2017Äê2ÔÂ6ÈÕ
 */
public class TestNameRuleTest {

	@Rule
	public TestName testname = new TestName();

	@Test
	public void testSuccess() {

		System.out.println(testname.getMethodName());
	}
}
