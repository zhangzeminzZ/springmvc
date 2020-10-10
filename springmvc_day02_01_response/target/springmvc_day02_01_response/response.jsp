<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2020/1/1
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--String response--%>
<%--<a href="user/testString">testString</a>--%>

<%--void response--%>
<%--<a href="user/testVoid">testString</a>--%>

<%--forword--%>
<%--<a href="user/testForward">testForward</a>--%>

<%--redirect--%>
<%--<a href="user/testRedirect">testRedirect</a>--%>

<button id="btn">发送ajax请求</button>
<script src="js/jquery-3.4.0.js"></script>
<script>
    $(function(){
        $('#btn').click(function(){
            //发送ajax请求
            $.ajax({
                //编写json格式，设置属性和值
                url:"/user/testAjax",
                contentType:"application/json;charset=UTF-8",
                data:"{username:泰思特,password:1234,age:22}",
                dataType:"json",
                type:"POST",
                success:function(data){
                    //data服务器响应的json数据,进行解析
                    alert(data.username);
                    alert(data.password);
                    alert(data.age);
                }
            });
        })
    })
</script>
</body>
</html>
