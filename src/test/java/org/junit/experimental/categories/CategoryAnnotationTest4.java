package org.junit.experimental.categories;

import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Category��Categoriesע�����4��
 * 
 * @author JavaSking 2017��2��7��
 */
@RunWith(Categories.class)
@SuiteClasses({ CategoryAnnotationWithClassTest.class, CategoryAnnotationWithMethodTest.class })
@ExcludeCategory(Category4.class)
public class CategoryAnnotationTest4 {

}
