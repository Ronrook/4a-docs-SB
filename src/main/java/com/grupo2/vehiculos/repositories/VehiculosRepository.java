package com.grupo2.vehiculos.repositories;

import com.grupo2.vehiculos.models.Vehiculos;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;


// Clase que mapea los datos a la DB
// para hacer las transformaciones de los datos de tipo Json a Objects

public interface VehiculosRepository extends MongoRepository<Vehiculos, String> {
    List<Vehiculos> findByMarca (String marca);
    List<Vehiculos> findByCategoria (String categoria);
    //List<Vehiculos> findByTarifaGreaterThan(double tarifa);
    //List<Vehiculos> findByTarifaLessThan(double tarifa);
}



