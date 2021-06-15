<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <meta name="description" content="" />
  <meta name="author" content="" />
  <title>Question Statistic</title>
  <!-- Favicon-->
  <link rel="icon" type="image/x-icon" href="<c:url value="../../assets/favicon.ico"/>"/>
  <!-- Core theme CSS (includes Bootstrap)-->
  <link href="<c:url value="../../../resources/css/styles.css"/>" type="text/css" rel="stylesheet" />

</head>
<body>
<!-- Responsive navbar-->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container">
    <a class="navbar-brand" href="/admin">Testing System</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
        <li class="nav-item"><a class="nav-link" aria-current="page" href="<c:url value="/admin/statistic/test-statistic"/>">Статистика по тесту</a></li>
        <li class="nav-item"><a class="nav-link active" href="<c:url value="/admin/statistic/question-statistic"/>">Статистика по вопросу</a></li>
        <li class="nav-item"><a class="nav-link" href="<c:url value="/admin/statistic/user-statistic"/>">Статистика пользователей</a></li>
      </ul>
    </div>
  </div>
  </div>
</nav>
<!-- Page content-->
<div class="container">
  <div class="text-center mt-5">

    <table class="table">
      <tr>
        <th>Название вопроса</th>
        <th>Пройдено всего</th>
        <th>Процент прав.ответов</th>
      </tr>
      <c:forEach items="${questionStatistic}" var="question" varStatus="status">
        <tr>
          <td>${question.description}</td>
          <td>${question.numberOfPassesOfQuestion}</td>
          <td><fmt:formatNumber type="percent" maxIntegerDigits="3" minFractionDigits="1" value="${question.percentageOfCorrectAnswers}"/></td>
        </tr>
      </c:forEach>
    </table>
    <input class="btn" type="button" value="Назад в меню" onclick="window.location.href='/admin'">
  </div>
</div>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="<c:url value="../../js/scripts.js"/>"></script>
</body>
</html>
