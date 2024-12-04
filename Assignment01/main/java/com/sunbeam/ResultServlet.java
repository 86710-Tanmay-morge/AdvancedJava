package com.sunbeam;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sunbeam.pojo.Marks;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {
    private ArrayList<Marks> result;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        result = new ArrayList<>();
        result.add(new Marks("Java Programming", 80.0));
        result.add(new Marks("Web Programming", 85.0));
        result.add(new Marks("Database Technologies", 83.0));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>Result</title></head>");
        out.println("<body>");
        out.println("<h2>Student Marks</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>Subject</th><th>Marks</th></tr>");
        for (Marks m : result) {
            out.printf("<tr><td>%s</td><td>%.2f</td></tr>%n", m.getSubject(), m.getMarks());
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
