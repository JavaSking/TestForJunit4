package org.junit.rules;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * ExpectedException���ԡ�<br>
 * 
 * @author JavaSking 2017��2��6��
 */
public class ExpectedExceptionRuleTest2 {

	@Rule
	public ExpectedException expected = null;

	@Before
	public void buildExpectedException() {

		expected = ExpectedException.none();
		expected.expect(IllegalArgumentException.class);
		expected.expectMessage("expectMessage");
		expected.expectCause(new BaseMatcher<IllegalArgumentException>() {

			public boolean matches(Object item) {

				return item instanceof IllegalArgumentException;
			}

			public void describeTo(Description description) {

				description.appendText("Cause:IllegalArgumentException");
			}
		});
	}

	@Test
	public void expectExceptionFailureByNotMatchType() {// ����

		Throwable cause = new IllegalArgumentException("IllegalArgumentException");
		throw new IllegalStateException("expectMessage", cause);
	}

	@Test
	public void expectExceptionFailureByNotMatchMessage() {// ����

		Throwable cause = new IllegalArgumentException("IllegalArgumentException");
		throw new IllegalArgumentException("<<expect>><<Message>>", cause);
	}

	@Test
	public void expectExceptionFailureByNotMatchCause() {// ����

		Throwable cause = new IndexOutOfBoundsException("IndexOutOfBoundsException");
		throw new IllegalArgumentException("expectMessage", cause);
	}

	@Test
	public void expectExceptionSuccess() {// TODO: ����

		Throwable cause = new IllegalArgumentException("IllegalArgumentException");
		throw new IllegalArgumentException("expectMessage", cause);
	}
	
	@Test
	public void expectNotExceptionSuccess() {
		
	}
	
	@Test
	public void expectNotExceptionSuccessWithNull() {
		
		expected = null;
	}
	
	@Test
	public void expectNotExceptionSuccessWithNone() {
		
		expected = ExpectedException.none();
	}
}
