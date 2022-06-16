package servlets.http.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import servlets.http.dto.FlightDto;
import servlets.http.service.FlightService;
import servlets.http.util.JspHelper;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

@WebServlet("/content")
public class ContentServlet extends HttpServlet {

    private final FlightService flightService = FlightService.getInstance();

    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<FlightDto> flightDtos = flightService.findAll();
        request.setAttribute("flights", flightDtos);
        request.getSession().setAttribute("flightsMap", flightDtos.stream().collect(toMap(FlightDto::getId, FlightDto::getDescription)));


        request.getRequestDispatcher(JspHelper.getPath("content"))
                .forward(request, response);
    }
}
