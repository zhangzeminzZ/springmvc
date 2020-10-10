<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2020/1/2
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<%--<h3>传统方式文件上传</h3>--%>
<%--<form action="user/fileUpload1" method="post" enctype="multipart/form-data">--%>
<%--选择文件：<input type="file" name="upload"/>--%>
<%--    <input type="submit" value="上传">--%>
<%--</form>--%>


<%--<h3>SpringMVC方式文件上传</h3>--%>
<%--<form action="user/fileUpload2" method="post" enctype="multipart/form-data">--%>
<%--    选择文件：<input type="file" name="upload"/>--%>
<%--    <input type="submit" value="上传">--%>
<%--</form>--%>



<h3>跨服务器方式文件上传</h3>
<form action="user/fileupload3" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/>
    <input type="submit" value="上传">
</form>
</body>
</html>
