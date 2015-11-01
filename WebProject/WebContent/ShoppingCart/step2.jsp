<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>Step:请输入寄送地址和信用卡信息:</h4>
<form action="<%=request.getContextPath()%>/processStep2" method="post">
<table border="1">
	<tr>
		<td>寄送信息</td>
	</tr>
	<tr>
		<td>姓名</td>
		<td><input type="text" name="name"></td>
	</tr>
	<tr>
		<td>寄送地址<td>
		<td><input type="text" name="address"></td>
	</tr>
	<tr>
		<td>信用卡信息<td>
		<td><input type="text" name="card"></td>
	</tr>
	<tr>
		<td><input type="radio" name="cardType" value="visa">Visa</td>
		<td><input type="radio" name="cardType" value="master">Master</td>
	</tr>
	<tr>
		<td>卡号<td>
		<td><input type="text" name="cardID"/>
	</tr>
	<tr>
		<td><input type="submit" name="提交"/>
	</tr>
</table>
</form>
</body>
</html>