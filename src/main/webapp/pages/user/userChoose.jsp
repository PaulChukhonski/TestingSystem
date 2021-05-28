<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>userChoose</title>
</head>
<body>
    <a href="<c:url value="/logout"/>"> Выйти</a>
    <select name="topic" id="topic">
        <option>Topic 1</option>
        <option>Topic 2</option>
    </select><br>

    <select name="test" id="test">
        <option>Test 1</option>
        <option>Test 2</option>
    </select><br>

    <form action="/goTest">
        <input type="submit" value="Пройти тестирование">
    </form>
</body>
</html>
