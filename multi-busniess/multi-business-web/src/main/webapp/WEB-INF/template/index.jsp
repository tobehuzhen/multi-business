<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="<c:out value="${rootAppPath}"></c:out>/asserts/js/default.js"></script>
</head>
<body>
<button onclick="doTimeout()">click me</button>
<c:out value="${tag}"></c:out>

</body>
</html>