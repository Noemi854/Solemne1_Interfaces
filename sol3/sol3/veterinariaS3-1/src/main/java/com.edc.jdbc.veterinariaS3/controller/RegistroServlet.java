package com.edc.jdbc.veterinariaS3.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Register")
public class RegistroServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Obtén los parámetros del formulario
        String name = request.getParameter("name");
        String rut = request.getParameter("rutRegister");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");

        // Aquí puedes realizar operaciones de almacenamiento en la base de datos con los datos recibidos

        // Envía una respuesta al cliente
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Registro Exitoso</title></head>");
        out.println("<body>");
        out.println("<h1>Registro Exitoso</h1>");
        out.println("<p>Nombre: " + name + "</p>");
        out.println("<p>RUT: " + rut + "</p>");
        out.println("<p>Teléfono: " + phone + "</p>");
        out.println("<p>Correo: " + email + "</p>");
        out.println("<p>Contraseña: " + password + "</p>");
        out.println("<p>Dirección: " + address + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
