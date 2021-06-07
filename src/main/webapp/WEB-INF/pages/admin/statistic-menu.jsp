<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Statistics Menu</title>
</head>
<body>
<p><a href="<c:url value="/statistic/test-statistic"/>">Статистика по тесту</a></p>
<p><a href="<c:url value="/statistic/question-statistic"/>">Статистика по вопросу</a></p>
<p><a href="<c:url value="/statistic/user-statistic"/>">Статистика пользователей</a></p>
<p><button type="button" value="/admin/statistic-menu" onclick="window.history.back()">Назад</button></p>

</body>
</html>