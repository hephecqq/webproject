<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//这四个对象称之为域对象
	request.setAttribute("name", "name");
	pageContext.setAttribute("name", "name");
	session.setAttribute("name", "name");
	application.setAttribute("name", "name");
%>

pageContextAttr:
<%=application.getAttribute("name")%>
sessinAttr:
<%=session.getAttribute("name")
%>
<%=request.getAttribute("name")
%>
<%
	pageContext.getAttribute("name");
%>
</body>
</html>