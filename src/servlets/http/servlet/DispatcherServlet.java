package servlets.http.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import servlets.http.dto.UserDto;

import java.io.IOException;

@WebServlet("/dispatcher")
public class DispatcherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         request.getRequestDispatcher("flights")
//                .forward(request, response);

//        request.getRequestDispatcher("flights")
//                .include(request, response);
//
//        var writer = response.getWriter();
//        writer.write("Hello 2");

        response.sendRedirect("/flights");

        System.out.println();
   //     requestDispatcher.forward(request, response);


    }
}
