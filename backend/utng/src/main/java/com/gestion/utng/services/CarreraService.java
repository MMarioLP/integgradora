package com.gestion.utng.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.utng.models.CarreraModel;
import com.gestion.utng.repositories.CarreraRepository;

@Service
public class CarreraService {
    
    @Autowired
    CarreraRepository carreraRepository;

    public ArrayList<CarreraModel> obtenerCarrera(){
        return (ArrayList<CarreraModel>)carreraRepository.findAll();
    }

    public CarreraModel guardarCarrera (CarreraModel carrera){
        return carreraRepository.save(carrera);
    }

    public ArrayList<CarreraModel> obtenerPorId(Long id){
        return carreraRepository.findByIdcarrera(id);
    }

    public boolean eliminarCarrera(Long id){
        try{
            carreraRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
    

}
