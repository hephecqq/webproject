<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>美丽商场</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
<c:set scope="session" var="count" value="1"></c:set>
<div class="containter">
	<div class="row">
 		 <div class="col-md-1"><a class="btn btn-success" href="${pageContext.request.contextPath}/searchServlet?display=all" role="button">显示所有</a></div>
 		 <div class="col-md-1"><a class="btn btn-success" href="${pageContext.request.contextPath}/searchServlet?display=new" role="button">最新商品</a></div>
 		 <div class="col-md-1"><a class="btn btn-success" href="${pageContext.request.contextPath}/searchServlet?display=sort" role="button">排序</a></div>
 		 <div class="col-md-1"><a class="btn btn-success" href="${pageContext.request.contextPath}/searchServlet?display=login" role="button">登录</a></div>
	</div>
</div>
${requestScope.commlist}
${sessionScope.count}
</body>
</html>