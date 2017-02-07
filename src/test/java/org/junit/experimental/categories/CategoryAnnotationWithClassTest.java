package org.junit.experimental.categories;

import org.junit.Test;

/**
 * Category注解标注类。
 * 
 * @author JavaSking 2017年2月7日
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
