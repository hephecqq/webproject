package com.hephec.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hephec.dao.CourseDao;

/**
 * Servlet implementation class ListAllStudent
 */
@WebServlet("/listAllStudent")
public class ListAllStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CourseDao courseDao=new CourseDao();
	List<Course> list=courseDao.getAll();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("students", list);
		request.getRequestDispatcher("/students.jsp").forward(request, response);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
