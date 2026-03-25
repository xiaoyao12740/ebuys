<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/9/11
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>易买网 - 首页</title>
    <link type="text/css" rel="stylesheet" href="css/style.css" />
    <script type="text/javascript" src="scripts/function.js"></script>
</head>
<body>
<%@include file="header.jsp"%>
<div id="childNav">
    <div class="wrap">
        <ul class="clearfix">
            <li class="first"><a href="#">音乐</a></li>
            <li><a href="#">影视</a></li>
            <li><a href="#">少儿</a></li>
            <li><a href="#">动漫</a></li>
            <li><a href="#">小说</a></li>
            <li><a href="#">外语</a></li>
            <li><a href="#">数码相机</a></li>
            <li><a href="#">笔记本</a></li>
            <li><a href="#">羽绒服</a></li>
            <li><a href="#">秋冬靴</a></li>
            <li><a href="#">运动鞋</a></li>
            <li><a href="#">美容护肤</a></li>
            <li><a href="#">家纺用品</a></li>
            <li><a href="#">婴幼奶粉</a></li>
            <li><a href="#">饰品</a></li>
            <li class="last"><a href="#">Investor Relations</a></li>
        </ul>
    </div>
</div>
<div id="position" class="wrap">
    您现在的位置：<a href="index">易买网</a> &gt; 阅读新闻
</div>
<div id="main" class="wrap">
    <div class="left-side">
        <div class="news-list">
            <h4>最新公告</h4>
            <ul>
                <c:forEach items="${listGg}" var="news" end="6">
                    <li><a href="getNewsById?newsId=${news.id}" target="_blank">${news.en_title}</a></li>
                </c:forEach>
            </ul>
        </div>
        <div class="spacer"></div>
        <div class="news-list">
            <h4>新闻动态</h4>
            <ul>
                <c:forEach items="${listNews}" var="news" end="6">
                    <li><a href="getNewsById?newsId=${news.id}" target="_blank">${news.en_title}</a></li>
                </c:forEach>
            </ul>
        </div>
    </div>
    <div id="news" class="right-main">
        <h1>${easyBuyNews.en_title}</h1>
        <br/>
        发布时间：
        <fmt:formatDate value="${easyBuyNews.en_create_time}" pattern="yyyy-MM-dd"/>
        <div class="content">
            ${easyBuyNews.en_content}
        </div>
    </div>
    <div class="clear"></div>
</div>
<%@include file="footer.jsp"%>
</body>
</html>
