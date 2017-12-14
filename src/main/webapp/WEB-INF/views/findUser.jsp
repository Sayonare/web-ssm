<%--
  Created by IntelliJ IDEA.
  User: wyz_Sayonare
  Date: 2017/10/24
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ssm</title>
</head>
<body>
<h1>findUser</h1>
<table border="1">
    <c:forEach items="${users}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.username}</td>
            <td>${u.birthday}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
