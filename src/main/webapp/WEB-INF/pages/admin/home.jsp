<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<p><a href="<c:url value="/test"/>">Создать тест</a></p>
<p><a href="<c:url value="/user"/>">Создать пользователя</a></p>
<p><a href="<c:url value="/statistic"/>">Статистика</a></p>
<p><a href="<c:url value="/logout"/>"><input type="button" value="Выйти"></a></p>


</body>
</html>
