<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>购物车</title>
</head>
<body>
<div class="row" style="width: 1210px; margin: 0 auto;">
    <div class="col-md-12">
        <a href="#">用户：${user.name}的购物车</a>
    </div>

    <c:forEach items="${productList}" var="test" varStatus="status" step="1">
        <div class="col-md-2" style="height:300px">
            <a href="showProduct?productId=${productList[status.index].ID}&userId=${user.ID}"> <img src="${productList[status.index].picUrl}"
                                  width="170" height="170" style="display: inline-block;">
            </a>
            <p>
                <a href="showProduct?productId=${productList[status.index].ID}&userId=${user.ID}" style='color: green'>${productList[status.index].name}</a>
            </p>
            <p>
                <font color="#FF0000">商城价：￥${productList[status.index].price}</font>
            </p>
            <p>
                <font color="#FF0000">数量${productList[status.index].num}</font>
            </p>
        </div>
    </c:forEach>
</div>
</body>
</html>