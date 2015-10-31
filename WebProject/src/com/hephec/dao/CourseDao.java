package com.hephec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.hephec.model.Course;

public class CourseDao {

	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	Course course=null;
	List<Course> list=new LinkedList<Course>();
	
	public List<Course> getAll(){
		try {
			conn=JDBCTool.getConnection();
			String sql="select id,name,type from course";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				course=new Course();
				course.setId(rs.getInt(1));
				course.setName(rs.getString(2));
				course.setType(rs.getString(3));
				list.add(course);
			}
			
		} catch (Exception e) {
			
		}finally{
			JDBCTool.release(rs, ps, conn);
		}
		
		return list;
	}
	
	public int delete(Integer id){
		try {
			conn=JDBCTool.getConnection();
			String sql="delete from course where id=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			int count=ps.executeUpdate();
			if(count>0){
				return count;
			}
			
		} catch (Exception e) {
			
		}finally{
			JDBCTool.release(rs, ps, conn);
		}
		return new Integer(-1);
		
	}
	public int add(Course course){
		try {
			conn=JDBCTool.getConnection();
			String sql="insert into course(id,name,type) values(?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, course.getId());
			ps.setString(2, course.getName());
			ps.setString(3, course.getType());
			int count=ps.executeUpdate();
			if(count>0){
				return count;
			}
			
		} catch (Exception e) {
			
		}finally{
			JDBCTool.release(rs, ps, conn);
		}
		return new Integer(-1);
		
	}
}
