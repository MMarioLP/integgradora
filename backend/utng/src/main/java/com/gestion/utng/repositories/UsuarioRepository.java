package com.gestion.utng.repositories;

import java.util.ArrayList;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.utng.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository <UsuarioModel , Long> {
    public abstract ArrayList <UsuarioModel> findByClave(Integer clave);

}
