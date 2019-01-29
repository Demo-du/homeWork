<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>商品列表</title>
    <link rel="stylesheet" href="/css/style.css"/>

</head>
<body>
<div class="row" style="width: 1210px; margin: 0 auto;">
    <div class="col-md-12">
        <ol class="breadcrumb">
            <li><a href="#">首页</a></li>
        </ol>
    </div>
    <c:forEach items="${productList}" var="test" varStatus="status" step="1">
        <div class="col-md-2" style="height:250px">
             <a href="login"> <img src="${productList[status.index].picUrl}"
                                   width="170" height="170" style="display: inline-block;">
             </a>
             <p>
                 <a href="login" style='color: green'>${productList[status.index].name}</a>
             </p>
             <p>
                 <font color="#FF0000">商城价：￥${productList[status.index].price}</font>
             </p>
        </div>
    </c:forEach>
</div>
</body>
</html>