<%--
  Created by IntelliJ IDEA.
  User: a19150891
  Date: 13.06.2022
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="header.jsp"%>
<div>
    <span>Content. Русский</span>
    <p>Size: ${requestScope.flights.size()}</p>
    <p>Id: ${requestScope.flights[1].id}</p>
    <p>Map Id 2: ${sessionScope.flightsMap[1]}</p>
    <p>JSESSION id: ${cookie["JSESSIONID"]}, unique identifier</p>
    <p>Header: ${header["Cookie"]}, unique identifier</p>
    <p>Param id: ${param.id}, unique identifier</p>
</div>
<%@include file="footer.jsp"%>
</body>
</html>
