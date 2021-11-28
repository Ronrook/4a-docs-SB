package com.grupo2.vehiculos.models;


import org.springframework.data.annotation.Id;

import java.util.List;

public class Vehiculos {

    @Id
    private String id;
    private String nombre;
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private String cilindraje;
    private boolean fullEquipo;
    private String image_URL;
    private String transmision;
    private String categoria;
    private double tarifa;
    private boolean disponible;


    // el method constructor de la clase Vehiculo

    public Vehiculos(String id, String nombre, String placa, String marca, String modelo, String color, String cilindraje, boolean fullEquipo, String image_URL, String transmision, String categoria, double tarifa, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
        this.fullEquipo = fullEquipo;
        this.image_URL = image_URL;
        this.transmision = transmision;
        this.categoria = categoria;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }


    // metodos ‘get’ de la clase Vehiculo

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public boolean isFullEquipo() {
        return fullEquipo;
    }

    public String getImage_URL() {
        return image_URL;
    }

    public String getTransmision() {
        return transmision;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }


    // metodos 'set' de la clase Vehiculo


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFullEquipo(boolean fullEquipo) {
        this.fullEquipo = fullEquipo;
    }

    public void setImage_URL(String image_URL) {
        this.image_URL = image_URL;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
