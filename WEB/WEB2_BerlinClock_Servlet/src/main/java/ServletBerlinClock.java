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
            pw.println("<p><h1>Berlin Clock Servlet App</h1></p>");
            pw.println("<p><h3>Program which take time in format: hh:mm:ss and return Lights of Berlin Clock (red, yellow, off)</h3></p>");
            pw.println("<form method=\"post\">");
            pw.println("<h3><input name=\"textTime\" /> <input type=\"submit\" value=\"OK\" /></h3>");
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
