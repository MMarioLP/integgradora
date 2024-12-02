package com.gestion.utng.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.utng.models.ResultadoModel;


@Repository
public interface ResultadoRepository extends CrudRepository <ResultadoModel , Long> {
    public abstract ArrayList <ResultadoModel> findByNumcarrera(Long numcarrera);
}
