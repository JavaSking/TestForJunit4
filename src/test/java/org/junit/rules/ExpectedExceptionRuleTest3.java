package org.junit.rules;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Rule;
import org.junit.Test;

/**
 * ExpectedException≤‚ ‘2°£<br>
 * 
 * @author JavaSking 2017ƒÍ2‘¬6»’
 */
public class ExpectedExceptionRuleTest3 {

	@Rule
	public ExpectedException expected = ExpectedException.none();

	@Test
	public void expectExceptionTypeFailure() {// π ’œ

		expected.expect(IllegalArgumentException.class);
		throw new IllegalStateException("expectMessage");
	}

	@Test
	public void expectExceptionTypeSuccess() {

		expected.expect(IllegalArgumentException.class);
		throw new IllegalArgumentException("expectMessage");
	}

	@Test
	public void expectExceptionMessageFailure() {// π ’œ

		expected.expectMessage("expectMessage");
		throw new IllegalArgumentException("<<expect>><<Message>>");
	}

	@Test
	public void expectExceptionMessageSuccess() {

		expected.expectMessage("expectMessage");
		throw new IllegalArgumentException("expectMessage");
	}

	@Test
	public void expectExceptionCauseFailure() {// π ’œ

		expected.expectCause(new BaseMatcher<IllegalArgumentException>() {

			public boolean matches(Object item) {

				return item instanceof IllegalArgumentException;
			}

			public void describeTo(Description description) {

				description.appendText("Cause:IllegalArgumentException");
			}
		});
		Throwable cause = new IndexOutOfBoundsException("IndexOutOfBoundsException");
		throw new IllegalArgumentException("expectMessage", cause);
	}

	@Test
	public void expectExceptionCauseSuccess() {

		expected.expectCause(new BaseMatcher<IllegalArgumentException>() {

			public boolean matches(Object item) {

				return item instanceof IllegalArgumentException;
			}

			public void describeTo(Description description) {

				description.appendText("Cause:IllegalArgumentException");
			}
		});
		Throwable cause = new IllegalArgumentException("IllegalArgumentException");
		throw new IllegalArgumentException("expectMessage", cause);
	}

	@Test
	public void expectNotExceptionSuccess() {

	}
}
