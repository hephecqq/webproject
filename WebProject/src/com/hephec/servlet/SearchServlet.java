package com.hephec.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hephec.model.Commdities;
import com.hephec.service.CommditiesService;

public class SearchServlet extends HttpServlet {

	static List<Commdities> commlist=null;
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=null;
		session=request.getSession();
		String display=request.getParameter("display");
		//int count=(int) session.getAttribute("count");
		//session.setAttribute("count",count+1);
		
		//System.out.println(display);
		
		switch(display){
			//�������Ĳ�����ALL��ת��ҳ����ʾ������Ʒ,ͬʱ����Ĭ�Ϸ�ҳ��ʽ���з�ҳ
			case "all":
				commlist=CommditiesService.listAll();
				if(commlist!=null){
					System.out.println("all");
					request.setAttribute("commlist", commlist);
					request.getRequestDispatcher("/index.jsp").forward(request, response);
					
				}else{
					request.getRequestDispatcher("/index.jsp").forward(request, response);
					
				}
				break;
			//�������Ĳ�����new,����ʾ������Ʒ��ͬʱת��ҳ����з�ҳ��ʾ
			case "new":
				commlist=CommditiesService.listNew();
				request.setAttribute("commlist", commlist);
				request.getRequestDispatcher("index.jsp").forward(request, response);break;
			default:request.getRequestDispatcher("index.jsp").forward(request, response);	
			
		}
		doPost(request, response);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	}
}
