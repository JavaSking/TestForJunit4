package org.junit;

/**
 * Ignore注解标注Method测试。
 * 
 * @author JavaSking 2017年2月6日
 */
public class IgnoreAnnotationMethodTest {

	@Test
	public void testMethodWithoutIgnore() {

		System.out.println("testMethodWithoutIgnore()");
	}

	@Ignore
	@Test
	public void testMethodWithIgnore() {//跳过

		System.out.println("testMethodWithIgnore()");
	}
}
