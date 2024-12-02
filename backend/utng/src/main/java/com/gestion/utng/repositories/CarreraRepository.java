package com.gestion.utng.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.utng.models.CarreraModel;

@Repository
public interface CarreraRepository  extends  CrudRepository <CarreraModel , Long> {
    public abstract ArrayList <CarreraModel> findByIdcarrera(Long idcarrera );
    
}
