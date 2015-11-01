package com.hephec.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MapTest {
	
	@Test
	public void test(){
		
		//1.��Map�����Ԫ��put(key,value),put(map)
		Map<String,Integer> hashMap=new HashMap();
		hashMap.put("aa", 11);
		hashMap.put("ab", 13);
		hashMap.put("ac", 14);
		
		//2.��Map��ȡ��Ԫ��
		//1.�õ����ļ���
		Set keySet=hashMap.keySet();
		//ͨ���������ķ�ʽ�ҵ�ֵ
		for (Object object : keySet) {
			System.out.println(hashMap.get(object));
		}
		//2.ֱ�ӵõ�ֵ�ļ���
		Collection values=hashMap.values();
		for (Object object : values) {
			System.out.println(object);
		}
		//�õ���ֵ�Եļ���,�ڷ��͵Ļ�����ʹ��
		for(Map.Entry<String, Integer> entry: hashMap.entrySet())
		{
			String key=entry.getKey();
			Object value=entry.getValue();
		}
		
		//3.�Ƴ�Ԫ��
		int i=hashMap.remove("aa");
		System.out.println(i);
		System.out.println("--");
		//4.��鷽��
		System.out.println(hashMap.size());
		
		//HashMap��HashSet�Ĺ�ϵ
		
		
		
		
		//key�����ظ�,ֵ�����ظ�
		//HashMap
		
		//key-value�������κ���������
		//key-value���е���һ��һ��ϵ
		
		
	}
}
