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

import com.gestion.utng.models.CaballoModel;
import com.gestion.utng.services.CaballoService;

@CrossOrigin(  origins = {"http://localhost"} )
@RestController
@RequestMapping("/caballo")
public class CaballoController {

    @Autowired
    CaballoService caballoService;
    
    @GetMapping()
    public ArrayList<CaballoModel> obtenerCaballo(){
        return caballoService.obtenerCaballo();
    }

    @PostMapping
    public CaballoModel guardarCaballo(@RequestBody CaballoModel caballo){
        return this.caballoService.guardarCaballo(caballo);
    }

    @GetMapping("/query")
    public ArrayList<CaballoModel> obtenerPorId(@RequestParam("idcaballo") Long idcaballo){
        return this.caballoService.obtenerPorId(idcaballo);
    }
    
}
