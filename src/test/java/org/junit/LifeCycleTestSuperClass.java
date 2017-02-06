package org.junit;

/**
 * Junit生命周期测试：超类。<br>
 * 
 * @author JavaSking 2017年2月6日
 */
public class LifeCycleTestSuperClass {
	
	public LifeCycleTestSuperClass() {
		
		super();
		System.out.println("<<LifeCycleTestSuperClass Constructor>>");
	}
	
	@BeforeClass
	public static void beforeClassMethodSuperClass() {

		System.out.println("<<SuperClass Before Class Method>>");
	}
	
	@BeforeClass
	public static void beforeClassMethodCommon() {
		
		System.out.println("<<Common Before Class Method In SuperClass>>");
	}
	
	@Before
	public void beforeMethodSuperClass() {

		System.out.println("<<SuperClass Before Method>>");
	}
	
	@Before
	public void beforeMethodCommon() {

		System.out.println("<<Common Before Method In SuperClass>>");
	}

	@AfterClass
	public static void afterClassMethodSuperClass() {

		System.out.println("<<SuperClass After Class Method>>");
	}
	
	@AfterClass
	public static void afterClassMethodCommon() {

		System.out.println("<<Common After Class Method In SuperClass>>");
	}

	@After
	public void afterMethodSuperClass() {

		System.out.println("<<SuperClass After Method>>");
	}
	
	@After
	public void afterMethodCommon() {

		System.out.println("<<Common After Method In SuperClass>>");
	}

	@Test
	public void testMethodSuperClass() {

		System.out.println("<<SuperClass Test Method>>");
	}

	@Test
	public void testMethodCommon() {

		System.out.println("<<Common Test Method In SuperClass>>");
	}
}
