package com.gestion.utng.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.utng.models.ResultadoModel;
import com.gestion.utng.repositories.ResultadoRepository;

@Service
public class ResultadoService {
    @Autowired
    ResultadoRepository resultadoRepository;

    public ArrayList<ResultadoModel> obtenerResultados(){
        return (ArrayList<ResultadoModel>)resultadoRepository.findAll();
    }

    public ResultadoModel guardarResultado (ResultadoModel resultado){
        return resultadoRepository.save(resultado);
    }

    public ArrayList<ResultadoModel> obtenerPorId(Long id){
        return resultadoRepository.findByNumcarrera(id);
    }

    public boolean eliminarResultado(Long id){
        try{
            resultadoRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
    
}