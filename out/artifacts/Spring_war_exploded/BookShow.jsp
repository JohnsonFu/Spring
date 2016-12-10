<%--
  Created by IntelliJ IDEA.
  User: fulinhua
  Date: 2016/12/10
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
<c:forEach items="${books}" var="book">
    ${book.id}--${book.name}--${book.author}--${book.price}
    <br>
</c:forEach>
</head>
<body>

</body>
</html>
