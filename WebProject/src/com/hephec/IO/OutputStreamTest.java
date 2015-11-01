package com.hephec.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.junit.Test;

public class OutputStreamTest {

	@Test
	public void test() throws IOException{
		OutputStream out=new FileOutputStream("test.jsp");
		//把文件写出去
		String content="www.baidu.com";
		String  st="hello java";
		byte[] buffer=st.getBytes();
		
		out.write(content.getBytes());
		out.write(buffer);
		out.close();
		
	}
}
