package org.junit.experimental.categories;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * Category��Categoriesע����ԡ�<br>
 * �ܽ᣺
 * <ul>
 * <li>���Է���/���������ͬ������顣
 * <li>�������ϵ�Categoryע�ⲻͬ���ǵ�ǰ����Է����ϵ�ע�⡣
 * </ul>
 * 
 * @author JavaSking 2017��2��7��
 */
@RunWith(Suite.class)
@SuiteClasses({ CategoryAnnotationTest1.class, CategoryAnnotationTest2.class, CategoryAnnotationTest3.class, CategoryAnnotationTest4.class })
public class CategoryAnnotationTest {

}
