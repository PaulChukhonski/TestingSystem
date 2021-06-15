<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Create User</title>
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

        <form:form cssClass="form" modelAttribute="user" name="myForm2" action="/admin/user" method="post" onsubmit="return(validateUser())">

            <p><form:label cssClass="form-label" path="role">Роль: </form:label>
                <form:select path="role.role">
                    <form:options items="${roles}"/>
                </form:select></p>

            <p><label class="form-label" for="login">Логин: </label>
                <input class="form-check-inline"  value="${user.login}" id="login" name="login" type="text"></p>

            <p><label class="form-label" for="password">Пороль: </label>
                <input value="${user.password}" id="password" name="password" type="password"></p>

            <p><label class="form-label" for="lastName">Фамилия: </label>
                <input class="form-check-inline" value="${user.lastName}" id="lastName" name="lastName" type="text"></p>

            <p><label class="form-label" for="firstName">Имя: </label>
                <input class="form-check-inline" value="${user.firstName}" id="firstName" name="firstName" type="text"></p>

            <p>
                <input class="btn" type="button" value="Назад" onclick="window.location.href='/admin'"/>
                <input class="btn" type="submit"/>
            </p>

        </form:form>
    </div>
</div>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="<c:url value="../../../resources/js/scripts.js"/>"></script>
</body>
</html>
