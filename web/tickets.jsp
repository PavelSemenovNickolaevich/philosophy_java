<%@ page import="servlets.http.service.TicketService" %>
<%@ page import="servlets.http.dto.TicketDto" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
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
