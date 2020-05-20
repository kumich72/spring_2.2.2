<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%--<jsp:useBean id="cars" class="web.model.Car" scope="page" />--%>
<html>
<head>
    <title>Список машин</title>
</head>
<body>
<h3>Список машин</h3>

<h1>sp-<spring:message code="title" /></h1>
<%--<s:message code="title"></s:message>--%>
<table border="1" cellspacing="0" cellpadding="2">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Number</th>
    </tr>
    <c:forEach items="${cars}" var="car">
        <tr>
            <td>${car.id}</td>
            <td>${car.name}</td>
            <td>${car.number}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
