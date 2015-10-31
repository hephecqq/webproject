package com.hephec.Collection.Set;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SetTest {

	
	@Test
	public void test(){
		Set set=new HashSet();
		set.add(null);
		System.out.println(set.size());
		
		set.add(new Person("aa",121));
		set.add(new Person("aa",121));
		set.add(new Person("aa",121));
		System.out.println(set.size());
		
		
		
		/**
		 * Set是Collection的子接口
		 * Set集合不允许有相同的元素，
		 * 判断相同元素的标签是两个对象各自调用equals()方法的比较
		 * 然后true则说明相等，否则不相等
		 * 
		 * */
		/**
		 * HashSet的基本特点：
		 * 1.HashSet是Set接口的典型实现，多数时候使用Set和使用这个实现类
		 * 2.HashSet使用hash算法实现
		 * 3.不能保证元素的顺序
		 * 4.不是线程安全的
		 * 5.集合元素可以使用null元素
		 * 
		 * */
		
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
