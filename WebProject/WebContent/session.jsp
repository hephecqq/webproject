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
 		
 	*/
 %>
</body>
</html>