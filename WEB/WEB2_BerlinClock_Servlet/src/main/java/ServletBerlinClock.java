import Berlin.BerlinClock;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletBerlinClock extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String input = request.getParameter("input");

        BerlinClock clock = new BerlinClock();
        String output = clock.convertTime(input);

        PrintWriter pw = response.getWriter();
        pw.println(output);
    }
}
