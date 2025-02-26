package org.example.Controlador;

import org.example.Modelo.Persona;
import org.example.Modelo.PersonaDAO;
import org.example.Vista.JFAlumno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAlumno {
    private JFAlumno vista;
    private PersonaDAO modelo;

    public ControladorAlumno(JFAlumno vista, PersonaDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;

        // Configurar el evento del botón "Guardar"
        vista.btnGuardar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarPersona();
            }
        });

        // Configurar el evento del botón "Cancelar"
        vista.btnCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.limpiarFormulario();
            }
        });
    }

    private void guardarPersona() {
        // Obtener los datos del formulario
        String nombre = vista.txtNombre().getText();
        String edadTexto = vista.txtEdad().getText();
        String profesion = vista.txtProfesion().getText();
        String telefono = vista.txtTelefono().getText();

        // Validar los datos
        if (nombre.isEmpty() || edadTexto.isEmpty() || profesion.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int edad;
        try {
            edad = Integer.parseInt(edadTexto);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "La edad debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear un objeto Persona con los datos del formulario
        Persona persona = new Persona(0, nombre, edad, profesion, telefono);

        // Guardar la persona en la base de datos
        try {
            modelo.insertarPersona(persona);
            JOptionPane.showMessageDialog(vista, "Persona guardada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Error al guardar la persona: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Limpiar el formulario después de guardar
        vista.limpiarFormulario();
    }
}