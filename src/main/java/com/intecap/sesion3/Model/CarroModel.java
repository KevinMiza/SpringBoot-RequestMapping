package com.intecap.sesion3.Model;

public class CarroModel {

    String modelo;
    String motor;
    String color;
    int caballosDeFuerza;

    public CarroModel(String modelo, String motor, String color, int caballosDeFuerza){
        this.modelo = modelo;
        this.motor = motor;
        this.color = color;
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public CarroModel(String modelo, String color){
        this.modelo = modelo;
        this.color = color;
    }

    public CarroModel(){}

    public String GetModelo(String modelo){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }
}
