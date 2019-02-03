<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<!--表单提交目标链接和方法post-->
<form action="/changeProduct" method="post">
    <br><br><br><br><br>

    <center>ID<input type="text" name="ID" value="${product.ID}" style="background:#C0C0C0" readonly  unselectable="on" > </center>
    <br>
    <center>商品名<input type="text" value="${product.name}" name="name" > </center>
    <br>
    <center>主题<input type="text"  value="${product.topic}" name="topic" > </center>
    <br>
    <center>简介<input type="text"  value="${product.info}" name="info" > </center>
    <br>
    <center>图片地址<input type="text" value="${product.picUrl}" name="picUrl" > </center>
    <br>
    <center>价格<input type="text" value="${product.price}" name="price" > </center>
    <br>
    <center>销量<input type="text"  value="${product.sellNum}" name="sellNum" style="background:#C0C0C0" readonly  unselectable="on"> </center>
    <br>
    <br>
    <center><input type="submit" value="修改"></center>
</form>
</html>