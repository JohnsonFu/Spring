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
<form:form commandName="book" action="book_save" method="post">
    <label>添加书籍</label><br>
    <label for="name">书名</label>
    <form:input id="name" path="name"/><br>
    <label for="author">作者</label>
    <form:input id="author" path="author"/><br>
    <label for="price">价格:</label>
    <form:input id="price" path="price"/><br>
    <input type="submit" value="提交" >

</form:form>
</body>
</html>
