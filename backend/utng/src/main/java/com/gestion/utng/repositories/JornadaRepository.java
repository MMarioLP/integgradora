package com.gestion.utng.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.utng.models.JornadaModel;

@Repository
public interface JornadaRepository extends CrudRepository <JornadaModel , Long> {
    public abstract ArrayList <JornadaModel> findByIdjornada(Long idjornada);
    
}
