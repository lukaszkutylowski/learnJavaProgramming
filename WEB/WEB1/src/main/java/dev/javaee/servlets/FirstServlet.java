//delete package line before mvn compile - path in Apache Tomcat is different
package dev.javaee.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        try {
            res.setContentType("text/html; charset=utf-8");
            PrintWriter pw = res.getWriter();
            pw.println("<html><head><title>First Servlet App!</title></head>");
            pw.println("<body>");
            pw.println("<p>first line: message 1</p>");
            pw.println("<p>second line: message 2</p>");
            pw.println("</body></html>");
        } catch (IOException e) {}

    }
}
