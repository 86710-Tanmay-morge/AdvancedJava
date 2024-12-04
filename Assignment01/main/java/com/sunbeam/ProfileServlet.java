package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>Profile</title></head>");
        out.println("<body bgcolor='pink'>");
        out.println("<h3>First Name: peater</h3>");
        out.println("<h3>Last Name: parker</h3>");
        out.println("<h3>Qualification: B.Tech in Computer Science</h3>");
        out.println("<h3>College: XYZ College of Engineering</h3>");
        out.println("<h3>Birth Date: 01-01-2000</h3>");
        out.println("</body>");
        out.println("</html>");
    }
}
