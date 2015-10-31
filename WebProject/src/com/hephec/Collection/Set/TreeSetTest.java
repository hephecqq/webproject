package com.hephec.Collection.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class TreeSetTest {

	//��������Զ���
	@Test
	public void test(){
		
		
		Set set=new TreeSet();
		//set.add(null);
		//set.add(new Person());
		//�ᷢ������ת���쳣����ָ���쳣��������ת���쳣
		/**1.
		 * ��ʹ��TreeSet()�������޲�������һ��TreeSet������Ҫ�����һ��
		 * Ԫ�ص������ʵ��Comparable�ӿ�
		 * ���������в��ܷ���nullԪ��
		 * 2.
		 * 
		 * */
		//System.err.println(set.size());
//		set.add("aaab");
//		set.add("32");
		//�������ͬ����Ķ���.����ᷢ������ת���쳣
		set.add(new Student("aa",2523));
		set.add(new Student("aa",213));
		set.add(new Student("aa",2132));
		System.out.println(set.size());
		
		for (Object object : set) {
			System.out.println(object);
		}
		
		
		//�����������Ȼ����
		
		/**
		 * 1.��Ȼ����TreeSet����ü���Ԫ�ص�
		 * compareTo(Object obj)�������Ƚ�Ԫ��֮��Ĵ�С��ϵ
		 * Ȼ�󽫼���Ԫ����������
		 * �����ͼ��һ��������ӵ�TreeSetʱ����ö���������ʵ��
		 * Comparable�ӿ�
		 * ʵ��Comparable�ӿ���һ��compareTo(T o)����ʵ��
		 * ����0������Ԫ����ȣ����򷵻ظ�����ǰԪ��С
		 *	Ĭ�ϰ�����������
		 * String����ʵ�֣�unicode�����������
		 *
		 * */
		
		
	}
	//��������ʵ��Comparator�ӿڲ�ʵ��compare(Object o1,Object o2)
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
					throw new ClassCastException("����һ��Student����");
				}
			}
		});
	}
}

