package org.junit;

/**
 * Ignoreע���עMethod���ԡ�
 * 
 * @author JavaSking 2017��2��6��
 */
public class IgnoreAnnotationMethodTest {

	@Test
	public void testMethodWithoutIgnore() {

		System.out.println("testMethodWithoutIgnore()");
	}

	@Ignore
	@Test
	public void testMethodWithIgnore() {//����

		System.out.println("testMethodWithIgnore()");
	}
}
