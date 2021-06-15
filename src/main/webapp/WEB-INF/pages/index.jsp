<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Index</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="<c:url value="../../assets/favicon.ico"/>"/>
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="<c:url value="../../../resources/css/styles.css"/>" type="text/css" rel="stylesheet" />

</head>
<body>
<!-- Responsive navbar-->
<!-- Page content-->
<div class="container">
    <div class="text-center mt-5">
        <form action="/login" method="post">
            <c:if test="${param.error != null}">
                <div>
                    <p>Неверное имя пользователя или пароль!</p>
                </div>
            </c:if>
            <c:if test="${param.logout != null}">
                <div>
                    <p>Вы вышли из аккаунта успешно.</p>
                </div>
            </c:if>
            <div>
                <input class="form-label" type="text" id="username" name="username" placeholder="Логин" required>
            </div>
            <div>
                <input class="form-label" type="password" id="password" name="password" placeholder="Пароль" required>
            </div>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
            <input class="btn" type="submit" value="Войти">
        </form>
    </div>
</div>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="<c:url value="../../js/scripts.js"/>"></script>
</body>
</html>
