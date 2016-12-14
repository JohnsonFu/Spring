<%--
  Created by IntelliJ IDEA.
  User: fulinhua
  Date: 2016/12/10
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Book Form</title>
</head>
<body>
<form:form  action="book_save" method="post">
    <label>添加书籍</label><br>
    <label >书名</label>
    <input type="text" id="name" name="name"/><br>
    <label >作者</label>
    <input type="text" id="author" name="author"/><br>
    <label >价格:</label>
    <input input type="text" id="price" name="price"/><br>
    <input type="submit" value="提交" >

</form:form>
</body>
</html>
