<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
<div class="row" style="width: 1210px; margin: 0 auto;">
    <div class="col-md-12">
        <a href="#">店家：${user.name}</a>
    </div>
    <div class="col-md-12">
        <a href="addProductPage">增加商品</a>
    </div>
    <c:forEach items="${productList}" var="test" varStatus="status" step="1">
        <div class="col-md-2" style="height:350px">
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
                <font color="#FF0000">销售数量：${productList[status.index].sellNum}</font>
            </p>
            <input type="button" value="修改" id="btnchange${productList[status.index].ID}">
            <input type="button" value="删除" id="btndel${productList[status.index].ID}">
            <script>
                var btnchange = document.getElementById("btnchange${productList[status.index].ID}");
                var btndel = document.getElementById("btndel${productList[status.index].ID}");
                btndel.onclick = function(){
                    // alert(test.value)
                    window.location.href="delProductPage?productId=${productList[status.index].ID}";
                }
                btnchange.onclick = function(){
                    // alert(test.value)
                    window.location.href="changeProductPage?productId=${productList[status.index].ID}";
                }
            </script>
        </div>
    </c:forEach>
</div>
</body>
</html>