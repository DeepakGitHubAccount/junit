package com.cubic.test;

import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.cubic.util.MathUtilTest;
import com.cubic.util.NameUtilTest;

@RunWith(Suite.class)
@IncludeCategory(FunctOne.class)
@Suite.SuiteClasses({MathUtilTest.class,NameUtilTest.class})

public class FunctionOneTests {

}
