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
		//比较字符串内容是否相等必须使用equals方法
		
	}
	@Test
	public void testSplit(){
		//String类的split方法
		String str="a-b-b-c-d";
		String[] values=str.split("-");
		for (String string : values) {
			System.out.println(string);
		}
				
	}
	@Test
	public void testCharAt(){
		//chatAt()求某个索引字符
		System.out.println("str".charAt(1));
	}
	@Test
	public void testLastIndexOf(){
		System.out.println("test".lastIndexOf('t'));
	}
	
	//字符串缓冲池:直接通过=为字符串赋值,会把对应的字符串放入到字符串缓存池中
	//会现在缓冲池查找是否有一样的字符串，如果有就把引用赋给字符串变量
	//没有的话会创建一个新的字符串并把这个放入缓冲池中
	//3.字符串的常用方法.1去除前后空格的trim()方法
	
	@Test
	public void testTrim(){
		String str=" xxx  ";
		System.out.println(str);
		String st=str.trim();
		System.out.println(st);
		//去中间空格使用正则表达式
		//求子串的方法substring()
	}
	@Test
	public void testSubstring(){
		String str="http://www.atguigu.com/index.jsp?name=tom";
		String strs=str.substring(str.indexOf('?')+1);
		System.out.println(strs);
		//substring(beginIndex);
		//substring(beginIndex,toIndex);length=toIndex-beginIndex
		System.out.println(str.substring(0, 2));
		//从fromInde开始,包含fromIndex且String的字符索引从0开始
		
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
		//String是不可变的字符序列
		String str="hephec";
		String str1=str.replace('c', 'm');
		System.out.println(str);
		System.out.println(str1);
		str=str.replace('c','p');
		System.out.println(str);
	}
}
