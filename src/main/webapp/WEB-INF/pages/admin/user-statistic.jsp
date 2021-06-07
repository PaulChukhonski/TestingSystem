<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>User Statistic</title>
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
    <th>Ф.И.О</th>
    <th>Название теста</th>
    <th>Пройдено всего</th>
    <th>Процент прав.ответов</th>
  </tr>
  <c:forEach items="${users}" var="user" varStatus="status">
    <tr>
      <td>${user.lastName} ${user.firstName}</td>
      <td>${user.password}</td>
      <td>${user.login}</td>
      <td>${user.role.role}</td>
    </tr>
  </c:forEach>
</table>

<p><button type="button" value="/admin/statistic-menu" onclick="window.history.back()">Назад</button></p>
</body>
</html>
