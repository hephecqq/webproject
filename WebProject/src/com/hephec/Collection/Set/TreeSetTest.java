package com.hephec.Collection.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class TreeSetTest {

	//该排序可以定制
	@Test
	public void test(){
		
		
		Set set=new TreeSet();
		//set.add(null);
		//set.add(new Person());
		//会发生类型转换异常，空指针异常，和类型转换异常
		/**1.
		 * 如使用TreeSet()构造器无参数创建一个TreeSet对象这要求放入一个
		 * 元素的类必须实现Comparable接口
		 * 所以在其中不能放入null元素
		 * 2.
		 * 
		 * */
		//System.err.println(set.size());
//		set.add("aaab");
//		set.add("32");
		//必须放入同样类的对象.否则会发生类型转换异常
		set.add(new Student("aa",2523));
		set.add(new Student("aa",213));
		set.add(new Student("aa",2132));
		System.out.println(set.size());
		
		for (Object object : set) {
			System.out.println(object);
		}
		
		
		//定制排序和自然排序
		
		/**
		 * 1.自然排序：TreeSet会调用集合元素的
		 * compareTo(Object obj)方法来比较元素之间的大小关系
		 * 然后将集合元素升序排列
		 * 如果视图把一个对象添加到TreeSet时，则该对象的类必须实现
		 * Comparable接口
		 * 实现Comparable接口有一个compareTo(T o)方法实现
		 * 返回0，两个元素相等，否则返回负数当前元素小
		 *	默认按照升序排序
		 * String加以实现，unicode编码加以排序
		 *
		 * */
		
		
	}
	//定制排序，实现Comparator接口并实现compare(Object o1,Object o2)
	@Test
	public void test2(){
		@SuppressWarnings("unchecked")
		TreeSet<Student> set2=new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1 instanceof Student&&o1 instanceof Student){
					Student s1=o1;
					Student s2=o2;
					return s1.getGrade()-s2.getGrade();
				}else{
					throw new ClassCastException("不是一个Student对象");
				}
			}
		});
	}
}

