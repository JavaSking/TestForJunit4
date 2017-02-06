package org.junit;

/**
 * Ignore注解标注Class测试。
 * 
 * @author JavaSking 2017年2月6日
 */
@Ignore
public class IgnoreAnnotationClassTest {// 全体跳过

	@Test
	public void testMethodWithoutIgnore() {

		System.out.println("testMethodWithoutIgnore()");
	}

	@Test
	public void testMethodWithIgnore() {

		System.out.println("testMethodWithIgnore()");
	}
}
