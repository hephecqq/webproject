package com.hephec.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hephec.model.RandomImageGenerator;

@WebServlet("/randomImageServlet")
public class RandomImageServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
   
	//ͼƬ��ȸ߶�
	private int width=0;
	private int height=0;
	//ͼƬ������ַ�����
	private int randomStrNum=0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//��ȡHttpSession����
		HttpSession session=request.getSession();
		//��ȡ����ַ���
		 String randomStr=RandomImageGenerator.random(randomStrNum);
		 if(null!=session){
			   //���ò���
			   session.setAttribute("randomStr", randomStr);
			   //������Ӧ����,���ͼƬ�ͻ��˲�����
			   response.setDateHeader("Expires", 1L);  
			   response.setHeader("Cache-Control", "no-cache, no-store, max-age=0");
			   response.addHeader("Pragma", "no-cache");
			   response.setContentType("image/jpeg"); 
			   //�����ҳ��
			   RandomImageGenerator.render(randomStr, response.getOutputStream(), width, height);
			   
		 }
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	@Override
	public void init() throws ServletException {
		 //��ȡ���
		  width=Integer.parseInt(this.getInitParameter("width"));
		  //��ȡ�߶�
		  height=Integer.parseInt(this.getInitParameter("height"));
		  //��ȡ����
		  randomStrNum=Integer.parseInt(this.getInitParameter("num"));
	}
	@Override
	public void destroy() {
		
	}
}
