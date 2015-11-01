package com.hephec.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MapTest {
	
	@Test
	public void test(){
		
		//1.向Map中添加元素put(key,value),put(map)
		Map<String,Integer> hashMap=new HashMap();
		hashMap.put("aa", 11);
		hashMap.put("ab", 13);
		hashMap.put("ac", 14);
		
		//2.从Map中取出元素
		//1.得到键的集合
		Set keySet=hashMap.keySet();
		//通过遍历键的方式找到值
		for (Object object : keySet) {
			System.out.println(hashMap.get(object));
		}
		//2.直接得到值的集合
		Collection values=hashMap.values();
		for (Object object : values) {
			System.out.println(object);
		}
		//得到键值对的集合,在泛型的基础上使用
		for(Map.Entry<String, Integer> entry: hashMap.entrySet())
		{
			String key=entry.getKey();
			Object value=entry.getValue();
		}
		
		//3.移除元素
		int i=hashMap.remove("aa");
		System.out.println(i);
		System.out.println("--");
		//4.检查方法
		System.out.println(hashMap.size());
		
		//HashMap和HashSet的关系
		
		
		
		
		//key不能重复,值可以重复
		//HashMap
		
		//key-value可以是任何引用类型
		//key-value具有单向一对一关系
		
		
	}
}
