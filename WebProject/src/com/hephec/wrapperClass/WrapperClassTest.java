package com.hephec.wrapperClass;

import org.junit.Test;

public class WrapperClassTest {

	@Test
	public void test(){
		Integer i=new Integer(10);
		System.out.println(i);
	}
	@Test
	public void testHex(){
		Integer i=new Integer(10);
		int test=Integer.decode("0xf");
		
		System.out.println(test);
	}
	@Test
	public void testNumber(){
		Number number=new Integer("10");
		
	}
}
