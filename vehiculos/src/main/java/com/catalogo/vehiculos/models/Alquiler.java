package com.catalogo.vehiculos.models;

import org.springframework.data.annotation.Id;


import java.util.Date;

public class Alquiler {
    @Id
    private String id;
    private String username;
    private String vehiculoId;
    private Date fechaInicio;
    private Date fechaFinal;
    private String lugarEntrega;
    private String lugarRegreso;
    /*
    Entidad de alquiler para manejar la aplicacion.
    */
    public Alquiler(String id, String username, String vehiculoId, Date fechaInicio, Date fechaFinal, String lugarEntrega, String lugarRegreso) {
        this.id = id;
        this.username = username;
        this.vehiculoId = vehiculoId;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.lugarEntrega = lugarEntrega;
        this.lugarRegreso = lugarRegreso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(String vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }


    public String getLugarEntrega() {
        return lugarEntrega;
    }

    public void setLugarEntrega(String lugarEntrega) {
        this.lugarEntrega = lugarEntrega;
    }

    public String getLugarRegreso() {
        return lugarRegreso;
    }

    public void setLugarRegreso(String lugarRegreso) {
        this.lugarRegreso = lugarRegreso;
    }


}
