package com.hephec.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

public class ListTest {
	/**
	 * 常用的方法：
	 * 1.add(int index,Object ele)
	 * 2.Object get(int index)
	 * 3.int indexOf(Object obj)
	 * 4.Object set(int index,Object ele)
	 * 5.List subList(int fromIndex,int toIndex)
	 * 判断元素是否在集合中依据是equals()方法
	 * int lastIndexOf(Object obj)
	 * Object remove(int index)
	 * */
	
	
	//靠顺序索引维护顺序
	@Test
	public void test(){
		//ArrayList和Vector
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
		//使用for循环的方式对list进行遍历,使用List的get(index)进行遍历
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//使用ListIterator进行遍历
		ListIterator<Person> listIt=list.listIterator();
		while(listIt.hasNext()){
			System.out.println(listIt.next());
		}
	}
}
