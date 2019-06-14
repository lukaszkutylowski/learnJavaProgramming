package dev.javaee.servlets;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.println("<html><head><title>Cookie Servlet</title></head>");
        pw.println("<body>");
        pw.println("<form method=\"post\" >");
        pw.println("<p>Podaj imię</p><input name=\"imie\" /> <input type=\"submit\" value=\"OK\" />");
        pw.println("</form>");
        pw.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter pw = response.getWriter();
        String imie = request.getParameter("imie");

        if (imie != null) {
            Cookie cookie = new Cookie("imie", imie);
            cookie.setMaxAge(60);
            response.addCookie(cookie);
            pw.println("Hello " + imie);
        }
    }
}
