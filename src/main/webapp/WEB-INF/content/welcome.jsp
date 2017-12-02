<%--
  Created by IntelliJ IDEA.
  User: TryLittle
  Date: 2017/12/1
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
    ${requestScope.message}
    欢迎登陆
    [${requestScope.user.username}]
</body>
</html>
