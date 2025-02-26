package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class JFAlumno extends JFrame {
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtProfesion;
    private JTextField txtTelefono;
    private JButton btnGuardar;
    private JButton btnCancelar;

    public JFAlumno() {
        setTitle("Formulario de Alumno");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));
        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Edad:"));
        txtEdad = new JTextField(3);
        add(txtEdad);

        add(new JLabel("Profesión:"));
        txtProfesion = new JTextField();
        add(txtProfesion);

        add(new JLabel("Teléfono:"));
        txtTelefono = new JTextField(10);
        add(txtTelefono);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");
        panelBotones.add(btnGuardar);
        panelBotones.add(btnCancelar);
        add(panelBotones);
    }

    public JTextField txtNombre() {
        return txtNombre;
    }

    public JTextField txtEdad() {
        return txtEdad;
    }

    public JTextField txtProfesion() {
        return txtProfesion;
    }

    public JTextField txtTelefono() {
        return txtTelefono;
    }

    public JButton btnGuardar() {
        return btnGuardar;
    }

    public JButton btnCancelar() {
        return btnCancelar;
    }

    public void limpiarFormulario() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtProfesion.setText("");
        txtTelefono.setText("");
    }
}