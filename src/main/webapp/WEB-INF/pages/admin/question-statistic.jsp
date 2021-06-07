<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Question Statistic</title>
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

<table>
  <tr>
    <th>Название вопроса</th>
    <th>Пройдено всего</th>
    <th>Процент прав.ответов</th>
  </tr>
  <c:forEach items="${questions}" var="question" varStatus="status">
    <tr>
      <td>${question.questionId}</td>
      <td>${question.questionId}</td>
      <td>${question.questionId}</td>
    </tr>
  </c:forEach>
</table>

<p><button type="button" value="/admin/statistic-menu" onclick="window.history.back()">Назад</button></p>
</body>
</html>
