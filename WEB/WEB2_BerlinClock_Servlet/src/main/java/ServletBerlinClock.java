import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletBerlinClock extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html; charset=utf-8");
            PrintWriter pw = response.getWriter();


            pw.println("<html><head><title>Clock App</title></head>");
            pw.println("<body>");
            pw.println("<p>Berlin Clock Servlet App</p>");
            pw.println("<p3>Program which take time in format: hh:mm:ss and return Lights of Berlin Clock (red, yellow, off)</p3>");
            pw.println("<form method=\"post\">");
            pw.println("<input name=\"textTime\" /> <input type=\"submit\" value=\"OK\" />");
            pw.println("</form");
            pw.println("</body></html>");
        } catch (IOException e) {}
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter pw = response.getWriter();
        BerlinClock clock = new BerlinClock();

        String inputTime = request.getParameter("textTime");
        String Lights = clock.convertTime(inputTime);
        pw.println(Lights);
    }
}
