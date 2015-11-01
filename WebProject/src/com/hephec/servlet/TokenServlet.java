package com.hephec.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/tokenServlet")
public class TokenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//访问数据库服务器
		request.setCharacterEncoding("utf-8");
		//String token=request.getParameter("token");
		HttpSession session=request.getSession();
		//System.out.println(token);
		
		Object token=session.getAttribute("token");
		String tokenValue=request.getParameter("token");
		System.out.println(token);
		System.out.println(tokenValue);
		
//		String username=request.getParameter("username");
//		System.out.println(username);
//		request.getRequestDispatcher("/token/success.jsp").forward(request, response);
//		
		if(token!=null&&token.equals(tokenValue)){
			session.removeAttribute("token");
			response.sendRedirect(request.getContextPath()+"/token/success.jsp");
			
		}else{
			response.sendRedirect(request.getContextPath()+"/token/index.jsp");
			return;
		}
}

}
