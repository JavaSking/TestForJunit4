package org.junit;

/**
 * FixMethodOrderע����ԡ�
 * 
 * @author JavaSking 2017��2��6��
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
