<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/9/13
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>易买网 - 首页</title>
    <link type="text/css" rel="stylesheet" href="css/style.css" />
    <script type="text/javascript" src="scripts/function.js"></script>
    <script type="text/javascript" src="ai/jquery-3.6.0.min.js"></script>

    <script>
        // 敏感词汇列表
        const sensitiveWords = ['不良词汇1', '不良词汇2', '不良词汇3','傻瓜','大傻瓜','傻帽','该死的'];

        // 替换为星号的函数
        function replaceSensitiveWords(text) {
            let replacedText = text;
            sensitiveWords.forEach((word) => {
                // 创建正则表达式，使用全局匹配标志
                const regex = new RegExp(word, 'gi');
                // 将敏感词汇替换为星号
                replacedText = replacedText.replace(regex, '*'.repeat(word.length));
            });
            return replacedText;
        }
        const filteredText = replaceSensitiveWords(originalText);
        function checkec_content(){
            var ec_content=document.getElementById('ec_content').value;
            //  var filteredText = replaceSensitiveWords(ec_content);

            var filteredText = aicheck(ec_content);

            document.getElementById('ec_content').value=filteredText;
            document.getElementById("commentForm").submit();

        }

        function aicheck(content){
            rtnValue='';
            const API_URL = 'https://api.moonshot.cn/v1/chat/completions';
            const API_KEY = 'sk-FLT7GpReb7hKaFuCoTyRqkL8sZt8QBrHfnN9sKdzo3VCP7GR';
            $.ajax({
                url: API_URL,
                method: 'POST',
                async: false,
                headers: {
                    'Content-Type': 'application/json',
                    'Authorization': 'Bearer '+API_KEY
                },
                data: JSON.stringify({
                    "model": "moonshot-v1-8k",
                    "messages": [
                        {"role": "system", "content": "请帮我统一返回文本格式内容"},
                        {"role": "user", "content": content+"。请帮我验证一下上一段话中是否有不文明用语，如果有不文明用语，请帮我用星号代替，返回替换过后的内容，如果没有不文明用语,请直接返回提问的内容 "}
                    ],
                    "stream": false
                }),
                success: function(response,status,xhr) {
                    const answer = response.choices[0].message.content;
                    if(status=='success'){
                        rtnValue=answer;
                    }
                },
                error: function(xhr, status, error) {
                    console.error('API 调用失败:', status, error);
                }
            });
            return rtnValue;
        }


    </script>
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
    您现在的位置：<a href="home">易买网</a> &gt; 在线留言
</div>
<div id="main" class="wrap">
    <div class="main">
        <div class="guestbook">
            <h2>全部留言</h2>
            <ul>
                <c:forEach items="${requestScope.list}" var="c">
                    <li>
                        <dl>
                            <dt>${c.ec_content}</dt>
                            <dd class="author">网友：${c.ec_nick_name} <span class="timer">
                            <fmt:formatDate value="${c.ec_create_time}"  pattern="yyyy-MM-dd HH:mm:ss"/>
                            </span></dd>
                            <dd>${c.ec_reply}</dd>
                        </dl>
                    </li>

                </c:forEach>

            </ul>
            <div class="clear"></div>

            <div id="reply-box">
                <form method="post" id="commentForm" action="saveComment">
                    <table>
                        <tr>
                            <td class="field">昵称：</td>
                            <td><input class="text" type="text" name="ec_nick_name" /></td>
                        </tr>
                        <tr>
                            <td class="field">留言内容：</td>
                            <td><textarea id="ec_content" name="ec_content"></textarea></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><label class="ui-blue"><input type="button" name="button" onclick="checkec_content()" value="提交留言" /></label></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </div>
    <div class="clear"></div>
</div>
<%@include file="footer.jsp"%>
</body>
</html>
