<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
sessionID:<%=session.getId() %>
<br>
IsNew:<%=session.isNew() %>
<br>
MaxInactiveInterval:<%=session.getMaxInactiveInterval()%>
createTime:<%=session.getCreationTime() %><br>
lastAccessTime<%=session.getLastAccessedTime() %><br>
<%
	Object username=session.getAttribute("username");
	if(username==null){
		username="";
	}
%>
<form action="hello.jsp" method="post">
	username:<input type="text" name="username" value="<%=username%>"/>
	<input type="submit" value="提交">
</form>
<!--
	 禁用Cookie如何使用Session?
	利用url重写机制：
	response.encodeURL("xx");
 -->
 <a href="<%=response.encodeURL("login.jsp")%>">重写登录</a>
</body>
</html>