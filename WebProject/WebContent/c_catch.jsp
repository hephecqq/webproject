<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:catch var="exception">
	<%
		int x=5/0;
	%>
</c:catch>
<c:if test="${exception!=null}">
	<p>The exception is:${exception }<br/>
	<p>The message is:${exception.message }<br/>
</c:if>
</body>
</html>