package com.hephec.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.junit.Test;

import com.hephec.model.Course;

public class DBUtils {

	
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		Course course=null;
		Course[] courses=new Course[100];
		
	/**
	 * API���
	 * 
	 * */
	@Test
	public void testQueryRunnerUpdate(){
		
		//����QueryRunner���update����
		//1.����Query��ʵ����
		QueryRunner queryRunner=new QueryRunner();
		String sql="insert into course(id,name) values(?,?)";
		try {
			conn=JDBCTool.getConnection();
			//ʹ����update����,�÷���������insert,update,delete�Ȳ���
			int count=queryRunner.update(conn, sql, 12,"����");
			System.out.println(count);
		} catch (Exception e) {
			JDBCTool.rollback(conn);
		}finally{
			//�ر�����
			JDBCTool.release(rs, stmt, conn);
		}
		
		
	//2.ʹ����update����
		
	}
	
	@Test
	public void testBeanQuery(){
		
		//1.����Query��ʵ����
		QueryRunner queryRunner=new QueryRunner();
		String sql="select id,name from course";
		try {
			
			conn=JDBCTool.getConnection();
			course=(Course) queryRunner.query(conn, sql, new BeanHandler(Course.class));
			
			} catch (Exception e) {
			//JDBCTool.rollback(conn);
		}finally{
			System.out.println(course);
			//�ر�����
			JDBCTool.release(rs, stmt, conn);
		}
		
		
	}
	Map<String, Object> courseMap=null;
	@Test
	public void testMapQuery(){
		
		//1.MapHandler������SQL��Ӧ�ĵ�һ����¼��Ӧ��Map����
		//2.key:SQL��ѯ������ ֵSQL��ѯ��������ֵ
		
		QueryRunner queryRunner=new QueryRunner();
		String sql="select id,name from course";
		try {
			
			conn=JDBCTool.getConnection();
			courseMap= queryRunner.query(conn, sql, new MapHandler());
			
			} catch (Exception e) {
			//JDBCTool.rollback(conn);
		}finally{
			for (Entry<String, Object> map : courseMap.entrySet()) {
				System.out.println(map.getKey());
				System.out.println(map.getValue());
			}
			//�ر�����
			JDBCTool.release(rs, stmt, conn);
		}
		
		
	}
	
	
	
}
