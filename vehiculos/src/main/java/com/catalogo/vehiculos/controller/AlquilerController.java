package com.catalogo.vehiculos.controller;

import com.catalogo.vehiculos.exceptions.VehiculoNotFoundException;
import com.catalogo.vehiculos.models.Alquiler;
import com.catalogo.vehiculos.repository.AlquilerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class AlquilerController {
    private final AlquilerRepository alquilerRepository;

    public AlquilerController(AlquilerRepository alquilerRepository) {
        this.alquilerRepository = alquilerRepository;
    }

    @GetMapping("/alquiler")
    public List<Alquiler> listAllAlquiler() {
        return alquilerRepository.findAll();
    }

    @GetMapping("/alquiler/{id}")
    Alquiler getAlquiler (@PathVariable String id ){
        return alquilerRepository.findById(id).orElseThrow(() -> new VehiculoNotFoundException("No se encontró alquiler con el id: " + id));
    }

    @PostMapping("/alquilar")
    Alquiler newAlquiler (@RequestBody Alquiler alquiler){
        return alquilerRepository.save(alquiler);
    }

    @PutMapping("/alquilerActualizar/{id}")
    Alquiler updateAlquiler (@RequestBody Alquiler alquiler){
        return alquilerRepository.save(alquiler);
    }

    @DeleteMapping("/alquilerCancelar/{id}")
    void deleteAlquiler (@PathVariable String id){
        alquilerRepository.deleteById(id);
    }

}
