<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--JavaWEB_利用Cookie进行自动登录  -->

	
	<!-- 
		若没有登录，去login.jsp
		若可以获取到请求参数LoginName:则打印出欢迎信息
		从Cookie中读取用户信息：
			若存在打印欢迎信息
			若既没有请求参数，也没有Cookie则重定向到login.jsp
	 		把登录信息存储到Cookie中，并设置cookie的最大时效为30秒
	 -->
	 <%
	 	String name=request.getParameter("name");
	 	if(name!=null&&!name.equals("")){
	 		out.println("Hello"+name);
	 		//下一次直接登录
	 		Cookie cookie=new Cookie("name",name);
	 		cookie.setMaxAge(30);
	 		response.addCookie(cookie);
	 	}else {
	 		Cookie[] cookies=request.getCookies();
	 		if(cookies!=null&&cookies.length>0){
	 			//找到匹配的Cookie
	 			for(Cookie co:cookies){
	 				String cookieName=co.getName();
	 				if(cookieName.equals(name)){
	 					String value=co.getValue();
	 					name=value;
	 				}
	 			}
	 		}
	 	}
	 	if(name!=null){
	 		out.println("hello:"+name);
	 	}else{
	 		response.sendRedirect("login.jsp");
	 	}
	 %>


</body>
</html>