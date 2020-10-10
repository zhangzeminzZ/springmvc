<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/12/16
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<h3>入门程序</h3>--%>
<%--<a href="hello">入门程序</a>--%>

<%--出现位置的示例--%>
<%--<a href="account/findAccount">查询账户</a>--%>

<%--请求方式的示例--%>
<%--<a href="account/saveAccount">保存了账户，get请求</a>--%>

<%--<form action="account/saveAccount" method="post">--%>
<%--    <input type="submit" value="保存了账户，post请求">--%>
<%--</form>--%>


<%--请求参数的示例--%>
<%--<a href="account/deleteAccount?accountName=aaa&money>100">删除账户，金额100</a>--%>
<%--<a href="account/deleteAccount?accountName=aaa&money>150">删除账户，金额150</a>--%>


<%--基本类型示例--%>
<%--<a href="account/findAccount?accountId=10&accountName=zhangsan">查询账户</a>--%>

<%--pojo类型示例--%>
<%--<form action="account/saveAccount" method="post">--%>
<%--    账户名称：<input type="text" name="name"><br/>--%>
<%--    账户金额：<input type="text" name="money"><br/>--%>
<%--    账户省份：<input type="text" name="address.provinceName"><br/>--%>
<%--    账户城市：<input type="text" name="address.cityName"><br/>--%>
<%--    <input type="submit" value="保存">--%>
<%--</form>--%>

<%--POJO包含集合类示例--%>
<%--<form action="account/updateAccount" method="post">
    用户名称:<input type="text" name="username"><br/>
    用户密码:<input type="password" name="password"><br/>
    账户 1 名称：<input type="text" name="accounts[0].name" ><br/>
    账户 1 金额：<input type="text" name="accounts[0].money" ><br/>
    账户 2 名称：<input type="text" name="accounts[1].name" ><br/>
    账户 2 金额：<input type="text" name="accounts[1].money" ><br/>
    账户 3 名称：<input type="text" name="accountMap['one'].name" ><br/>
    账户 3 金额：<input type="text" name="accountMap['one'].money" ><br/>
    账户 4 名称：<input type="text" name="accountMap['two'].name" ><br/>
    账户 4 金额：<input type="text" name="accountMap['two'].money" ><br/>
    <input type="submit" value="保存">
</form>--%>


<%--特殊情况之：类型转换问题--%>
<%--    <a href="account/deleteAccount?date=2019-02-03">根据日期删除账户</a>--%>

<%--原始 ServletAPI 作为控制器参数--%>
<%--<a href="account/testServletAPI">测试访问ServletAPI</a>--%>

<%--requestParams 注解的使用--%>
<%--<a href="springmvc/useRequestParam?name=test">requestParam注解</a>--%>



<%--requestbody注解--%>
<%--post请求:--%>
<%--<form action="springmvc/useRequestBody" method="post">
    用户名称:<input type="text" name="username"><br/>
    用户密码:<input type="password" name="password"><br/>
    用户年龄:<input type="text" name="age"><br/>
    <input type="submit" value="保存">
</form>
&lt;%&ndash;get请求&ndash;%&gt;
<a href="springmvc/useRequestBody?body=test">requestBody get请求</a>--%>

<%--PathVariable 注解--%>
<%--<a href="springmvc/usePathVariable/100">PathVariable注解</a>--%>

<%--保存--%>
<%--<form action="springmvc/testRestfulPOST" method="post">
    用户名称：<input type="text" name="username"><br/>
&lt;%&ndash;    <input type="hidden" name="_method" value="POST">&ndash;%&gt;
    <input type="submit" value="保存">
</form>
<hr/>

&lt;%&ndash;更新&ndash;%&gt;
<form action="springmvc/testRestfulPUT/100" method="post">
    用户名称：<input type="text" name="username"><br/>
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="更新">
</form>
<hr/>

&lt;%&ndash;删除&ndash;%&gt;
<form action="springmvc/testRestfulDELETE/100" method="post">
    用户名称：<input type="text" name="username"><br/>
        <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="删除">
</form>
<hr/>


&lt;%&ndash;查询&ndash;%&gt;
<form action="springmvc/testRestfulGET/100" method="post">
    用户名称：<input type="text" name="username"><br/>
        <input type="hidden" name="_method" value="GET">
    <input type="submit" value="查询">
</form>--%>

<%--RequestHeader 注解--%>
<%--<a href="springmvc/useRequestHeader">获取请求消息头</a>--%>
<%--</body>--%>

<%--获取指定cookie名称--%>
<%--<a href="springmvc/useCookieValue">绑定cookie的值</a>--%>

<%--ModelAttribute 注解的基本使用--%>
<%--<a href="springmvc/testModelAttribute?username=test">测试 modelattribute</a>--%>


<%--修改用户信息--%>
<%--<form action="springmvc/updateUser" method="post">
    用户名称:<input type="text" name="username">
    用户年龄:<input type="text" name="age">
    <input type="submit" value="修改">
</form>--%>

<%--SessionAttribute注解的使用--%>
<a href="springmvc/testPut">存入 SessionAttribute</a>
<a href="springmvc/testGet">取出 SessionAttribute</a>
<a href="springmvc/testClean">清除 SessionAttribute</a>
</body>
</html>
