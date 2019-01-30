<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
<div class="row" style="width: 1210px; margin: 0 auto;">
    <div class="col-md-12">
        <a href="#">用户：${user.name}</a>
    </div>
    <div class="col-md-12">
         <a href="showCar?userId=${user.ID}">购物车</a>
    </div>
    <div class="col-md-12">
        <a href="jiesuan?userId=${user.ID}">结算</a>
    </div>
    <c:forEach items="${productList}" var="test" varStatus="status" step="1">
        <div class="col-md-2" style="height:250px">
            <a href="showProduct?productId=${productList[status.index].ID}&userId=${user.ID}"> <img src="${productList[status.index].picUrl}"
                                  width="170" height="170" style="display: inline-block;">
            </a>
            <p>
                <a href="showProduct?productId=${productList[status.index].ID}&userId=${user.ID}" style='color: green'>${productList[status.index].name}</a>
            </p>
            <p>
                <font color="#FF0000">商城价：￥${productList[status.index].price}</font>
            </p>
        </div>
    </c:forEach>
</div>
</body>
</html>