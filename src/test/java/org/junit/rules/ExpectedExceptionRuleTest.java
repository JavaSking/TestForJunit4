package org.junit.rules;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * ExpectedException≤‚ ‘°£
 * 
 * @author JavaSking 2017ƒÍ2‘¬6»’
 */
public class ExpectedExceptionRuleTest {

	@Rule
	public ExpectedException expected = ExpectedException.none();

	@Test
	public void expectExceptionSuccess() {

		expected.expect(IndexOutOfBoundsException.class);
		throw new IndexOutOfBoundsException("expectExceptionSuccess");
	}

	@Test
	public void expectExceptionFailure() {//π ’œ

		expected.expect(IndexOutOfBoundsException.class);
		throw new IllegalArgumentException("expectExceptionFailure");
	}

	@Test
	public void expectMessageSuccess() {

		expected.expectMessage("expectMessage");
		throw new RuntimeException("<<expectMessage>>");
	}

	@Test
	public void expectMessageFailure() {//π ’œ

		expected.expectMessage("expectMessage");
		throw new RuntimeException("<<expect>><<Message>>");
	}

	@Test
	public void expectCourseSuccess() {

		expected.expectCause(new BaseMatcher<IllegalArgumentException>() {

			public boolean matches(Object item) {

				return item instanceof IllegalArgumentException;
			}

			public void describeTo(Description description) {

				description.appendText("Cause:IllegalArgumentException");
			}
		});
		Throwable cause = new IllegalArgumentException("IllegalArgumentException");
		throw new RuntimeException(cause);
	}

	@Test
	public void expectCourseFailure() {//π ’œ

		expected.expectCause(new BaseMatcher<IllegalArgumentException>() {

			public boolean matches(Object item) {

				return item instanceof IllegalArgumentException;
			}

			public void describeTo(Description description) {

				description.appendText("Cause:IllegalArgumentException");
			}
		});
		Throwable cause = new IndexOutOfBoundsException("IndexOutOfBoundsException");
		throw new RuntimeException(cause);
	}
}
