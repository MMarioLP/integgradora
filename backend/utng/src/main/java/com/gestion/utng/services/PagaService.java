package com.gestion.utng.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.utng.models.PagaModel;
import com.gestion.utng.repositories.PagaRepository;

@Service
public class PagaService {

    @Autowired
    PagaRepository pagaRepository;

    public ArrayList<PagaModel> obtenerPaga(){
        return (ArrayList<PagaModel>)pagaRepository.findAll();
    }

    public PagaModel guardarPaga (PagaModel paga){
        return pagaRepository.save(paga);
    }

    public ArrayList<PagaModel> obtenerPorId(Long id){
        return pagaRepository.findByIdpaga(id);
    }

    public boolean eliminarPaga(Long id){
        try{
            pagaRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
    
}
