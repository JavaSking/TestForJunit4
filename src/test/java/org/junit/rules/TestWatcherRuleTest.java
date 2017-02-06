package org.junit.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;

/**
 * TestWatcher���ԡ�
 * 
 * @author JavaSking 2017��2��6��
 */
public class TestWatcherRuleTest {

	@Rule
	public TestWatcher LoggerTestWatcher = new TestWatcher() {

		protected void succeeded(Description description) {

			System.out.println("succeeded��" + description.getDisplayName() + "��");
		}

		protected void failed(Throwable e, Description description) {

			System.out.println("failed��" + description.getDisplayName() + "��");
		}

		protected void skipped(AssumptionViolatedException e, Description description) {

			System.out.println("skipped��" + description.getDisplayName() + "��");
		}

		protected void starting(Description description) {

			System.out.println("starting��" + description.getDisplayName() + "��");
		}

		protected void finished(Description description) {

			System.out.println("finished��" + description.getDisplayName() + "��");
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
