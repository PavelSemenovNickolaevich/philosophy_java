<%@ page import="servlets.http.service.TicketService" %>
<%@ page import="servlets.http.dto.TicketDto" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: a19150891
  Date: 13.06.2022
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Купленные билеты: </h1>
<ul>
     <%
         Long flightId = Long.valueOf(request.getParameter("flightId"));
         List<TicketDto> tickets = TicketService.getInstance().findAllByFlightId(flightId);
         for (TicketDto ticket  : tickets) {
             out.write(String.format("<li>%s</li>", ticket.getSeatNo()));
         }
     %>
</ul>
</body>
</html>
