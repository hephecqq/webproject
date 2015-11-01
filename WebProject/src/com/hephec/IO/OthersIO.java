package com.hephec.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Test;

public class OthersIO {

	@Test
	public void test() throws IOException{
		//字节数组流
		//数据源是字节数组，服务器的内存
		/**
		 * 字节数组
		 * 1.输入流
		 * 2.输出流
		 * 文件内容不要太大
		 * 字节数组输出到文件中
		 * 文件->程序-字节数组
		 * 字节数组-程序
		 * */
		
		String str="何鹏";
		//读取字节数组
	
		
		byte[] buf=new byte[1024];
		
		//创建一个ByteArrayInputStream，使用buf作为其缓存区数组
		ByteArrayInputStream bais=new ByteArrayInputStream(str.getBytes());
		int pos=0;
		while((pos=bais.read(buf))>0){
			System.out.println(new String(buf));
		}
		//关闭该流无效，内存自动释放
		
		//输出流
		//输出到字节数组中，不用使用多态
		//与文件操作有所不同
		//目的地
		byte[] buffer=null;
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		//
		byte[] test="四川文理学院".getBytes();
		baos.write(test,0,test.length);
		buffer=baos.toByteArray();
		baos.close();
		System.out.println(new String(buffer));
	}
}
