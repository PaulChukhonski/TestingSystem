<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Home</title>
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
    </div>
</nav>
<!-- Page content-->
<div class="container">
    <div class="text-center mt-5">
        <c:if test="${infoByUser ne null}">
            <p>${infoByUser.toString()}</p>
        </c:if>
        <p ><a href="<c:url value="/admin/test"/>">Создать тест</a></p>
        <p><a href="<c:url value="/admin/user"/>">Создать пользователя</a></p>
        <p><a href="<c:url value="/admin/statistic/test-statistic"/>">Статистика</a></p>
<%--        class="page-link"--%>
        <p><input class="btn" type="button" value="Выйти" onclick="window.location.href='/logout'"/></p>
    </div>
</div>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="<c:url value="../../../resources/js/scripts.js"/>"></script>
</body>
</html>
