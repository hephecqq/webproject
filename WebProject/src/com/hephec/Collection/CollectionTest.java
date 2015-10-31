package com.hephec.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class CollectionTest {

	@Test
	public void test(){
		//Java���ϸ���
		//Collection�ӿ�
		//Iterator�ӿ�
		//Set
		//List
		//Map
	}
	@Test
	public void testIntro(){
		//ʵ����װ������
	}
	@Test
	public void testCollection(){
		//Collection�ӿ���Set��List��Queue�ĸ��ӿ�
		//1.����һ��Collection����
		//ֻ��ʹ�õ��ӿ��еķ���
		Collection<Person> collection=new ArrayList<Person>();
		//2.Collection��Ҫ����˵����
		//���Ԫ��
		collection.add(new Person());
		collection.add(new Person());
		System.out.println(collection.size());//������ϵĳ���
		Collection<Person> collection2=new ArrayList<Person>();
		collection2.addAll(collection);
		System.out.println(collection2.size());
		/**
		 * 1.���ڷ��ʼ��ϵķ���
		 * size()����ȡ���ϵĳ���
		 * �Լ��ϱ����ķ�����iterator()�������÷������Եõ�Iterator����
		 * hasNext():�Ƿ����¸�Ԫ��
		 * next();��ȡ�¸�Ԫ��
		 * 
		 * �����Ĳ��裺
		 * 1.��ȡIterator�ӿڶ���
		 * 2.ʹ��whileѭ����Iterator�Ե�û��Ԫ�ر��������н��б���
		 * 3.����Iterator�ӿڵ�hasNext()��next()����
		 * 
		 * */
		//�������ӿڵ�ʹ��
		Iterator<Person> it=collection.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Person p=new Person();
		collection.add(p);
		//�Ƴ������еķ���
		/**
		 * remove()���Ƴ�һ��Ԫ��
		 * removeAll()���Ƴ�һ��Ԫ��
		 * clear()ʹ��ǰ����Ϊ��
		 * */
		
		//ͨ��equals�������ж�Ԫ���Ƿ��ڼ����д���
		System.out.println(collection.remove(p));
		collection.removeAll(collection);
		collection.clear();
		System.out.println(collection.size());
		/**
		 * ���ڼ�⼯���е�Ԫ��
		 * contains():�Ƿ����ָ����Ԫ��
		 * containsAll():�Ƿ����ָ����һ��Ԫ��
		 * isEmpty():
		 * */
		System.out.println(collection.contains(p));
		System.out.println(collection.containsAll(collection2));
		System.out.println(collection.contains(new Person()));
		
		
		/**
		 * ��������
		 * toArray:���ؼ��ϵ��������
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
		 * equals����
		 * hashCode()����
		 * 
		 * */
		//�ȳ���Ȼ���ڱȽ�Ԫ��
		
	}
	
}



class Person{
//	@Override
//	public boolean equals(Object obj) {
//		return false;
//	}
}
