package com.grupo2.vehiculos.exceptions;

public class VehiculoNotFoundException extends RuntimeException {
    public VehiculoNotFoundException (String message) {
        super(message);
    }

}
