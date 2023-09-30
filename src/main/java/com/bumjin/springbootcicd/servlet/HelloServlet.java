package com.bumjin.springbootcicd.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="HelloWervlet", urlPatterns = {"/helloget"} )
public class HelloServlet extends HttpServlet {
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        System.out.println("doGet 메소드 호출");
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        response.setContentType("text/html");
        printWriter.println("<html>");
        printWriter.println("<head>hello doGet</head>");
        printWriter.println("<body>do get request</body>");
        printWriter.println("</html>");
    }
}