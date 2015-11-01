package com.hephec.string;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateFormatTest {

	@Test
	public void testParse() throws ParseException{
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Date date=new Date();
		String str="1990-10-10";
		Date date1=dateFormat.parse(str);
		System.out.println(date1);
	}
	@Test
	public void testSimpleDateFormat(){
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date=new Date();
		String str=dateFormat.format(date);
		System.out.println(str);
		
	}
	@Test
	public void test(){
		//把日期对象格式化为一个字符串还可以吧字符串转换为一个Date对象
		//该类是一个抽象类,应该创建其子类,或者其工厂方法加以创建
		//创建其子类对象
		//有的抽象类中提供了工厂方法来获取其实例
		Date date=new Date();
		DateFormat dft=new SimpleDateFormat();
		DateFormat dft1=DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(dft);
		String str=dft1.format(date);
		//找操作系统的的时区
		System.out.println(str);
	}
}
