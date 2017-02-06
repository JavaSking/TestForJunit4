package org.junit.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;

/**
 * TestWatcher≤‚ ‘°£
 * 
 * @author JavaSking 2017ƒÍ2‘¬6»’
 */
public class TestWatcherRuleTest {

	@Rule
	public TestWatcher LoggerTestWatcher = new TestWatcher() {

		protected void succeeded(Description description) {

			System.out.println("succeeded°æ" + description.getDisplayName() + "°ø");
		}

		protected void failed(Throwable e, Description description) {

			System.out.println("failed°æ" + description.getDisplayName() + "°ø");
		}

		protected void skipped(AssumptionViolatedException e, Description description) {

			System.out.println("skipped°æ" + description.getDisplayName() + "°ø");
		}

		protected void starting(Description description) {

			System.out.println("starting°æ" + description.getDisplayName() + "°ø");
		}

		protected void finished(Description description) {

			System.out.println("finished°æ" + description.getDisplayName() + "°ø");
		}
	};

	@Test
	public void testWatcherRuleSuccess() {

	}

	@Test
	public void testWatcherRuleFailure() {

		throw new IllegalArgumentException("testWatcherRuleFailure");
	}

	@Test
	public void testWatcherRuleAssumptionViolated() {

		throw new AssumptionViolatedException("testWatcherRuleAssumptionViolated");
	}
}
