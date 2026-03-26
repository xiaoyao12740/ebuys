<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/9/10
  Time: 8:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="header" class="wrap">
    <div id="logo"><img src="images/logo.gif" /></div>
    <div class="help"><a href="#" class="shopping">购物车</a>

        <c:if test="${sessionScope.USERS==null}">
            <a href="login">登录</a><a href="toReg">注册</a>
        </c:if>
        <c:if test="${sessionScope.USERS!=null}">
            欢迎您 ${sessionScope.USERS.eu_user_name}
        </c:if>

        <a href="guestbook.html">留言</a></div>
    <div class="navbar">
        <ul class="clearfix">
            <li class="current"><a href="#">首页</a></li>
            <li><a href="#">图书</a></li>
            <li><a href="#">百货</a></li>
            <li><a href="#">品牌</a></li>
            <li><a href="#">促销</a></li>
        </ul>
    </div>
</div>