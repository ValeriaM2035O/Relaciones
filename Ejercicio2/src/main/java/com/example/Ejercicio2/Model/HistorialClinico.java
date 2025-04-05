package com.example.Ejercicio2.Model;

import jakarta.persistence.*;

@Entity
public class HistorialClinico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHistorialClinico;
    private String diagnostico;
    private String tratamiento;

    @OneToOne
    @JoinColumn(name ="idPaciente", unique = true)
    private Pacientes pacientes;

    public HistorialClinico() {
    }

    public HistorialClinico(int idHistorialClinico, String diagnostico, String tratamiento, Pacientes pacientes) {
        this.idHistorialClinico = idHistorialClinico;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.pacientes = pacientes;
    }

    public int getIdHistorialClinico() {
        return idHistorialClinico;
    }

    public void setIdHistorialClinico(int idHistorialClinico) {
        this.idHistorialClinico = idHistorialClinico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "HistorialClinico{" +
                "idHistorialClinico=" + idHistorialClinico +
                ", diagnostico='" + diagnostico + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", pacientes=" + pacientes +
                '}';
    }
}
