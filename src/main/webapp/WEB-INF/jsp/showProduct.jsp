<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>product</title>
    <link rel="stylesheet" href="/css/style.css"/>

</head>
<body>
<h2>product</h2>
<div class="col-md-2" style="height:250px">
    <a href="login"> <img src="${product.picUrl}"
                          width="170" height="170" style="display: inline-block;">
    </a>
    <p>
        <a href="login" style='color: green'>${product.name}</a>
    </p>
    <p>
        <font color="#FF0000">商城价：￥${product.price}</font>
    </p>
</div>
<div class="num">购买数量：
    <input type="number" name="number">
</div>
<div class="oprt f-cb">
</div>

</body>
</html>