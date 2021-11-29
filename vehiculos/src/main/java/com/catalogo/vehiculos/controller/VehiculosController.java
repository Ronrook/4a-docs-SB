package com.catalogo.vehiculos.controller;

import com.catalogo.vehiculos.exceptions.VehiculoNotFoundException;
import com.catalogo.vehiculos.models.Vehiculos;
import com.catalogo.vehiculos.repository.VehiculosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Clase controlador de Vehiculos 
@RestController
public class VehiculosController {

    private final VehiculosRepository vehiculosRepository;

    public VehiculosController (VehiculosRepository vehiculosRepository){
        this.vehiculosRepository = vehiculosRepository;
    }

    // Metodo GET para recuperar vehiculo por su ID
    @GetMapping("/vehiculos/{id}")
    Vehiculos getVehiculos (@PathVariable String id ){
        return vehiculosRepository.findById(id).orElseThrow(() -> new VehiculoNotFoundException("No se encontro vehiculo con el id: " + id));
    }
     // Metodo POST para crear un vehiculo 
    @PostMapping("/nuevoVehiculo")
    Vehiculos newVehiculo (@RequestBody Vehiculos vehiculos){
        return vehiculosRepository.save(vehiculos);
    }

     // Metodo PUT para actualizar un vehiculo
    @PutMapping("/actualizarVehiculo/{id}")
    Vehiculos updateVehiculo (@RequestBody Vehiculos vehiculos){
        return vehiculosRepository.save(vehiculos);
    }
    // Metodo DELETE para eliminar vehiculo 
    @DeleteMapping ("/eliminarVehiculo/{id}")
    void deleteVehiculo (@PathVariable String id){
        vehiculosRepository.deleteById(id);
    }
    // Metodo GET para recuperar todos los vehiculos del inventario
    @GetMapping ("/vehiculos")
    public List<Vehiculos> listAllVehiculos() {
        return vehiculosRepository.findAll();
    }

}
