package com.cubic.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class NameUtilTest {

	NameUtil util = new NameUtil();

	@Test
	public void test() {
		String result = util.getFullName("Deepak", "Upadhyay");
		assertNotNull (result);
		assertEquals("Deepak,Upadhyay", result);
		
	}
	
	
	@Test
	public void FullNameEmptyLastName() {
		String result = util.getFullName("Deepak", null);
		assertNotNull (result);
		assertEquals("Deepak", result);
		
	}
	
	@Test
	public void FullNameEmptyFirstName() {
		String result = util.getFullName(null, "Upadhyay");
		assertNotNull (result);
		assertEquals(",Upadhyay", result);
		
	}
	

	@Test(expected =IllegalArgumentException.class)
	public void testGetFullNameInvalidData() {
		 util.getFullName(null, null);
		
	}
	

}
