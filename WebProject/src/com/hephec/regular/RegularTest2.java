package com.hephec.regular;

import org.junit.Test;

public class RegularTest2 {

	@Test
	public void test(){
		//自定义字符集合用法（量词、贪婪和非贪婪模式）
		//正则表达式的特殊符号，被包含到中括号中，则失去了意义，除了^和-之外
		//标准字符集合，除小数点外，如果被包含与中括号，自定义字符集合将包含该集合
		//[\d.\-+]将匹配数组，小数点,+、
		
		
	}
	@Test
	public void testQuantifier(){
		//量词\d\d\d\d\d
		//\d[6]
		//\d{3,6}
		//\d{3，}至少3次
		//贪婪模式
		//非贪婪模式？
		//?(0或者1),+(至少1次) *({0,})
		
	}
}
