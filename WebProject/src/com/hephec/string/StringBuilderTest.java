package com.hephec.string;

import org.junit.Test;

public class StringBuilderTest {

	@Test
	public void testAppend(){
		//这样可以实现方法的连缀
		//注意：append()方法的返回值还是当前的StringBuffer对象
		//append方法把字符串加入到已经有字符序列后面
		StringBuilder sb=new StringBuilder("abc");
		sb.append("cc");
		sb.append("cc1");
		System.out.println(sb);
		sb.append("<html>");
		
		sb.append("</html>");
		System.out.println(sb);
		
	}
	@Test
	public void test(){
		//可变的字符序列
		//StringBuffer线程安全
		//StringBuilder线程不安全
		//StringBuilder和StringBuffer是可以被修改的字符序列
	}
	@Test
	public void testStringBuilder(){
		StringBuilder sb=new StringBuilder("abc");
		sb.replace(1, 3, "map");
		System.out.println(sb);
	}
	@Test
	public void testStringBuffer(){
		StringBuffer sb=new StringBuffer("abc");
		sb.replace(1, 3, "map");
		System.out.println(sb);
	}
}
