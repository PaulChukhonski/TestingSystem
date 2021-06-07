<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create User</title>
</head>
<form:form modelAttribute="user" action="/user" method="post">

    <p><form:label path="role">Роль: </form:label>
        <form:select path="role.role">
            <form:options items="${roles}"/>
        </form:select></p>

    <p><label for="login">Логин: </label>
        <input value="${user.login}" id="login" name="login" type="text"></p>

    <p><label for="password">Пороль: </label>
        <input value="${user.password}" id="password" name="password" type="password"></p>

    <p><label for="lastName">Фамилия: </label>
        <input value="${user.lastName}" id="lastName" name="lastName" type="text"></p>

    <p><label for="firstName">Имя: </label>
        <input value="${user.firstName}" id="firstName" name="firstName" type="text"></p>

    <p>
        <button type="button" value="/admin/statistic-menu" onclick="window.history.back()">Назад</button>
        <input type="submit"/>
    </p>

</form:form>
</body>
</html>