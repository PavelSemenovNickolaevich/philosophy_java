package servlets.http.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import servlets.http.dto.UserDto;

import java.io.IOException;

@WebServlet("/sessions")
public class SessionServlet extends HttpServlet {

    private static final String USER = "user";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       var session = request.getSession();
       var user = (UserDto) session.getAttribute(USER);
       if (user == null) {
           user = UserDto.builder()
                   .id(25L)
                   .mail("test@gmail.com")
                   .build();

           session.setAttribute(USER, user);
       }

    }
}
