package org.example.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonaDAO implements AutoCloseable {
    private Connection connection;

    public PersonaDAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/AppAlumnos";
            String user = "root";
            String password = "MYSQL2024";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }
    }

    public void insertarPersona(Persona persona) {
        String sql = "INSERT INTO persona (nombre, edad, profesion, telefono) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, persona.getNombre());
            pstmt.setInt(2, persona.getEdad());
            pstmt.setString(3, persona.getProfesion());
            pstmt.setString(4, persona.getTelefono());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al insertar persona", e);
        }
    }

    @Override
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al cerrar la conexión", e);
        }
    }
}