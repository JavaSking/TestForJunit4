package org.junit;

/**
 * Ignoreע���עClass���ԡ�
 * 
 * @author JavaSking 2017��2��6��
 */
@Ignore
public class IgnoreAnnotationClassTest {// ȫ������

	@Test
	public void testMethodWithoutIgnore() {

		System.out.println("testMethodWithoutIgnore()");
	}

	@Test
	public void testMethodWithIgnore() {

		System.out.println("testMethodWithIgnore()");
	}
}
