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
bye:
<%
	session.getAttribute("username");
	session.invalidate();
	response.sendRedirect("login.jsp");
%>

</body>
</html>