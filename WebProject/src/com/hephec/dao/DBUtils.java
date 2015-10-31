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
	 * API简介
	 * 
	 * */
	@Test
	public void testQueryRunnerUpdate(){
		
		//测试QueryRunner类的update方法
		//1.创建Query的实现类
		QueryRunner queryRunner=new QueryRunner();
		String sql="insert into course(id,name) values(?,?)";
		try {
			conn=JDBCTool.getConnection();
			//使用期update方法,该方法可用于insert,update,delete等操作
			int count=queryRunner.update(conn, sql, 12,"张三");
			System.out.println(count);
		} catch (Exception e) {
			JDBCTool.rollback(conn);
		}finally{
			//关闭连接
			JDBCTool.release(rs, stmt, conn);
		}
		
		
	//2.使用其update方法
		
	}
	
	@Test
	public void testBeanQuery(){
		
		//1.创建Query的实现类
		QueryRunner queryRunner=new QueryRunner();
		String sql="select id,name from course";
		try {
			
			conn=JDBCTool.getConnection();
			course=(Course) queryRunner.query(conn, sql, new BeanHandler(Course.class));
			
			} catch (Exception e) {
			//JDBCTool.rollback(conn);
		}finally{
			System.out.println(course);
			//关闭连接
			JDBCTool.release(rs, stmt, conn);
		}
		
		
	}
	Map<String, Object> courseMap=null;
	@Test
	public void testMapQuery(){
		
		//1.MapHandler：返回SQL对应的第一条记录对应的Map对象
		//2.key:SQL查询的列名 值SQL查询的列名的值
		
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
			//关闭连接
			JDBCTool.release(rs, stmt, conn);
		}
		
		
	}
	
	
	
}
