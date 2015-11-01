package com.hephec.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hephec.model.Customer;

/**
 * Servlet implementation class ProcessStep2
 */
@WebServlet("/processStep2")
public class ProcessStep2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.��ȡ����Ĳ���name,address,cardType,card
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String cardType=request.getParameter("cardType");
		String card=request.getParameter("card");
		Customer customer=new Customer(name,address,cardType,card);
		
		//2.��������Ϣ���뵽HttpSession��
		request.getSession().setAttribute("customer",customer);
		//3.�ض���confirm.jsp
		response.sendRedirect(request.getContextPath()+"/ShoppingCart/confirm.jsp");
	}

}
