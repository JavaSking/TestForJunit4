package org.junit.experimental.categories;

import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Category��Categoriesע�����2��
 * 
 * @author JavaSking 2017��2��7��
 */
@RunWith(Categories.class)
@SuiteClasses({ CategoryAnnotationWithClassTest.class, CategoryAnnotationWithMethodTest.class })
@IncludeCategory(Category3.class)
public class CategoryAnnotationTest2 {

}
