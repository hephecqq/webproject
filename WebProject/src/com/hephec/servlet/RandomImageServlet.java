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
   
	//图片宽度高度
	private int width=0;
	private int height=0;
	//图片上随机字符个数
	private int randomStrNum=0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//获取HttpSession对象
		HttpSession session=request.getSession();
		//获取随机字符串
		 String randomStr=RandomImageGenerator.random(randomStrNum);
		 if(null!=session){
			   //设置参数
			   session.setAttribute("randomStr", randomStr);
			   //设置响应类型,输出图片客户端不缓存
			   response.setDateHeader("Expires", 1L);  
			   response.setHeader("Cache-Control", "no-cache, no-store, max-age=0");
			   response.addHeader("Pragma", "no-cache");
			   response.setContentType("image/jpeg"); 
			   //输出到页面
			   RandomImageGenerator.render(randomStr, response.getOutputStream(), width, height);
			   
		 }
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	@Override
	public void init() throws ServletException {
		 //获取宽度
		  width=Integer.parseInt(this.getInitParameter("width"));
		  //获取高度
		  height=Integer.parseInt(this.getInitParameter("height"));
		  //获取个数
		  randomStrNum=Integer.parseInt(this.getInitParameter("num"));
	}
	@Override
	public void destroy() {
		
	}
}
