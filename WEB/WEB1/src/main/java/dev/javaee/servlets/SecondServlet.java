//delete package line before mvn compile - path in Apache Tomcat is different
package dev.javaee.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class SecondServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        OutputStream os = res.getOutputStream();
        byte[] bufor = loadFile("//home//lukasz//code//learnJavaProgramming//WEB//WEB1//128colors.jpg");
        res.setContentType("image/jpg");
        res.setContentLength(bufor.length);
        res.addHeader("Content-Disposition", "attachement; filename=image.jpg");
        os.write(bufor);
        os.flush();
    }

    private byte[] loadFile(String path) throws IOException {
        File f = new File(path);
        long size = f.length();
        byte[] contain = new byte[(int) size];
        FileInputStream fis = new FileInputStream(f);
        fis.read(contain);
        fis.close();
        return contain;
    }
}
