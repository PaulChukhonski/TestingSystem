<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div>
    <div>
        <c:url var="loginUrl" value="/login"/>
        <form action="${loginUrl}" method="post">
            <c:if test="${param.error != null}">
                <div>
                    <p>Invalid username or password.</p>
                </div>
            </c:if>
            <c:if test="${param.logout != null}">
                <div>
                    <p>You've been logout successfully.</p>
                </div>
            </c:if>
            <div>
                <input type="text" id="username" name="username" placeholder="Username" required>
            </div>
            <div>
                <input type="text" id="password" name="password" placeholder="Password" required>
            </div>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
            <input type="submit" value="Enter">
        </form>
    </div>
</div>
</body>
</html>
