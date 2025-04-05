package com.example.Ejercicio2.Model;

import jakarta.persistence.*;

@Entity
public class Pacientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaciente;
    private String nombre;
    private String apellidos;
    private int edad;
    private int telefono;
    private String correo;

    @OneToOne(mappedBy = "pacientes", cascade = CascadeType.ALL)
    private HistorialClinico historialClinico;

    public Pacientes() {
    }

    public Pacientes(int idPaciente, String nombre, String apellidos, int edad, int telefono, String correo, HistorialClinico historialClinico) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.historialClinico = historialClinico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public HistorialClinico getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(HistorialClinico historialClinico) {
        this.historialClinico = historialClinico;
    }

    @Override
    public String toString() {
        return "Pacientes{" +
                "idPaciente=" + idPaciente +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", historialClinico=" + historialClinico +
                '}';
    }
}
