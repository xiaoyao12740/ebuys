<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/9/13
  Time: 8:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    您现在的位置：<a href="home">易买网</a> &gt; <a href="#">---</a> &gt; 图书
</div>
<div id="main" class="wrap">

    <div class="main">
        <div class="product-list">
            <h2>全部商品</h2>
            <div class="pager">
                <ul class="clearfix">
                    <li><a href="selectProductByCategory?eid=${param.eid}&page=1">首页</a></li>
                    <c:if test="${param.page==1}">
                        <li><a href="selectProductByCategory?eid=${param.eid}&page=${param.page}">上一页</a></li>
                    </c:if>
                    <c:if test="${param.page>1}">
                        <li><a href="selectProductByCategory?eid=${param.eid}&page=${param.page-1}">上一页</a></li>
                    </c:if>
                    <li><a href="selectProductByCategory?eid=${param.eid}&page=${pageInfo.nextPage}">下一页</a></li>
                    <li><a href="selectProductByCategory?eid=${param.eid}&page=${pageInfo.pages}">末页</a></li>
                </ul>
            </div>
            <div class="clear"></div>
            <ul class="product clearfix">
                <c:forEach items="${pageInfo.list}" var="p">
                    <li>
                        <dl>
                            <dt><a href="product-view?id=${p.id}" target="_blank"><img src="${p.ep_file_name}" /></a></dt>
                            <dd class="title"><a href="product-view?id=${p.id}" target="_blank">${p.ep_name}</a></dd>
                            <dd class="price">￥${p.ep_price}</dd>
                        </dl>
                    </li>
                </c:forEach>
                <%--<li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/1.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">法国德菲丝松露精品巧克力500g/盒</a></dd>
                        <dd class="price">￥108.0</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/2.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">乐扣普通型保鲜盒圣诞7件套</a></dd>
                        <dd class="price">￥69.90</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/3.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">欧珀莱均衡保湿四件套</a></dd>
                        <dd class="price">￥279.0</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/4.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">联想笔记本电脑 高速独立显存</a></dd>
                        <dd class="price">￥4199</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/5.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">法姿韩版显瘦彩边时尚牛仔铅笔裤</a></dd>
                        <dd class="price">￥49.00</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/6.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">Genius925纯银施华洛世奇水晶吊坠</a></dd>
                        <dd class="price">￥69.90</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/7.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">利仁2018M福满堂电饼铛 好用实惠</a></dd>
                        <dd class="price">￥268.0</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/8.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">达派高档拉杆箱20寸 经典款式</a></dd>
                        <dd class="price">￥198.0</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/9.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">爱国者MP4 全屏触摸多格式播放 4G</a></dd>
                        <dd class="price">￥289.0</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/10.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">多美滋金装金盾3阶段幼儿配方奶粉</a></dd>
                        <dd class="price">￥186.0</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/1.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">法国德菲丝松露精品巧克力500g/盒</a></dd>
                        <dd class="price">￥108.0</dd>
                    </dl>
                </li>
                <li>
                    <dl>
                        <dt><a href="product-view.html" target="_blank"><img src="images/product/2.jpg" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">乐扣普通型保鲜盒圣诞7件套</a></dd>
                        <dd class="price">￥69.90</dd>
                    </dl>
                </li>--%>
            </ul>
            <div class="clear"></div>
            <div class="pager">
                <ul class="clearfix">
                    <li><a href="selectProductByCategory?eid=${param.eid}&page=1">首页</a></li>
                    <c:if test="${param.page==1}">
                        <li><a href="selectProductByCategory?eid=${param.eid}&page=${param.page}">上一页</a></li>
                    </c:if>
                    <c:if test="${param.page>1}">
                        <li><a href="selectProductByCategory?eid=${param.eid}&page=${param.page-1}">上一页</a></li>
                    </c:if>
                    <li><a href="selectProductByCategory?eid=${param.eid}&page=${pageInfo.nextPage}">下一页</a></li>
                    <li><a href="selectProductByCategory?eid=${param.eid}&page=${pageInfo.pages}">末页</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="clear"></div>
</div>
<%@include file="footer.jsp"%>
</body>
</html>
