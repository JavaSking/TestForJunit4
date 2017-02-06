package org.junit;

import static org.junit.Assert.assertEquals;

/**
 * ����Testע�⡣
 * 
 * @author JavaSking 2017��2��6��
 */
public class TestAnnotationTest {

	@Test
	public void testTestWithoutAttributeSuccess() {

		assertEquals(3, 3);
	}

	@Test
	public void testTestWithoutAttributeFailure() {// �ж�Ϊ����

		assertEquals(3, 4);
	}

	@Test(timeout = 200)
	public void testTestWithTimeoutSuccess() {

		for (int i = 1; i <= 1000; i++) {
			;
		}
	}

	@Test(timeout = 1)
	public void testTestWithTimeoutFailure() {// �ж�Ϊ����

		for (int i = 1; i <= 1000000; i++) {
			;
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTestWithExpectedSuccess() {

		throw new IllegalArgumentException();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTestWithExpectedFailure() {// �ж�Ϊ����

	}
}
