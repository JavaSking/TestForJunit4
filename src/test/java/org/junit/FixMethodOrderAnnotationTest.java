package org.junit;

/**
 * FixMethodOrder注解测试。
 * 
 * @author JavaSking 2017年2月6日
 */
@FixMethodOrder
public class FixMethodOrderAnnotationTest {

	@Test
	public void testMethodA() {

		System.out.println("testMethodA()");
	}

	@Test
	public void testMethodC() {

		System.out.println("testMethodC()");
	}

	@Test
	public void testMethodD() {

		System.out.println("testMethodD()");
	}

	@Test
	public void testMethodB() {

		System.out.println("testMethodB()");
	}
}
