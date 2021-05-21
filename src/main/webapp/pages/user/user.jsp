<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
    <p>Приветствуем тебя, ${user}</p>
    <a href="<c:url value="/logout"/>"> Выйти</a>
    <a href="<c:url value="/chooseTest"/>">Выбор темы и теста</a>
    <a href="<c:url value="/personalStatistic"/>">Личная статистика</a>
</body>
</html>
