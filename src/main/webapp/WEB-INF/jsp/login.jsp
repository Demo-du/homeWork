<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<!--表单提交目标链接和方法post-->
<form action="/showlist" method="post">
    <br><br><br><br><br>

    <center>用户名<input type="text" name="name" placeholder="用户名"> </center>
    <br>
    <br>
    <center>密码<input type="password" name="pswd" placeholder="密码"></center>
    <br>
    <br>
    <center><input type="submit" value="登录"></center>
</form>
</html>