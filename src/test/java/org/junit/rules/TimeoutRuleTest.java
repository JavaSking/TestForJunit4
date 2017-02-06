package org.junit.rules;

import org.junit.Rule;
import org.junit.Test;

/**
 * Timeout���ԡ�
 * 
 * @author JavaSking 2017��2��6��
 */
public class TimeoutRuleTest {

	@Rule
	public Timeout timeout = new Timeout(10);

	@Test
	public void testTimeoutSuccess() {

	}

	@Test
	public void testMethodNoControl() {

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
	}

	@Test
	public void testMethodFailure() {// ����

		try {
			Thread.sleep(11);
		} catch (InterruptedException e) {
		}
	}
}
