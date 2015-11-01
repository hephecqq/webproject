package com.hephec.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

public class ListTest {
	/**
	 * ���õķ�����
	 * 1.add(int index,Object ele)
	 * 2.Object get(int index)
	 * 3.int indexOf(Object obj)
	 * 4.Object set(int index,Object ele)
	 * 5.List subList(int fromIndex,int toIndex)
	 * �ж�Ԫ���Ƿ��ڼ�����������equals()����
	 * int lastIndexOf(Object obj)
	 * Object remove(int index)
	 * */
	
	
	//��˳������ά��˳��
	@Test
	public void test(){
		//ArrayList��Vector
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("aa",23));
		list.add(new Person("aa",24));
		list.add(new Person("aa",25));
		list.add(2,new Person("av", 2));
		list=list.subList(2, 4);
		System.out.println(list.size());
		for (Object object : list) {
			System.out.println(object);
		}
		Iterator<Person> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//ʹ��forѭ���ķ�ʽ��list���б���,ʹ��List��get(index)���б���
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//ʹ��ListIterator���б���
		ListIterator<Person> listIt=list.listIterator();
		while(listIt.hasNext()){
			System.out.println(listIt.next());
		}
	}
}
