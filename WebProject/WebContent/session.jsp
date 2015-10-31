<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	JavaWEB_HttpSession 概述
 -->
 <%
 	String sessionName=session.getClass().getName();
 	out.println(sessionName);
 	out.println(session.getCreationTime()+"<br/>");
 	out.print(session.getSessionContext()+"<br/>");
 	out.println(session.getLastAccessedTime()+"<br/>");
 	Date date=new Date(session.getLastAccessedTime());
 	out.println(date.getMonth()+1+"<br/>");
 	out.println(session.getMaxInactiveInterval()+"<br/>");
 	out.println(session.getValueNames().toString()+"<br/>");
 	out.println(session.getId()+"<br/>");
 	//JavaWEB_HttpSession 的生命周期
 	/**
 		1.什么时候创建Session对象
 			是否浏览器访问服务器的任何一个JSP或者Servlet，服务器都会创建一个Session对象吗？
 		1.1  
 			若当前jsp或者Servlet是客户端访问的当前WEB应用的第一个资源，且jsp或Servlet
 		的page指令session属性值为false,则服务器就不会为JSP创建session对象
 		1.2 
 			a->b 从a->b传入一个Session对象
 		且其他页面应经创建了Session对象，则当前jsp页面会返回一个会话的
 		HttpSession对象，而不会创建一个新的HttpSession对象
 		session=false表示当前jsp页面禁用session隐含变量
 		但可以使用HttpSession对象，对应Servlet而言,若Servlet是客户端访问的第一个WEB应用的资源
 		则只有调用了request.getSession()或request.getSession(true)才会创建HttpSession对象
 		并不是关闭了浏览器就销毁了session对象
 		
 		2.什么时候销毁Session对象
 			1.直接调用HttpSession的invalidate()方法，使HttpSession失效
 			2.超过HttpSession的过期时间也会被销毁
 			3.session.getMaxInactiveInterval();//默认以秒为单位
 			session.setMaxInactiveIntervale();//设置Session最大失效时间
 			还可以在web.xml文件中设置HttpSession的过期时间
 			tomcat-config-web.xml文件中设置
 			<session-timeout></session-timeout>单位为分钟
 			
 		*/
 	
 %>
</body>
</html>