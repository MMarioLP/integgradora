package com.gestion.utng.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.utng.models.CaballoModel;

@Repository
public interface CaballoRepository extends  CrudRepository <CaballoModel, Long> {
    public abstract ArrayList <CaballoModel> findByIdcaballo(Long idcaballo);

    



    
}
