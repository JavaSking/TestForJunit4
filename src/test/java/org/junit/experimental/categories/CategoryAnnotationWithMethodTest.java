package org.junit.experimental.categories;

import org.junit.Test;

/**
 * Categoryע���ע������
 * 
 * @author JavaSking 2017��2��7��
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
