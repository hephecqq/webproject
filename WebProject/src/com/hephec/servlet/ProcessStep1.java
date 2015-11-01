package com.hephec.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessStep1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.��ȡѡ�е�ͼ����Ϣ
		String[] books=request.getParameterValues("books");
		request.getSession().setAttribute("books", books);
		//2.�ض���step-2.jsp
		response.sendRedirect(request.getContextPath()+"/ShoppingCart/step2.jsp");
	}

}
