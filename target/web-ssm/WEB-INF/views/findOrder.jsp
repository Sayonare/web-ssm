<%--
  Created by IntelliJ IDEA.
  User: wyz_Sayonare
  Date: 2017/10/26
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询订单</title>
</head>
<body>

    <c:forEach items="${orders}" var="o">
        <table>
            <tr>
                <td>${o.id}</td>
                <td>${o.sn}</td>
                <td>${o.remark}</td>
            </tr>
        </table>

    </c:forEach>
</body>
</html>
