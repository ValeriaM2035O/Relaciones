package com.example.Ejercicio2.Model;

import jakarta.persistence.*;

@Entity
public class Citas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCita;
    private String fecha;
    private String hora;
    private String motivo;

    @ManyToOne
    @JoinColumn(name = "idPaciente")
    private Pacientes pacientes;

    @ManyToOne
    @JoinColumn(name = "idDoctor")
    private Doctores doctores;

    public Citas() {
    }

    public Citas(int idCita, String fecha, String hora, String motivo, Pacientes pacientes, Doctores doctores) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.pacientes = pacientes;
        this.doctores = doctores;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public Doctores getDoctores() {
        return doctores;
    }

    public void setDoctores(Doctores doctores) {
        this.doctores = doctores;
    }

    @Override
    public String toString() {
        return "Citas{" +
                "idCita=" + idCita +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", motivo='" + motivo + '\'' +
                ", pacientes=" + pacientes +
                ", doctores=" + doctores +
                '}';
    }
}
