package com.gestion.utng.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.utng.models.JornadaModel;
import com.gestion.utng.repositories.JornadaRepository;

@Service
public class JornadaService {

    
    @Autowired
    JornadaRepository jornadaRepository;

    public ArrayList<JornadaModel> obtenerJornada(){
        return (ArrayList<JornadaModel>)jornadaRepository.findAll();
    }

    public JornadaModel guardarJornada (JornadaModel jornada){
        return jornadaRepository.save(jornada);
    }

    public ArrayList<JornadaModel> obtenerPorId(Long id){
        return jornadaRepository.findByIdjornada(id);
    }

    public boolean eliminarJornada(Long id){
        try{
            jornadaRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
    
}
