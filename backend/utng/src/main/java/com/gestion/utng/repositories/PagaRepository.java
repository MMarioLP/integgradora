package com.gestion.utng.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.utng.models.PagaModel;


@Repository
public interface PagaRepository extends CrudRepository <PagaModel , Long> {
    public abstract ArrayList <PagaModel> findByIdpaga(Long idpaga);
}

    

