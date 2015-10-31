package com.hephec.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

public class SetTest {

	
	/**
	 * equals��hashCodeӦ��һ��
	 * ��дhashCodeԭ��
	 * 
	 * */
	@Test
	public void test(){
		Set set=new HashSet();
		set.add(null);
		System.out.println(set.size());
		
		set.add(new Person("aa",121));
		set.add(new Person("aa",122));
		set.add(new Person("aa",1222));
		set.add(new Person("aa",123123));
		set.add(new Person("aa",12423));
		System.out.println(set.size());
		
		for (Object object : set) {
			System.out.println(object);
		}
		
		Iterator it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		/**
		 * Set��Collection���ӽӿ�
		 * Set���ϲ���������ͬ��Ԫ�أ�
		 * �ж���ͬԪ�صı�ǩ������������Ե���equals()�����ıȽ�
		 * Ȼ��true��˵����ȣ��������
		 * 
		 * */
		/**
		 * HashSet�Ļ����ص㣺
		 * 1.HashSet��Set�ӿڵĵ���ʵ�֣�����ʱ��ʹ��Set��ʹ�����ʵ����
		 * 2.HashSetʹ��hash�㷨ʵ��
		 * 3.���ܱ�֤Ԫ�ص�˳��
		 * 4.�����̰߳�ȫ��
		 * 5.����Ԫ�ؿ���ʹ��nullԪ��
		 * 6.����HashSet��������ͨ��equals()��������true
		 * ���������hashCode�����
		 * LinkedHashSet��HashSet������
		 * ����Ԫ�ص�hashCodeֵ������Ԫ�صĴ洢λ�ã�������ͬʱʹ��
		 * ����β��Ԫ�صĴ���ʹ��Ԫ�ؿ���������
		 * ���ܵ���HashSet�����ڵ�����������Set���Ԫ��ʱ�кܺõ�����
		 * ��LinkedhashSet��������Ԫ���ظ�
		 * */
		LinkedHashSet linkedHashSet=new LinkedHashSet();
		linkedHashSet.add("aa");
		linkedHashSet.add("bb");
		linkedHashSet.add("cc");
		linkedHashSet.add("aa2");
		linkedHashSet.add("b2b");
		linkedHashSet.add("c2c");
		for (Object object : linkedHashSet) {
			System.out.println(object);
		}
		
	}
}
class Person{
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
