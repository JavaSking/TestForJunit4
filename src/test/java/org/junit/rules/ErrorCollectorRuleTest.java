package org.junit.rules;

import org.junit.Rule;
import org.junit.Test;

/**
 * ErrorCollector≤‚ ‘°£
 * 
 * @author JavaSking 2017ƒÍ2‘¬6»’
 */
public class ErrorCollectorRuleTest {

	@Rule
	public ErrorCollector errorCollector = new ErrorCollector();

	@Test
	public void testSuccess() {

		System.out.println("testSuccess()");
	}

	@Test
	public void testFailure() {

		System.out.println("testFailure()");
		throw new IllegalArgumentException("testFailure()");
	}

	@Test
	public void testAfterFailure() {

		System.out.println("testAfterFailure()");
	}
}
