package org.junit.experimental.categories;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Category��Categoriesע�����1��
 * 
 * @author JavaSking 2017��2��7��
 */
@RunWith(Categories.class)
@SuiteClasses({ CategoryAnnotationWithClassTest.class, CategoryAnnotationWithMethodTest.class })
public class CategoryAnnotationTest1 {

}
