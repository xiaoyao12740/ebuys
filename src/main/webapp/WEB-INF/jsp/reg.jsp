<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/9/10
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<div id="register" class="wrap">
  <div class="shadow">
    <em class="corner lb"></em>
    <em class="corner rt"></em>
    <div class="box">
      <h1>欢迎注册易买网</h1>
      <ul class="steps clearfix">
        <li class="current"><em></em>填写注册信息</li>
        <li class="last"><em></em>注册成功</li>
      </ul>
      <form id="regForm" method="post" action="doReg" onsubmit="return checkForm(this);">
        <table>
          <tr>
            <td class="field">用户名：</td>
            <td><input class="text" type="text" name="eu_login_name" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
          </tr>
          <tr>
            <td class="field">登录密码：</td>
            <td><input class="text" type="password" id="passWord" name="eu_password" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
          </tr>
          <tr>
            <td class="field">确认密码：</td>
            <td><input class="text" type="password" name="rePassWord" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
          </tr>
          <tr>
            <td class="field">用户姓名：</td>
            <td><input class="text" type="text" name="eu_user_name" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
          </tr>
          <tr>
            <td class="field">性别：</td>
            <td><input class="text" type="radio" name="eu_sex" value="男"  />男
              <input class="text" type="radio" name="eu_sex"  value="女"/>女
              <span></span></td>
          </tr>
<%--          <tr>
            <td class="field">出生日期：</td>
            <td><input class="text" type="text" name="eu_birthday" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
          </tr>--%>
          <tr>
            <td class="field">身份证号：</td>
            <td><input class="text" type="text" name="eu_identity_code" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
          </tr>
          <tr>
            <td class="field">邮箱：</td>
            <td><input class="text" type="text" name="eu_email" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
          </tr>

          <tr>
            <td class="field">电话：</td>
            <td><input class="text" type="text" name="eu_mobile" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
          </tr>
          <tr>
            <td class="field">地址：</td>
            <td><input class="text" type="text" name="eu_address" onfocus="FocusItem(this)" onblur="CheckItem(this);" /><span></span></td>
          </tr>

          <input type="hidden" name="eu_status" value="1"/>
          <input type="hidden" name="eu_role" value="2"/>

          <tr>
            <td></td>
            <td><label class="ui-green"><input type="submit" name="submit" value="提交注册" /></label>


            </td>
          </tr>
          <tr>

            <td colspan="2">
              <label style="color:red">${MSG}</label>
            </td>
          </tr>
        </table>
      </form>
    </div>
  </div>
  <div class="clear"></div>
</div>
<%@include file="footer.jsp"%>
</body>
</html>
