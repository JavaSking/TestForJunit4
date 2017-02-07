package org.junit.rules;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * ExpectedException����1��<br>
 * 
 * @author JavaSking 2017��2��6��
 */
public class ExpectedExceptionRuleTest1 {

	@Rule
	public ExpectedException expected = ExpectedException.none();;

	@Before
	public void buildExpectedException() {

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
	public void expectExceptionSuccess() {

		Throwable cause = new IllegalArgumentException("IllegalArgumentException");
		throw new IllegalArgumentException("expectMessage", cause);
	}
	
	@Test
	public void expectNotExceptionFailureWithNull() {// ������Ч������
		
		expected = null;
	}
	
	@Test
	public void expectNotExceptionFailureWithNone() {// ������Ч������
		
		expected = ExpectedException.none();
	}
	
	@Test
	public void expectNotExceptionFailureByNull() {// ����
		
		expected = null;
		throw new IllegalArgumentException("expectMessage");
	}
	
	@Test
	public void expectNotExceptionFailureByNone() {// ����
		
		expected = ExpectedException.none();
		throw new IllegalArgumentException("expectMessage");
	}
}
