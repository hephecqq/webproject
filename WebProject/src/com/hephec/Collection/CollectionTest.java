package com.hephec.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class CollectionTest {

	@Test
	public void test(){
		//Java集合概述
		//Collection接口
		//Iterator接口
		//Set
		//List
		//Map
	}
	@Test
	public void testIntro(){
		//实际上装的引用
	}
	@Test
	public void testCollection(){
		//Collection接口是Set和List和Queue的父接口
		//1.创建一个Collection对象
		//只能使用到接口中的方法
		Collection<Person> collection=new ArrayList<Person>();
		//2.Collection重要方法说明：
		//添加元素
		collection.add(new Person());
		collection.add(new Person());
		System.out.println(collection.size());//求出集合的长度
		Collection<Person> collection2=new ArrayList<Person>();
		collection2.addAll(collection);
		System.out.println(collection2.size());
		/**
		 * 1.用于访问集合的方法
		 * size()：获取集合的长度
		 * 对集合遍历的方法：iterator()方法，该方法可以得到Iterator对象
		 * hasNext():是否有下个元素
		 * next();获取下个元素
		 * 
		 * 遍历的步骤：
		 * 1.获取Iterator接口对象
		 * 2.使用while循环和Iterator对的没有元素遍历集合中进行遍历
		 * 3.调用Iterator接口的hasNext()和next()方法
		 * 
		 * */
		//迭代器接口的使用
		Iterator<Person> it=collection.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Person p=new Person();
		collection.add(p);
		//移除集合中的方法
		/**
		 * remove()：移除一个元素
		 * removeAll()：移除一组元素
		 * clear()使当前集合为空
		 * */
		
		//通过equals方法来判断元素是否在集合中存在
		System.out.println(collection.remove(p));
		collection.removeAll(collection);
		collection.clear();
		System.out.println(collection.size());
		/**
		 * 用于检测集合中的元素
		 * contains():是否包含指定的元素
		 * containsAll():是否包含指定的一组元素
		 * isEmpty():
		 * */
		System.out.println(collection.contains(p));
		System.out.println(collection.containsAll(collection2));
		System.out.println(collection.contains(new Person()));
		
		
		/**
		 * 其他方法
		 * toArray:返回集合的数组对象
		 * toArray(T[] a):
		 * 
		 * */
		collection.add(new Person());
		collection.add(new Person());
		collection.add(new Person());
		collection.add(new Person());
		collection.add(new Person());
		Object[] objs=collection.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs.toString());
		}
		System.out.println(collection.size());
		/**
		 * equals（）
		 * hashCode()方法
		 * 
		 * */
		//先长度然后在比较元素
		
	}
	
}



class Person{
//	@Override
//	public boolean equals(Object obj) {
//		return false;
//	}
}
