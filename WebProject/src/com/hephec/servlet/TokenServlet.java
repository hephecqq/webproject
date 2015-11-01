package com.hephec.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tokenServlet")
public class TokenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//访问数据库服务器
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		System.out.println(username);
		request.getRequestDispatcher("/token/success.jsp").forward(request, response);
		
	}

}
