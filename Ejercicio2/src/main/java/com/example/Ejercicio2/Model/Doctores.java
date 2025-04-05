package com.example.Ejercicio2.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Doctores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDoctor;
    private String nombre;
    private String apellidos;
    private int telefono;
    private String correo;

    @OneToMany(mappedBy = "doctores")
    private List<Citas> citas;

    @ManyToOne
    @JoinTable(
            name="especialidadDoctor",
            joinColumns = @JoinColumn(name ="idDoctor"),
            inverseJoinColumns = @JoinColumn(name ="idEspecialidad")

    )
    private List <Especialidad> especialidads;

    public Doctores() {
    }

    public Doctores(int idDoctor, String nombre, String apellidos, int telefono, String correo, List<Citas> citas, List<Especialidad> especialidads) {
        this.idDoctor = idDoctor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.citas = citas;
        this.especialidads = especialidads;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
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

    public List<Citas> getCitas() {
        return citas;
    }

    public void setCitas(List<Citas> citas) {
        this.citas = citas;
    }

    public List<Especialidad> getEspecialidads() {
        return especialidads;
    }

    public void setEspecialidads(List<Especialidad> especialidads) {
        this.especialidads = especialidads;
    }

    @Override
    public String toString() {
        return "Doctores{" +
                "idDoctor=" + idDoctor +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", citas=" + citas +
                ", especialidads=" + especialidads +
                '}';
    }
}
