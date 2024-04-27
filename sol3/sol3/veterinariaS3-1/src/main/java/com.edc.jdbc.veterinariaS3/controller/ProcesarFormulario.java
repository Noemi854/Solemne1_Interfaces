package com.edc.jdbc.veterinariaS3.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProcesarFormulario")
public class ProcesarFormulario extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obtener los parámetros del formulario
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");

        // Guardar los datos en una clase o hacer cualquier otra operación
        // Aquí, simplemente los mostramos en la consola del servidor
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);

        // Puedes guardar los datos en una clase o base de datos aquí

        // Enviar una respuesta al cliente
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Datos recibidos con éxito.</h2>");
        out.println("<p>Nombre: " + nombre + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("</body></html>");
    }
}
