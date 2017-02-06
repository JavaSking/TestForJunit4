package org.junit.rules;

import org.junit.Rule;
import org.junit.Test;

/**
 * Timeout²âÊÔ¡£
 * 
 * @author JavaSking 2017Äê2ÔÂ6ÈÕ
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
	public void testMethodFailure() {// ´íÎó

		try {
			Thread.sleep(11);
		} catch (InterruptedException e) {
		}
	}
}
