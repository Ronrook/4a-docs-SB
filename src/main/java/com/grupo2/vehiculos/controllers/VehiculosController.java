package com.grupo2.vehiculos.controllers;

import com.grupo2.vehiculos.exceptions.VehiculoNotFoundException;
import com.grupo2.vehiculos.models.Vehiculos;
import com.grupo2.vehiculos.repositories.VehiculosRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
public class VehiculosController {


    private final VehiculosRepository vehiculosRepository;


    public VehiculosController (VehiculosRepository vehiculosRepository){
        this.vehiculosRepository = vehiculosRepository;

    }

    @GetMapping("/vehiculo/{id}")
    Vehiculos getVehiculos (@PathVariable String id ){
        return vehiculosRepository.findById(id)
                .orElseThrow(() -> new VehiculoNotFoundException("No se encontro vehiculo con el id: " + id));
    }

    @PostMapping("/nuevoVehiculo")
    Vehiculos newVehiculo (@RequestBody Vehiculos vehiculos){
        return vehiculosRepository.save(vehiculos);
    }


    @PutMapping("/actualizarVehiculo/{id}")
    Vehiculos updateVehiculo (@RequestBody Vehiculos vehiculos){
        return vehiculosRepository.save(vehiculos);
    }

    @DeleteMapping ("/eliminarVehiculo/{id}")
    void deleteVehiculo (@PathVariable String id){
        vehiculosRepository.deleteById(id);
    }

    @GetMapping ("/vehiculos")
    public List<Vehiculos> listAllVehiculos() {
        return vehiculosRepository.findAll();
    }

    @GetMapping ("/marca/{marca}")
    List <Vehiculos> getMarca (@PathVariable String marca ){
        return vehiculosRepository.findByMarca(marca);
    }


    @GetMapping ("/categoria/{categoria}")
    List <Vehiculos> getCategoria (@PathVariable String categoria ){
        return vehiculosRepository.findByCategoria(categoria);
    }
    /*
    @GetMapping("/tarifasMayor/{tarifa}")
    public ResponseEntity<List<Vehiculos>> getVehiculosByGreaterThan (@PathVariable("tarifa") double tarifa) {
        return new ResponseEntity<List<Vehiculos>>(vehiculosRepository.findByTarifaGreaterThan(tarifa), HttpStatus.OK);
    }

    @GetMapping("/tarifasMenor/{tarifa}")
    public ResponseEntity<List<Vehiculos>> getVehiculosLessThan (@PathVariable("tarifa") double tarifa) {
        return new ResponseEntity<List<Vehiculos>>(vehiculosRepository.findByTarifaLessThan(tarifa), HttpStatus.OK);
    }
    */
}






