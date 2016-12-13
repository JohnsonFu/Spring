<%--
  Created by IntelliJ IDEA.
  User: fulinhua
  Date: 2016/12/13
  Time: 09:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>编辑书籍</title>
</head>
<body>
<form:form commandName="book" action="/Spring/book_update" method="post">
    <form:hidden path="id"/>
    名称:<form:input path="name"/><br>
    作者:<form:input path="author"/><br>
    价格:<form:input path="price"/><br>
    <input type="submit" value="提交"/>
</form:form>
</body>
</html>
