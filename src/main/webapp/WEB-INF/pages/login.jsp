<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div>
    <div>
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
                <input type="text" id="username" name="username" placeholder="Логин" required>
            </div>
            <div>
                <input type="password" id="password" name="password" placeholder="Пароль" required>
            </div>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
            <input type="submit" value="Войти">
        </form>
    </div>
</div>
</body>
</html>
