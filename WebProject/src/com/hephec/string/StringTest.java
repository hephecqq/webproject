package com.hephec.string;

import org.junit.Test;

public class StringTest {
	@Test
	public void testTransform(){
		String str="acgaagadftegah";
		for (int i = 0; i <str.length(); i++) {
			char ch=str.charAt(i);
			
			if(ch>'a'&&ch<'z'){
				
				ch=(char) (ch+1);
			}else if(ch>'A'&&ch<'Z'){
				ch=(char) (ch+1);
			}
			System.out.println(ch);
		}
	}
	@Test
	public void testEquals(){
		//�Ƚ��ַ��������Ƿ���ȱ���ʹ��equals����
		
	}
	@Test
	public void testSplit(){
		//String���split����
		String str="a-b-b-c-d";
		String[] values=str.split("-");
		for (String string : values) {
			System.out.println(string);
		}
				
	}
	@Test
	public void testCharAt(){
		//chatAt()��ĳ�������ַ�
		System.out.println("str".charAt(1));
	}
	@Test
	public void testLastIndexOf(){
		System.out.println("test".lastIndexOf('t'));
	}
	
	//�ַ��������:ֱ��ͨ��=Ϊ�ַ�����ֵ,��Ѷ�Ӧ���ַ������뵽�ַ����������
	//�����ڻ���ز����Ƿ���һ�����ַ���������оͰ����ø����ַ�������
	//û�еĻ��ᴴ��һ���µ��ַ�������������뻺�����
	//3.�ַ����ĳ��÷���.1ȥ��ǰ��ո��trim()����
	
	@Test
	public void testTrim(){
		String str=" xxx  ";
		System.out.println(str);
		String st=str.trim();
		System.out.println(st);
		//ȥ�м�ո�ʹ��������ʽ
		//���Ӵ��ķ���substring()
	}
	@Test
	public void testSubstring(){
		String str="http://www.atguigu.com/index.jsp?name=tom";
		String strs=str.substring(str.indexOf('?')+1);
		System.out.println(strs);
		//substring(beginIndex);
		//substring(beginIndex,toIndex);length=toIndex-beginIndex
		System.out.println(str.substring(0, 2));
		//��fromInde��ʼ,����fromIndex��String���ַ�������0��ʼ
		
	}
	
	@Test
	public void testNewString(){
		String str1="hello world";
		String str2="hello world";
		System.out.println(str1==str2);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		String str3=new String("abcd");
		String str4=new String("abcd");
		System.out.println(str3==str4);
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
	}
	public void changePerson(Person p){
		p.setAge(10);
	}
	public void changeString(String str){
		str.replace('a', 'b');
	}
	@Test
	public void testPassRef(){
		Person p=new Person("ab",2);
		changePerson(p);
		System.out.println(p);
		
	}
	@Test
	public void testPassStr(){
		String str="hephec";
		changeString(str);
		System.out.println(str);
	}
	@Test
	public void test(){
		//String�ǲ��ɱ���ַ�����
		String str="hephec";
		String str1=str.replace('c', 'm');
		System.out.println(str);
		System.out.println(str1);
		str=str.replace('c','p');
		System.out.println(str);
	}
}
