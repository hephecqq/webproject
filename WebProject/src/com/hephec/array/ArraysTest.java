package com.hephec.array;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArraysTest {

	@Test
	public void testSystem(){
		Object src = null;
		int srcPos = 0;
		Object dest = null;
		int destPos = 0;
		int length = 0;
		//数组的拷贝、排序、二分法、命令行参数以及增强for循环
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(src, srcPos, dest, destPos, length);
	}
	@Test
	public void testArrays(){
		//java.util.Arrays
		//包含操作数组的各种方法
		//asList()
	}
	@Test
	public void testAsList(){
		List<String> list=Arrays.asList("a","b");
		System.out.println(list);
	}
	@Test
	public void testSort(){
		String[] a={"ac","bb","fa","d12","df"};
		Arrays.sort(a);
		System.out.println(Arrays.asList(a));
		
	}
	@Test
	public void testBinarySort(){
		String[] a={"ac","bb","fa","d12","df"};
		System.out.println(Arrays.binarySearch(a, "ac"));
		
	}
	@Test
	public void testToString(){
		String[] a={"ac","bb","fa","d12","df"};
		System.out.println(Arrays.toString(a));
	}
	@Test
	public void testArrayFill(){
		//Arrays.fill(a, fromIndex, toIndex, val);
		String[] a={"ac","bb","fa","d12","df"};
		Arrays.fill(a, 0, 3, "aa");
		System.out.println(Arrays.toString(a));
	}
}
