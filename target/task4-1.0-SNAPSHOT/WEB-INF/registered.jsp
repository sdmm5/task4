<%@ page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>注册用户</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
</head>

<body style="font-size:30px">
<form action="/registered" method="get">
    <fieldset>
        <legend>注册用户</legend>
        用户名：<input name="user_name"><br>
        密码：<input name="user_password"><br>
        <input type="submit" value="确定">
    </fieldset>
</form>
</body>
</html>