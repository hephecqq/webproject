<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//创建Cookie
	Cookie cookie=new Cookie("name","xx");
	//持久化Cookie	
	cookie.setMaxAge(10000);

	//调用response的addCookie将其传回至浏览器
	response.addCookie(cookie);
	Cookie[] cookies=request.getCookies();
	if(cookies.length>0){
		/**
			持久化Cookie
			会话Cookie:若为0表示立即删除该Cookie，若为负数表示不存储该Cookie,若为正数，表示存储该Cookie为多少毫秒
		*/
		for(Cookie co:cookies){
			System.out.println(co.getName());
			System.out.println(co.getValue());
		}
	}
%>
</body>
</html>