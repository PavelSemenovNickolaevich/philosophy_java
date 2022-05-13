package servlets.http.servlet;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet("/cookies")
public class CookieServlet extends HttpServlet {

    private static final String UNIQUE_ID = "userId";
    private static final AtomicInteger counter = new AtomicInteger();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        var cookies = req.getCookies();
        if (cookies == null || Arrays.stream(cookies).filter(cookie -> UNIQUE_ID.equals(cookie.getName()))
                .findFirst()
                .isEmpty()) {
            var cookie = new Cookie(UNIQUE_ID, "1");
            cookie.setPath("/cookies");
            cookie.setMaxAge(15 * 60);
            resp.addCookie(cookie);
            counter.incrementAndGet();
        }
        resp.setContentType("text/html");
        try (var writer = resp.getWriter()) {
            writer.write(counter.get());
        }
    }
}
