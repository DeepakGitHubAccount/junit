package com.cubic.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.cubic.test.FunctOne;
import com.cubic.test.FunctTwo;

public class MathUtilTest {
	
	MathUtil util = new MathUtil();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Category({FunctOne.class})

	@Test
	public void testAdd() {
		int result = util.add(2,3);
		assertEquals(5,result );
	}
	@Category({FunctOne.class,FunctTwo.class})
	@Test
	public void testMultiply() {
		int result = util.mul(2,3);
		assertEquals(6,result );
	}
	
	/*@Test
	public void testDivByZero() {
		int result = util.div(10, 0);
		assertEquals(10,result);;
	}
	*/
	@Category({FunctOne.class})
	@Test(expected=ArithmeticException.class)
	public void testDivByZero() {
		 util.div(10, 0);
		
	}
	
	
	
	
	

}
