package com.hephec.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Test;

public class OthersIO {

	@Test
	public void test() throws IOException{
		//�ֽ�������
		//����Դ���ֽ����飬���������ڴ�
		/**
		 * �ֽ�����
		 * 1.������
		 * 2.�����
		 * �ļ����ݲ�Ҫ̫��
		 * �ֽ�����������ļ���
		 * �ļ�->����-�ֽ�����
		 * �ֽ�����-����
		 * */
		
		String str="����";
		//��ȡ�ֽ�����
	
		
		byte[] buf=new byte[1024];
		
		//����һ��ByteArrayInputStream��ʹ��buf��Ϊ�仺��������
		ByteArrayInputStream bais=new ByteArrayInputStream(str.getBytes());
		int pos=0;
		while((pos=bais.read(buf))>0){
			System.out.println(new String(buf));
		}
		//�رո�����Ч���ڴ��Զ��ͷ�
		
		//�����
		//������ֽ������У�����ʹ�ö�̬
		//���ļ�����������ͬ
		//Ŀ�ĵ�
		byte[] buffer=null;
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		//
		byte[] test="�Ĵ�����ѧԺ".getBytes();
		baos.write(test,0,test.length);
		buffer=baos.toByteArray();
		baos.close();
		System.out.println(new String(buffer));
	}
}
