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
    <input id="inp" type="number" name="number">
</div>
<div class="oprt f-cb">
</div>
<input type="button" value="添加购物车" id="btn">
<script>
    var test = document.getElementById("inp");
    var btn = document.getElementById("btn");
    btn.onclick = function(){
       // alert(test.value)
        window.location.href="addProductToCar?userId=${userId}&productId=${productId}&productNum="+test.value;
    }
</script>
</body>
</html>