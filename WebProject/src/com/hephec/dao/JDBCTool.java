package com.hephec.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Statement;

/**
 * 
 * ����JDBC�Ĺ����࣬���з�װ��һЩ���߷���
 * �汾1
 * 1.��ȡ���ݿ����ӷ���
 * 	��ȡ�����ļ������ݿ��������ȡһ������
 * 2.
 * 
 * 
 * */
public class JDBCTool {
	//�������ݿ�����
	//�ύ����
	public static void commit(Connection conn){
		if(conn!=null){
			try {
				conn.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//�ع�����
	public static void rollback(Connection conn){
		if(conn!=null){
			try {
				conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//��������
	public static void beignTx(Connection conn){
		if(conn!=null){
			try {
				conn.setAutoCommit(false);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Connection conn=getConnection();
		System.out.println(conn);
	}
	public static void release(ResultSet rs,Statement stmt,Connection conn){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		try {
			if(stmt!=null)
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(conn!=null)
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection conn = null;
		
		//1.׼���������ݿ���ĸ��ַ���
				//1����Properties����
				Properties prop=new Properties();
				InputStream in=JDBCTool.class.getClassLoader().getResourceAsStream("info.properties");
				try {
					prop.load(in);
				} catch (IOException e) {
					e.printStackTrace();
				}
				String password=prop.getProperty("password");
				String url=prop.getProperty("jdbcUrl");
				String driver=prop.getProperty("driver");
				String user=prop.getProperty("user");
				try {
					Class.forName(driver);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String encoding="useUnicode=true&characterEncoding=UTF-8";
				try {
					conn=DriverManager.getConnection(url+"?"+encoding,user,password);
				} catch (SQLException e) {
				}
				return conn;
	}
}
