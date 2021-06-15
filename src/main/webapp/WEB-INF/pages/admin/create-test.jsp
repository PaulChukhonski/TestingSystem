<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <title>Create Test</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="<c:url value="../../../resources/assets/favicon.ico"/>"/>
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="<c:url value="../../../resources/css/styles.css"/>" type="text/css" rel="stylesheet"/>
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

        <c:if test="${msg != null}">
            <p>${msg}</p>
        </c:if>

        <form:form cssClass="form" modelAttribute="topic" name="myForm" action="/admin/test" method="post"
                   onsubmit="return(validateTest())">

            <p><form:label cssClass="form-label" path="name">Название темы:
                <form:input cssClass="form-check-inline" id="topic" list="option-topic" path="name"
                            onchange="pullTests()"/>
            </form:label>
                <datalist id="option-topic">
                    <c:forEach var="topicEach" items="${topics}" varStatus="i">
                    <option value="${topicEach.name}">
                        </c:forEach>
                </datalist>
            </p>

            <p><form:label cssClass="form-label" path="tests[0].name">Название теста:
                <form:input cssClass="form-check-inline" id="test" list="option-test" path="tests[0].name"/>
            </form:label></p>
            <datalist id="option-test">
                <div id="insert"></div>
            </datalist>
            <p><input class="btn" type="button" value="Назад" onclick="window.location.href='/admin'"/>
                <input class="btn" type="submit" value="Создать"></p>

        </form:form>
    </div>
</div>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="<c:url value="../../../resources/js/scripts.js"/>"></script>
</body>
</html>