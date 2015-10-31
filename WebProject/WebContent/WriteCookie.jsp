<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 向客户端浏览器写入Cookie:cookiePath,cookiePathValue -->
<%

	Cookie cookie=new Cookie("cookiePath","CookieValuePath");
	cookie.setPath(request.getContextPath());
	//可以通过setPath来设置Cookie的作用范围，其中/表示站点的根目录
	response.addCookie(cookie);
%>
<a href="cookie2.jsp">Cookie2</a>

<!-- Cookie的作用范围是：	
	可以作用当前的目录和当前的子目录，但不能作用域当前目录的上一级目录
 	希望都能读取则设Cookie的作用范围：
 	
 -->
 <!-- 
 	 JavaWEB_Cookie小结:
 	 
  -->
</body>

</html>