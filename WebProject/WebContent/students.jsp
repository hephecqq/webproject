<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<td>ID</td>
		<td>NAME</td>
		<td>Type</td>
		<td>Delete</td>
		<td>Add</td>
		<td>Update</td>
	</tr>
<c:forEach items="${students}" var="stu">
	<tr>
		<td>${stu.id }</td>
		<td>${stu.name }</td>
		<td>${stu.type }</td>
		<td><a href="${ pageContext.request.contextPath}/listAllServlet/delete=${stu.id}">Delete</a></td>
		<td><a href="${ pageContext.request.contextPath}/listAllServlet/add=${stu.id}">Add</a>
		<td><a href="${ pageContext.request.contextPath}/listAllServlet/update=${stu.id }">Update</a></td>
	</tr>
</c:forEach>
</table>
</body>
</html>