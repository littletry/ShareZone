<%--
  Created by IntelliJ IDEA.
  User: TryLittle
  Date: 2017/12/1
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Hello World！<<br><br>
    <a href="pathVariableTest/1">测试@PathVariable注解</a><br><br>
    <a href="requestHeaderTest">测试@RequestHeader注解</a><br><br>
    <a href="cookieValueTest">测试@CookieValue注解</a><br><br>
    <hr>
    <h3>测试@ModelAttribute的不同用法</h3>
    <a href="loginForm1">测试@ModelAttribute(value="")注释返回具体类的方法</a><br><br>
    <a href="loginForm2">测试@ModelAttribute注释void返回值的方法</a><br><br>
    <a href="loginForm3">测试@ModelAttribute注释返回具体类的方法</a><br><br>
    <a href="loginForm4">测试@ModelAttribute和@RequestMapping同时注释一个方法</a><br><br>
    <a href="loginForm5">测试@ModelAttribute和@RequestMapping注释一个方法的参数</a><br><br>
</body>
</html>
