package com.hephec.string;

import org.junit.Test;

public class StringBuilderTest {

	@Test
	public void testAppend(){
		//��������ʵ�ַ�������׺
		//ע�⣺append()�����ķ���ֵ���ǵ�ǰ��StringBuffer����
		//append�������ַ������뵽�Ѿ����ַ����к���
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
		//�ɱ���ַ�����
		//StringBuffer�̰߳�ȫ
		//StringBuilder�̲߳���ȫ
		//StringBuilder��StringBuffer�ǿ��Ա��޸ĵ��ַ�����
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
