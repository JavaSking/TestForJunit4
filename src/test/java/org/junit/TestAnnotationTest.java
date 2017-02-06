package org.junit;

import static org.junit.Assert.assertEquals;

/**
 * 测试Test注解。
 * 
 * @author JavaSking 2017年2月6日
 */
public class TestAnnotationTest {

	@Test
	public void testTestWithoutAttributeSuccess() {

		assertEquals(3, 3);
	}

	@Test
	public void testTestWithoutAttributeFailure() {// 判定为故障

		assertEquals(3, 4);
	}

	@Test(timeout = 200)
	public void testTestWithTimeoutSuccess() {

		for (int i = 1; i <= 1000; i++) {
			;
		}
	}

	@Test(timeout = 1)
	public void testTestWithTimeoutFailure() {// 判定为错误

		for (int i = 1; i <= 1000000; i++) {
			;
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTestWithExpectedSuccess() {

		throw new IllegalArgumentException();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTestWithExpectedFailure() {// 判定为故障

	}
}
