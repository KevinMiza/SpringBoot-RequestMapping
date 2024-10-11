package com.intecap.sesion3.Model;

public class UsuarioModel {
    String nombre;
    String direccion;
    int numeroTelefono;

    String correoElectronico;

    //Constructor
    public UsuarioModel(String nombre, String direccion, int numeroTelefono, String correoElectronico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }

    public UsuarioModel(String nombre, int numeroTelefono){
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    public UsuarioModel(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion(String direccion){
        return this.direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

}
