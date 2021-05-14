<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
    <a href="<c:url value="/logout"/>"> Exit</a>
    <h1>Hello ${user}</h1>
</body>
</html>
