package com.intecap.sesion3.Model;

public class ProductoModel {
    private String nombre;
    private String color;
    private String cantidad;
    private int idProducto;
    public ProductoModel(int idProducto, String nombre, String color, String cantidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.color = color;
        this.cantidad = cantidad;
    }

    public ProductoModel(){}

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
