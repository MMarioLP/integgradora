package com.gestion.utng.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.utng.models.CaballoModel;
import com.gestion.utng.repositories.CaballoRepository;

@Service
public class CaballoService {
    @Autowired
    CaballoRepository caballoRepository;

    public ArrayList<CaballoModel> obtenerCaballo(){
        return (ArrayList<CaballoModel>)caballoRepository.findAll();
    }

    public CaballoModel guardarCaballo (CaballoModel caballo){
        return caballoRepository.save(caballo);
    }

    public ArrayList<CaballoModel> obtenerPorId(Long id){
        return caballoRepository.findByIdcaballo(id);
    }

    public boolean eliminarCaballo(Long id){
        try{
            caballoRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
    
    
}
