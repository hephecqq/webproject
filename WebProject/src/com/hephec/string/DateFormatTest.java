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
		//�����ڶ����ʽ��Ϊһ���ַ��������԰��ַ���ת��Ϊһ��Date����
		//������һ��������,Ӧ�ô���������,�����乤���������Դ���
		//�������������
		//�еĳ��������ṩ�˹�����������ȡ��ʵ��
		Date date=new Date();
		DateFormat dft=new SimpleDateFormat();
		DateFormat dft1=DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(dft);
		String str=dft1.format(date);
		//�Ҳ���ϵͳ�ĵ�ʱ��
		System.out.println(str);
	}
}
