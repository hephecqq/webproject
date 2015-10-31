package com.hephec.Collection.Set;

import org.junit.Test;

public class TreeSetTest {

	//该排序可以定制
	@Test
	public void test(){
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
}
