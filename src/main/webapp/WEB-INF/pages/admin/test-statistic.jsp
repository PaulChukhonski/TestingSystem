<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Test Statistic</title>
  <style>
    table{
      border: 1px solid black;
      border-collapse: collapse;
    }
    th,td {
      border: 1px solid black;
    }
  </style>
</head>
<body>

<table border="1">
  <tr>
    <th>Название теста</th>
    <th>Пройдено всего</th>
    <th>Процент прав.ответов</th>
  </tr>
  <c:forEach items="${tests}" var="test" varStatus="status">
    <tr>
      <td>${test.name}</td>
      <td>${test.name}</td>
      <td>${test.name}</td>
    </tr>
  </c:forEach>
</table>

<p><button type="button" value="/admin/statistic-menu" onclick="window.history.back()">Назад</button></p>
</body>
</html>
