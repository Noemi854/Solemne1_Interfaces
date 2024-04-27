package com.edc.jdbc.veterinariaS3.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgendarCitaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "jdbc:mysql://localhost:3306/VeterinariaS3";
        String user = "root";
        String password = "123456";

        try {
            // Establecer conexión con la base de datos
            Connection conn = DriverManager.getConnection(url, user, password);

            // Preparar la sentencia SQL
            String sql = "INSERT INTO citas (nombreMascota, especie, raza, edad, servicio, fecha, hora, doctor) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, request.getParameter("nombreMascota"));
            statement.setString(2, request.getParameter("especie"));
            statement.setString(3, request.getParameter("raza"));
            statement.setString(4, request.getParameter("edad"));
            statement.setString(5, request.getParameter("servicio"));
            statement.setString(6, request.getParameter("date"));
            statement.setString(7, request.getParameter("time"));
            statement.setString(8, request.getParameter("doctor"));

            // Ejecutar la sentencia
            statement.executeUpdate();

            // Cerrar la conexión
            statement.close();
            conn.close();

            response.getWriter().println("Cita agendada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Error al agendar la cita.");
        }
    }
}