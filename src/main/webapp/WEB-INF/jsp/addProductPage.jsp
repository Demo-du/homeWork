<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<!--表单提交目标链接和方法post-->
<form action="/addProduct" method="post">
    <br><br><br><br><br>


    <center>商品名<input type="text"  name="name" > </center>
    <br>
    <center>主题<input type="text"   name="topic" > </center>
    <br>
    <center>简介<input type="text"  name="info" > </center>
    <br>
    <center>图片地址<input type="text"  name="picUrl" > </center>
    <br>
    <center>价格<input type="text"  name="price" > </center>
    <br>

    <br>
    <center><input type="submit" value="添加"></center>
</form>
</html>