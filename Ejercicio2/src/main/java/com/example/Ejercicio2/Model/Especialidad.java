package com.example.Ejercicio2.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecialidad;
    private String nombre;

    @ManyToMany(mappedBy = "especialidad")
    private List<Doctores> doctores;

    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String nombre, List<Doctores> doctores) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
        this.doctores = doctores;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Doctores> getDoctores() {
        return doctores;
    }

    public void setDoctores(List<Doctores> doctores) {
        this.doctores = doctores;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "idEspecialidad=" + idEspecialidad +
                ", nombre='" + nombre + '\'' +
                ", doctores=" + doctores +
                '}';
    }
}
