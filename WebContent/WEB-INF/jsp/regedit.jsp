<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户注册</title>
</head>
<body>${msg}
<form name="user" action ="/SHS/regedit.action" method="post">
用户名：<input type="text" name="user.username" value="${user.username}"/><br>
密     码：<input type="password" name="user.password" value="${user.password}"/><br>
<input type="submit" name="method" value="提交"/>
</form>

</body>
</html>