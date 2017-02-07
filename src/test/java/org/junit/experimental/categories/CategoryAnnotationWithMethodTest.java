package org.junit.experimental.categories;

import org.junit.Test;

/**
 * Category注解标注方法。
 * 
 * @author JavaSking 2017年2月7日
 */
public class CategoryAnnotationWithMethodTest {

	@Category(Category1.class)
	@Test
	public void testCategory1Method1() {

		System.out.println("testCategory1Method1()");
	}

	@Category(Category2.class)
	@Test
	public void testCategory2Method1() {

		System.out.println("testCategory2Method1()");
	}

	@Category(Category2.class)
	@Test
	public void testCategory2Method2() {

		System.out.println("testCategory2Method2()");
	}

	@Category(Category1.class)
	@Test
	public void testCategory1Method2() {

		System.out.println("testCategory1Method2()");
	}

	@Test
	public void testMethodWithoutCategory() {

		System.out.println("testMethodWithoutCategory()");
	}
}
