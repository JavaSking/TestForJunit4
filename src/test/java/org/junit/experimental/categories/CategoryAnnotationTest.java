package org.junit.experimental.categories;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * Category、Categories注解测试。<br>
 * 总结：
 * <ul>
 * <li>测试方法/测试类可以同属多个组。
 * <li>测试类上的Category注解不同覆盖当前类测试方法上的注解。
 * </ul>
 * 
 * @author JavaSking 2017年2月7日
 */
@RunWith(Suite.class)
@SuiteClasses({ CategoryAnnotationTest1.class, CategoryAnnotationTest2.class, CategoryAnnotationTest3.class, CategoryAnnotationTest4.class })
public class CategoryAnnotationTest {

}
