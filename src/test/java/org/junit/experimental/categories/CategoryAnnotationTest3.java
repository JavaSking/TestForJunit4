package org.junit.experimental.categories;

import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Category、Categories注解测试3。
 * 
 * @author JavaSking 2017年2月7日
 */
@RunWith(Categories.class)
@SuiteClasses({ CategoryAnnotationWithClassTest.class, CategoryAnnotationWithMethodTest.class })
@IncludeCategory(Category4.class)
public class CategoryAnnotationTest3 {

}
