package com.gestion.utng.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.utng.models.CarreraModel;
import com.gestion.utng.services.CarreraService;


@CrossOrigin(  origins = {"http://localhost"} )
@RestController
@RequestMapping("/carrera")
public class CarreraController {


    @Autowired
    CarreraService carreraService;
    
    @GetMapping()
    public ArrayList<CarreraModel> obtenerCarrera(){
        return carreraService.obtenerCarrera();
    }

    @PostMapping
    public CarreraModel guardarCarrera(@RequestBody CarreraModel carrera){
        return this.carreraService.guardarCarrera(carrera);
    }

    @GetMapping("/query")
    public ArrayList<CarreraModel> obtenerPorId(@RequestParam("idcarrera") Long idcarrera){
        return this.carreraService.obtenerPorId(idcarrera);
    }

    
}
