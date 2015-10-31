package com.hephec.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hephec.dao.CourseDao;
import com.hephec.model.Course;

@WebServlet("/listAllStudent")
public class ListAllStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CourseDao courseDao=new CourseDao();
	List<Course> list=courseDao.getAll();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("students", list);
		request.getRequestDispatcher("/students.jsp").forward(request, response);
		String delete=request.getParameter("delete");
		String add=request.getParameter("add");
		String update=request.getParameter("update");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
