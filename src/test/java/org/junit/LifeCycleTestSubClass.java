package org.junit;

/**
 * Junit生命周期测试。<br>
 * 测试BeforeClass、Before、AfterClass、After注解。
 * 
 * @author JavaSking 2017年2月6日
 */
public class LifeCycleTestSubClass extends LifeCycleTestSuperClass{

	public LifeCycleTestSubClass() {

		super();
		System.out.println("<<LifeCycleTestSubClass Constructor>>");
	}

	@BeforeClass
	public static void beforeClassMethodCommon() {
		
		System.out.println("<<Common Before Class Method In SubClass>>");
	}
	
	@BeforeClass
	public static void beforeClassMethodSubClass() {

		System.out.println("<<SubClass Before Class Method>>");
	}
	
	@Before
	public void beforeMethodSubClass() {

		System.out.println("<<SubClass Before Method>>");
	}
	
	@Override
	@Before
	public void beforeMethodCommon() {

		System.out.println("<<Common Before Method In SubClass>>");
	}
	
	@AfterClass
	public static void afterClassMethodSubClass() {

		System.out.println("<<SubClass After Class Method>>");
	}
	
	@AfterClass
	public static void afterClassMethodCommon() {

		System.out.println("<<Common After Class Method In SubClass>>");
	}

	@After
	public void afterMethodSubClass() {

		System.out.println("<<SubClass After Method>>");
	}
	
	@Override
	@After
	public void afterMethodCommon() {

		System.out.println("<<Common After Method In SubClass>>");
	}
	
	@Test
	public void testMethodSubClass() {

		System.out.println("<<SubClass Test Method>>");
	}

	@Override
	@Test
	public void testMethodCommon() {

		System.out.println("<<Common Test Method In SubClass>>");
	}
}
