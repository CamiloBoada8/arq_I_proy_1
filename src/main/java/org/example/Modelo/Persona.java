package org.example.Modelo;

// @author Camilo Boada

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String profesion;
    private String telefono;

    // Constructor vacío
    public Persona() {
    }

    // Constructor con todos los atributos
    public Persona(int id, String nombre, int edad, String profesion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.telefono = telefono;
    }

    // Getters y Setters para cada atributo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método toString para representación en cadena de caracteres
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", profesion='" + profesion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

