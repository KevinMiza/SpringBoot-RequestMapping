package com.intecap.sesion3.Model;

public class LibroModel {
    String nombre;
    int paginas;
    String color;

    public LibroModel(String nombre, int paginas, String color){
        this.nombre= nombre;
        this.paginas = paginas;
        this.color = color;
    }

    public LibroModel(String nombre){
        this.nombre = nombre;
    }

    public LibroModel(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
