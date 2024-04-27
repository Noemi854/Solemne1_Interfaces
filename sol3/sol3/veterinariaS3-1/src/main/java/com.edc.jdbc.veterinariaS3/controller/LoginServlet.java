package com.edc.jdbc.veterinariaS3.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    final static String RUT = "12345";
    final static String CONTRASEÑA = "12345";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String rutlogin = req.getParameter("rutlogin");
        String passwordlogin = req.getParameter("passwordlogin");

        if (RUT.equals(rutlogin) && CONTRASEÑA.equals(passwordlogin)) {
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("    <head>");
                out.println("        <meta charset=\"UTF-8\">");
                out.println("        <title>Login correcto</title>");
                out.println("    </head>");
                out.println("    <body>");
                out.println("        <h1>Login correcto!</h1>");
                out.println("        <h3> Has iniciado sesión con éxito!</h3>");
                out.println("    </body>");
                out.println("</html>");
            }
        } else {
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "RUT o CONTRASEÑA incorrectos");
        }
    }
}
