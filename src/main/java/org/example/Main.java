package org.example;

import org.example.Controlador.ControladorAlumno;
import org.example.Modelo.PersonaDAO;
import org.example.Vista.JFAlumno;

public class Main {
    public static void main(String[] args) {
        // Crear la vista
        JFAlumno vista = new JFAlumno();
        vista.setVisible(true);

        // Crear el modelo
        PersonaDAO modelo = new PersonaDAO();

        // Crear el controlador
        new ControladorAlumno(vista, modelo);
    }
}