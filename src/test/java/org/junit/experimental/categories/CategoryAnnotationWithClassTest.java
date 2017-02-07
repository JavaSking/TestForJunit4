package org.junit.experimental.categories;

import org.junit.Test;

/**
 * Categoryע���ע�ࡣ
 * 
 * @author JavaSking 2017��2��7��
 */
@Category(Category3.class)
public class CategoryAnnotationWithClassTest {

	@Test
	public void testCategory3Method1() {

		System.out.println("testCategory3Method1()");
	}

	@Test
	public void testCategory3Method2() {

		System.out.println("testCategory3Method2()");
	}
	
	@Category(Category4.class)
	@Test
	public void testCategory4Method1() {

		System.out.println("testCategory4Method1()");
	}

}
