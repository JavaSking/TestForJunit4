package org.junit.rules;

import org.junit.Rule;
import org.junit.Test;

public class ExternalResourceRuleTest {
	
	

	@Rule
	public ExternalResource resource = new ExternalResource() {

		protected void before() throws Throwable {

		}

		protected void after() {

		}
	};
	
	@Test
	public void testExternalResource() {
		
	}

}
